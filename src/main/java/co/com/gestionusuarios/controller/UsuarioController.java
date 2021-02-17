package co.com.gestionusuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.gestionusuarios.service.IUsuarioService;
import co.com.usuariolib.dto.UsuarioDTO;

@RestController
@RequestMapping("/servicioUsuario")
public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioServiceImpl;
	
	@PostMapping("/creat")
	public UsuarioDTO crear(@RequestBody UsuarioDTO usuarioDTO) {

		return usuarioServiceImpl.crear(usuarioDTO);
	}
	@PutMapping("/editarId")
	public UsuarioDTO editarId() {
		
		UsuarioDTO usuarioDTO = null;
		
		return usuarioDTO;
	}
	@PutMapping("/editarTodo")
	public UsuarioDTO editarTodo() {
		
		UsuarioDTO usuarioDTO = null;
		
		return usuarioDTO;
	}
	@DeleteMapping("/eliminarId")
	public UsuarioDTO eliminarId() {
		
		UsuarioDTO usuarioDTO = null;
		
		return usuarioDTO;
	}
	@DeleteMapping("/eliminarTodo")
	public UsuarioDTO eliminarTodo() {
		
		UsuarioDTO usuarioDTO = null;
		
		return usuarioDTO;
	}
	@GetMapping("/consultaId")
	public UsuarioDTO consultaId() {
		
		UsuarioDTO usuarioDTO = null;
		
		return usuarioDTO;
	}
	@GetMapping("/consultaTodo")
	public UsuarioDTO consultaTodo() {
		
		UsuarioDTO usuarioDTO = null;
		
		return usuarioDTO;
	}
}