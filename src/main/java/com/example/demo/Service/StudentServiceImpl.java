package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.entity.Student;

@Service
public class StudentServiceImpl implements StudentService{

	private final StudentRepository repo;
	
	public StudentServiceImpl(StudentRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public List<Student> getAllStudent() {
		   Iterable<Student> stdItr=repo.findAll();
		   List<Student> stdList=new ArrayList<Student>();
		   stdItr.forEach(x->stdList.add(x));
		   return stdList;
	}

	@Override
	public Student getStudentById(Integer rollno) {
		Student std=repo.findById(rollno).orElse(null);
		return std;
	}

	@Override
	public void saveAllStudent(List<Student> stdlist) {
		
		repo.saveAll(stdlist);
	}

	

	@Override
	public void saveStudent(Student std) {
		repo.save(std);
		
	}
	
	
	@Override
	public void deleteById(Integer rollno) {
		repo.deleteById(rollno);
		
	}
	@Override
	public void deleteAllStudent() {
		repo.deleteAll();
	}

	

	@Override
	public void updateStudentById(Integer rollno, String name) {
	   Student std=repo.findById(rollno).orElse(null);
	   std.setName(name);
	   repo.save(std);
		
	}
}
