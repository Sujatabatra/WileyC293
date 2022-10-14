package com.sujata.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sujata.entity.Professor;

public interface ProfessorDao extends JpaRepository<Professor, String> {

}
