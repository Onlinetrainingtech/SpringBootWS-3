package com.example.HSpringBootH2DB.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.HSpringBootH2DB.model.Student;

public interface StudentRepository extends CrudRepository<Student,Integer>
{

}
