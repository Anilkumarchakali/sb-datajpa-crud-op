package com.example.SBP_DB_CRUD.crudrepo;

import org.springframework.data.repository.CrudRepository;

import com.example.SBP_DB_CRUD.entity.User;

public interface UserRepostory extends CrudRepository<User, Integer>{

}
