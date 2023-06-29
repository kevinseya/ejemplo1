package com.ejemplo1.ejemplo1.dao;

import com.ejemplo1.ejemplo1.models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Usuario> getUsuarios() {

       String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();

    }
}
