package com.yash.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.bean.Person;
import com.yash.bean.Project;
import com.yash.bean.User;
import com.yash.repository.PersonRepository;
import com.yash.repository.ProjectRepository;

@Service
public class ProjectService {
	
    @Autowired(required=true)
    ProjectRepository projectRepository;

    public List<Project> getAllProject() {
        List<Project> projects = new ArrayList<Project>();
        projectRepository.findAll().forEach(project -> projects.add(project));
        return projects;
    }

    public Project getProjectById(int id) {
        return projectRepository.findById(id).get();
    }

    public void saveOrUpdate(Project project) {
    	projectRepository.save(project);
    }

    public void delete(int id) {
    	projectRepository.deleteById(id);
    }
    
    public Project updateById(int id,Project project)
    {
    	Project project1 = projectRepository.findById(id).get();

        project1.setDescription(project.getDescription());
        project1.setName(project.getName());
        project1.setStartDate(project.getSrartDate());
        project1.setEndDate(project.getEndDate());
        return projectRepository.save(project1);
      
    }


}
