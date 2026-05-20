package co.edu.ue.repository;

import java.util.List;
import java.util.Optional;

import co.edu.ue.entitys.Producto;


public interface ProductoRepositoryI {
	
	List<Producto> getListProducts();
	List<Producto> saveProduct(Producto Product);
	Producto updateProduct(Producto Product);
	List<Producto> getProductBymarca(String promarca);
	Optional<Producto> getProductByCode(int code);
	List<Producto> removeByCode(int code);

}
