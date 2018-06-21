package com.boraji.tutorial.springboot.repository;



import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.boraji.tutorial.springboot.model.*;

public interface UserRepository extends CrudRepository<Utente, String>{
  
}
