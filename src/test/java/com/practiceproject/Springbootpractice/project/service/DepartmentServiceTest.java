package com.practiceproject.Springbootpractice.project.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.practiceproject.Springbootpractice.project.entity.Department;
import com.practiceproject.Springbootpractice.project.repository.DepartmentRepository;

@SpringBootTest
class DepartmentServiceTest {
	
	
	@Autowired
	private DepartmentService departmentService;
	
	@MockBean
	private DepartmentRepository departmentRepository;

	@BeforeEach
	void setUp() {
		Department department=Department.builder()
				.departmentName("IT")
				.departmentCode("IT-06")
				.departmentAddress("Ahemedabad")
				.departmentId(1L)
				.build();
		
		Mockito.when(departmentRepository.findByDepartmentNameIgnoreCase("IT")).thenReturn(department);	
	}
	@Test
	@DisplayName("Get Data based on Valid Department name !!")
	@Disabled
	public void whenValidDepartmentName_thenDepartmentShouldShouldFound() {
		
		String departmentName="IT";
		Department found=departmentService.fetchDepartmentByName(departmentName);
		assertEquals(departmentName, found.getDepartmentName());
		
	}
}
