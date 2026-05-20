package co.edu.ue.jpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.ue.entitys.Producto;

public interface ProductoJpaI extends JpaRepository<Producto, Integer> {
	
	List<Producto> findProductByproMarca(String proMarca);


}
