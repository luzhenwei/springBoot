package com.example.demo.department.dao;

import com.example.demo.department.domain.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DepartmentMapper {

    void insert(Department department);

    Department getById(Integer id);

    void update(Department department);

    void deleteById(Integer id);

    List<Department> getDepartments();
}
