package com.yash.repository;

import org.springframework.data.repository.CrudRepository;

import com.yash.bean.Person;

public interface PersonRepository extends CrudRepository<Person, Integer> {}