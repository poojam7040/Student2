package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Student;


@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

	void findByName(String stdName);

     	
	
}
