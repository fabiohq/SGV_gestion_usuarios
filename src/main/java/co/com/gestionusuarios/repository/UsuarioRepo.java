package co.com.gestionusuarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.com.gestionusuarios.entity.Usuario;

@Repository
public class UsuarioRepo implements JpaRepository<Usuario, String>{

}
