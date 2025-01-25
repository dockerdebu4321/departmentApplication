package com.practiceproject.Springbootpractice.project.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import com.practiceproject.Springbootpractice.project.entity.Department;

class DepartmentRepositoryTest  {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private TestEntityManager entityManager;
	
	@BeforeEach
	void setUp(){
		Department department =Department.builder()
								.departmentName("Mechanical Engineering")
								.departmentCode("ME - 011")
								.departmentAddress("Delhi")
								.build();
		entityManager.persist(department);
		
	}
	public void whenFindById_thenReturnDepartment() {
		Department department =departmentRepository.findById(1L).get();
		assertEquals(department.getDepartmentName(),"Mechanical Engineering");
	}
	

	

}
