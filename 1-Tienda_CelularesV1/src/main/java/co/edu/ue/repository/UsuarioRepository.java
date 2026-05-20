package co.edu.ue.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.ue.entitys.Usuario;
import co.edu.ue.jpa.UsuarioJpaI;

@Repository
public abstract class UsuarioRepository implements UsuarioRepositoryI{

	@Autowired
	private UsuarioJpaI usuarioJpa;
	
	

	@Override
	public Usuario findByEmail(String email) {
		// TODO Auto-generated method stub
		return usuarioJpa.findByEmail(email);
	}


}
