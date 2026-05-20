package co.edu.ue.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.entitys.Producto;
import co.edu.ue.repository.ProductoRepositoryI;

@Service
public class ProductoService implements ProductoServiceI {


	@Autowired
	ProductoRepositoryI repository;


	@Override
	public List<Producto> getAllListProducts() {
		
		return repository.getListProducts();
	}

	@Override
	public List<Producto> addProduct(Producto Product) {
		//validación por marca y modelo
			System.out.println("dentro del agregar");
			return repository.saveProduct(Product);
		
		

	}

	@Override
	public Producto upProduct(Producto Product) {
		if (repository.getProductBymarca(Product.getProMarca())!= null) {
			return repository.updateProduct(Product);
		}
		return null;
	}

	@Override
	public List<Producto> searchProductBymarca(String marca) {
		
		return repository.getProductBymarca(marca);
	}

	@Override
	public Optional<Producto> searchProductByCode(int code) {
		
		return repository.getProductByCode(code);
	}

	@Override
	public List<Producto> removeProductByCode(int code) {
	    return repository.removeByCode(code);  
	}



}
