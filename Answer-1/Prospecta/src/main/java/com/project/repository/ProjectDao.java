package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.Project;

public interface ProjectDao extends JpaRepository<Project, Integer>{

}
