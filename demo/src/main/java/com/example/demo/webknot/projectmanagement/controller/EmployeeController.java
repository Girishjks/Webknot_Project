package com.example.demo.webknot.projectmanagement.controller;

import com.example.demo.webknot.projectmanagement.model.Employee;
import com.example.demo.webknot.projectmanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/add")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.createEmployee(employee);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        return employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }
}


//package com.example.demo.webknot.projectmanagement.controller;
//
//import com.example.demo.webknot.projectmanagement.model.Project;
//import com.example.demo.webknot.projectmanagement.service.ProjectService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/projects")
//public class ProjectController {
//
//    @Autowired
//    private ProjectService projectService;
//
//    @GetMapping
//    public List<Project> getAllProjects() {
//        return projectService.getAllProjects();
//    }
//
//    @GetMapping("/{id}")
//    public Optional<Project> getProjectById(@PathVariable Long id) {
//        return projectService.getProjectById(id);
//    }
//
//    @PostMapping
//    public Project createProject(@RequestBody Project project) {
//        return projectService.createProject(project);
//    }
//
//    @PutMapping("/{id}")
//    public Project updateProject(@PathVariable Long id, @RequestBody Project project) {
//        return projectService.updateProject(id, project);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteProject(@PathVariable Long id) {
//        projectService.deleteProject(id);
//    }
//}
//
//
//
//
////package com.example.demo.webknot.projectmanagement.controller;
////
////import com.example.demo.webknot.projectmanagement.model.Employee;
////import com.example.demo.webknot.projectmanagement.service.EmployeeService;
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.web.bind.annotation.*;
////
////import java.util.List;
////import java.util.Optional;
////
////@RestController
////@RequestMapping("/api/employees")
////public class EmployeeController {
////
////    @Autowired
////    private EmployeeService employeeService;
////
////    @GetMapping
////    public List<Employee> getAllEmployees() {
////        return employeeService.getAllEmployees();
////    }
////
////    @GetMapping("/{id}")
////    public Optional<Employee> getEmployeeById(@PathVariable Long id) {
////        return employeeService.getEmployeeById(id);
////    }
////
////    @PostMapping
////    public Employee createEmployee(@RequestBody Employee employee) {
////        return employeeService.createEmployee(employee);
////    }
////
////    @PutMapping("/{id}")
////    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
////        return employeeService.updateEmployee(id, employee);
////    }
////
////    @DeleteMapping("/{id}")
////    public void deleteEmployee(@PathVariable Long id) {
////        employeeService.deleteEmployee(id);
////    }
////}
