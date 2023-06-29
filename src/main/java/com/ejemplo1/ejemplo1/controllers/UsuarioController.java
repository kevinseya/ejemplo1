package com.ejemplo1.ejemplo1.controllers;

import com.ejemplo1.ejemplo1.dao.UsuarioDao;
import com.ejemplo1.ejemplo1.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioDao usuarioDao;
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Lucas");
        usuario.setApellido("Lopez");
        usuario.setEmail("Lopez@gmail.com");
        usuario.setTelf("0983448412");

        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "usuario4234")
    public Usuario modificarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setId(155);
        usuario.setNombre("Lucas");
        usuario.setApellido("Lopez");
        usuario.setEmail("Lopez@gmail.com");
        usuario.setTelf("0983448412");

        return usuario;
    }

    @RequestMapping(value = "usuario2342")
    public Usuario eliminarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setId(466);
        usuario.setNombre("Lucas");
        usuario.setApellido("Lopez");
        usuario.setEmail("Lopez@gmail.com");
        usuario.setTelf("0983448412");

        return usuario;
    }

    @RequestMapping(value = "usuario42342")
    public Usuario buscarUsuario(){
        Usuario usuario = new Usuario();
        usuario.setId(542);
        usuario.setNombre("Lucas");
        usuario.setApellido("Lopez");
        usuario.setEmail("Lopez@gmail.com");
        usuario.setTelf("0983448412");

        return usuario;
    }

}


