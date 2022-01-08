package com.example;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudRepo extends JpaRepository<Student, Integer>
{

	List<Student> findByTech(String tech);

}
