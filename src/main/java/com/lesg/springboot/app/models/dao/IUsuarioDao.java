package com.lesg.springboot.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.lesg.springboot.app.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

	public Usuario findByUsername(String username);
}
