package com.curso2020.curso.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso2020.curso.entidades.Usuario;
@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

}
