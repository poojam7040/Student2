package com.example.demo.Service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {

	
	//GET
	//==================================
	public List<Student> getAllStudent();
	public Student getStudentById(Integer stdId);
	
	
	//SAVEALL
	//=====================================
	public void saveAllStudent(List<Student> stdlist);
	
	//SAVE
	//=====================================
	public void saveStudent(Student std);
	
	
	//DELETE
	//=====================================
	public void deleteById(Integer stdId);
	public void deleteAllStudent();
	
	//UPDAte
	//=====================================
	public void updateStudentById(Integer stdId,String name);
	
	
	
	
	
	
	
	//Internally crud repo uses hibernate for query
	
	
	
}
