package com.example.demo.webknot.projectmanagement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String projectType;
    private String sourceClient;
    private String endClient;
    private String description;
    private String accountManager;
    private String projectManager;
    private String status;

    @ManyToMany
    @JoinTable(
            name = "project_employee",
            joinColumns = @JoinColumn(name = "project_id"),
            inverseJoinColumns = @JoinColumn(name = "employee_id"))
    private Set<Employee> employees;
}









//package com.example.demo.webknot.projectmanagement.model;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.util.Set;
//
//@Entity
//@NoArgsConstructor
//@Getter
//@Setter
//public class Project {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String projectType;
//    private String sourceClient;
//    private String endClient;
//    private String description;
//    private String accountManager;
//    private String projectManager;
//    private String status;
//
//    @ManyToMany
//    @JoinTable(
//            name = "project_employee",
//            joinColumns = @JoinColumn(name = "project_id"),
//            inverseJoinColumns = @JoinColumn(name = "employee_id"))
//    private Set<Employee> employees;
//
//    public Project(Long id, String projectType, String sourceClient, String endClient, String description, String accountManager, String projectManager, String status, Set<Employee> employees) {
//        this.id = id;
//        this.projectType = projectType;
//        this.sourceClient = sourceClient;
//        this.endClient = endClient;
//        this.description = description;
//        this.accountManager = accountManager;
//        this.projectManager = projectManager;
//        this.status = status;
//        this.employees = employees;
//    }
//}
