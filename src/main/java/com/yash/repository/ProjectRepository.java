package com.yash.repository;

import org.springframework.data.repository.CrudRepository;

import com.yash.bean.Project;


public interface ProjectRepository extends CrudRepository<Project, Integer> {}
