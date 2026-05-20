package co.edu.ue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.entitys.Usuario;
import co.edu.ue.services.UsuarioServiceI;

@RestController
@RequestMapping ("/Usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioServiceI usuarioService;
	
	@PostMapping ("/registro")
	public String registroUsuario (@RequestBody Usuario usuario) {
		usuarioService.registroUsuario (usuario);
		return "Se regustro exitosamente";
	}
	
	@PostMapping ("/login")
	public String login (@RequestBody Usuario usuario) {
		Usuario Logeado = usuarioService.login(usuario.getEmail(), usuario.getPassword());
		return (Logeado != null)? "Login exitoso" : "Credenciales inválidas";	
	}
}
