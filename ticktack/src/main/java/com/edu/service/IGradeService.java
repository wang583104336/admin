package com.edu.service;

import java.util.List;

import com.edu.entity.Grade;
import com.edu.vo.PageBean;

public interface IGradeService {
	
	public List<Grade> findGradeByCid(int cid);
	
	public PageBean<Grade> findGradeByPage(int page, int size);
	
	public void deleteById(int id);
	
	public void addGrade(Grade grade);
	
	public void updateGrade(Grade grade);
	
	public Grade findGradeById(int id);
	
	public Grade findGradeByName(String name);
	
	public List<Grade> findAll();
}
