package co.edu.ue.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.ue.entitys.Usuario;

public interface UsuarioJpaI extends JpaRepository <Usuario, Long>{

	Usuario findByEmail (String email);
}
