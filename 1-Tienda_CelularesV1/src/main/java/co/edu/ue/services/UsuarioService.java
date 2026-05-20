package co.edu.ue.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.ue.entitys.Usuario;
import co.edu.ue.repository.UsuarioRepositoryI;

@Service
public class UsuarioService implements UsuarioServiceI{
	
	@Autowired
	private UsuarioRepositoryI usuarioRepositoryI;

	
	@Override
    public Usuario login (String email, String password) {
        Usuario usuario = usuarioRepositoryI.findByEmail(email);
        if (usuario != null && usuario.getPassword().equals(password)) {
            return usuario;
        }
        return null;
    }


	@Override
	public Usuario registroUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioRepositoryI.save(usuario);
	}
}
