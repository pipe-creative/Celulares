package co.edu.ue.services;

import co.edu.ue.entitys.Usuario;

public interface UsuarioServiceI {

	Usuario registroUsuario (Usuario usuario);
	Usuario login (String email, String password);
}
