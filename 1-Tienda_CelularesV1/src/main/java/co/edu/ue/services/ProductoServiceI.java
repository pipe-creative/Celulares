package co.edu.ue.services;

import java.util.List;
import java.util.Optional;

import co.edu.ue.entitys.Producto;

public interface ProductoServiceI {

	List<Producto> getAllListProducts();
	List<Producto> addProduct(Producto Product);
	Producto upProduct(Producto Product);
	List<Producto> searchProductBymarca(String marca);
	Optional<Producto> searchProductByCode(int code);
	List<Producto> removeProductByCode(int code);
}
