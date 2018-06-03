package com.example.demo.department.dao;

import com.example.demo.department.domain.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    public void insert(Department department);

    public Department getById(Integer id);

    public void update(Department department);

    public void deleteById(Integer id);

    public List<Department> getDepartments();
}
