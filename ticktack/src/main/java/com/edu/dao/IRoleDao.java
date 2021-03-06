package com.edu.dao;

import java.util.List;
import java.util.Map;

import com.edu.entity.Role;

public interface IRoleDao {
    
    public List<String> findRoleByNo(String no);
    
    public List<Role> findAllRoleByPage(Map<String, Object> map);
    
    public int count(Map<String, Object> map);
    
    public List<Role> findAllRole();
    
    public void deleteById(int id);
    
    public List<Role> findAllSonOfRole();
    
    public void deleteParentIdById(int id);
}