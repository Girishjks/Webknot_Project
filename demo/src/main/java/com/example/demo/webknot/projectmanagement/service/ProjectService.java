package com.example.demo.webknot.projectmanagement.service;

import com.example.demo.webknot.projectmanagement.model.Project;
import com.example.demo.webknot.projectmanagement.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Optional<Project> getProjectById(Long id) {
        return projectRepository.findById(id);
    }

    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    public Project updateProject(Long id, Project project) {
        project.setId(id);
        return projectRepository.save(project);
    }

    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }
}



//package com.example.demo.webknot.projectmanagement.service;
//
//import com.example.demo.webknot.projectmanagement.model.Project;
//import com.example.demo.webknot.projectmanagement.repository.ProjectRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class ProjectService {
//
//    @Autowired
//    private ProjectRepository projectRepository;
//
//    public List<Project> getAllProjects() {
//        return projectRepository.findAll();
//    }
//
//    public Optional<Project> getProjectById(Long id) {
//        return projectRepository.findById(id);
//    }
//
//    public Project createProject(Project project) {
//        return projectRepository.save(project);
//    }
//
//    public Project updateProject(Long id, Project project) {
//        project.setId(id);
//        return projectRepository.save(project);
//    }
//
//    public void deleteProject(Long id) {
//        projectRepository.deleteById(id);
//    }
//}
