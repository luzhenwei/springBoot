package com.example.demo.department.service.impl;

import com.example.demo.department.dao.DepartmentMapper;
import com.example.demo.department.domain.Department;
import com.example.demo.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional(readOnly = true)
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getDepartments() {
        return departmentMapper.getDepartments();
    }
}
