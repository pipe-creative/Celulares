package co.edu.ue.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.entitys.Producto;
import co.edu.ue.jpa.ProductoJpaI;

@Repository
public class ProductoRepository implements ProductoRepositoryI {
	
	@Autowired
	private ProductoJpaI jpa;

	@Override
	public List<Producto> getListProducts() {
		
		return jpa.findAll();
	}

	@Override
	public List<Producto> saveProduct(Producto Product) {
		jpa.save(Product);
		return getListProducts();
	}

	@Override
	public Producto updateProduct(Producto Product) {
		return jpa.save(Product);
	}

	@Override
	public List<Producto> getProductBymarca(String promarca) {
	    return jpa.findProductByproMarca(promarca);
	}

	@Override
	public Optional<Producto> getProductByCode(int code) {
		
		return jpa.findById(code);
	}

	@Override
	public List<Producto> removeByCode(int code) {
	    if (jpa.existsById(code)) {
	        jpa.deleteById(code);
	    } else {
	        throw new RuntimeException("No se encontró el producto con código: " + code);
	    }
	    return getListProducts();
	}
}
