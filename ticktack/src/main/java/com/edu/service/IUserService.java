package com.edu.service;

import java.util.List;

import com.edu.entity.User;
import com.edu.vo.PageBean;

public interface IUserService {
	
	public PageBean<User> findUserByPage(int page, int size, String no, int flag);
	
	public List<String> findWorkById(int id);
	
	public void deleteUserById(int id);
	
	public User findUserById(int id);
	
	public User findUserByNo(String no);
	
}
