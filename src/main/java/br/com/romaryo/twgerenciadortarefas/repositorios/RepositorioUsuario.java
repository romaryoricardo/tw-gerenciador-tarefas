package br.com.romaryo.twgerenciadortarefas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.romaryo.twgerenciadortarefas.modelos.Usuario;


public interface RepositorioUsuario extends JpaRepository<Usuario, Long>{
	
	Usuario findByEmail(String email);

}
