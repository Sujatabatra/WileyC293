package com.sujata.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sujata.entity.Student;

public interface StudentDao extends JpaRepository<Student, Integer> {

}
