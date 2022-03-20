package com.jhonny.proyecto.dao;

import com.jhonny.proyecto.models.Usuario;

import java.util.List;

public interface UsuarioDao {
    List<Usuario> getUsuarios();

    void deleteUsuario(Long id);


    void createUsuario(Usuario usuario);

    Usuario obtenerUsuarioPorCredenciales(Usuario usuario);


}
