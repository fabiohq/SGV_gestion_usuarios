package co.com.gestionusuarios.service;

import co.com.usuariolib.dto.UsuarioDTO;

public interface IUsuarioService {

	public UsuarioDTO crear(UsuarioDTO usuarioDTO);
	
	public UsuarioDTO editarId(UsuarioDTO usuarioDTO) throws Exception;
	
	public UsuarioDTO editarTodo(UsuarioDTO usuarioDTO) throws Exception;
	
	public UsuarioDTO eliminarId(UsuarioDTO usuarioDTO) throws Exception;
	
	public UsuarioDTO eliminarTodo(UsuarioDTO usuarioDTO) throws Exception;
	
	public UsuarioDTO consultaId(UsuarioDTO usuarioDTO) throws Exception;
	
	public UsuarioDTO consultaTodo(UsuarioDTO usuarioDTO) throws Exception;
}
