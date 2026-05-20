package co.edu.ue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import co.edu.ue.entitys.Usuario;

@Repository
public interface UsuarioRepositoryI extends JpaRepository <Usuario, Long> {

	Usuario findByEmail(String email);

}
