package com.example.demo.department.service;

import com.example.demo.department.domain.Department;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DepartmentService {

    List<Department> getDepartments();

}
