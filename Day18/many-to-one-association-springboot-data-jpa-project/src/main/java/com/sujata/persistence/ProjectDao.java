package com.sujata.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sujata.entity.Project;

public interface ProjectDao extends JpaRepository<Project, String> {

}
