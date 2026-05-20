package co.edu.ue.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.entitys.Producto;
import co.edu.ue.services.ProductoServiceI;

@RestController
@RequestMapping(value="api")
public class ProductoController {
	
	@Autowired
	ProductoServiceI services;
	
	@GetMapping(value="products", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> getAllProduct(){
		return services.getAllListProducts();
	}
	
	@GetMapping(value="products-id", produces = MediaType.APPLICATION_JSON_VALUE)
	public Optional<Producto> getProductId(@RequestParam("id") int id){
		return services.searchProductByCode(id);
	}
	
	
	@GetMapping(value="products-marca", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> getProductmarca(@RequestParam("marca") String marca){
		return services.searchProductBymarca(marca);
	}
	
	@PostMapping(value="product", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Producto> agregarProducto(@RequestBody Producto producto) {
			return services.addProduct(producto);
		
			
	}
	
	@PutMapping(value="products", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Producto actuaizarProduct(@RequestBody Producto producto){
		return services.upProduct(producto);
	}
	
	@DeleteMapping(value = "product/{codigo}")
	public ResponseEntity<String> deleteProducto(@PathVariable int codigo) {
	    services.removeProductByCode(codigo);
	    return ResponseEntity.ok("Producto eliminado correctamente");
	}


}
