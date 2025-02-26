package com.common.app.Repo;

import com.common.app.Entity.EmployeeDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeDto, Integer>{

	EmployeeDto save(EmployeeDto employee);

	List<EmployeeDto> findAll();

	void delete(EmployeeDto employee);
}
