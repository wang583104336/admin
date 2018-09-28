package com.edu.dao;

import java.util.List;

import com.edu.entity.Student;

public interface IStudentDao {
	
	public int findScountByGid(int id);
	
	public List<Student> findByGid(int id);
}