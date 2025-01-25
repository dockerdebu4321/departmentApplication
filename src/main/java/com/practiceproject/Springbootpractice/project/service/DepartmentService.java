package com.practiceproject.Springbootpractice.project.service;

import java.util.List;

import com.practiceproject.Springbootpractice.project.entity.Department;
import com.practiceproject.Springbootpractice.project.error.DepartmentNotFoundException;

public interface DepartmentService {

	public Department saveDepartment(Department department);

	public List<Department> fetchDepartmentList();

	public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFoundException;

	public void deleteDepartmentById(Long departmentId);

	public Department updateDepartment(Long departmentId, Department department);

	public Department fetchDepartmentByName(String departmentName);

}
