package com.yash.repository;

import org.springframework.data.repository.CrudRepository;


import com.yash.bean.User;

//@RepositoryRestResource

//@CrossOrigin(origins = "http://localhost:4200")

public interface UserRepository extends CrudRepository<User, Integer> {}