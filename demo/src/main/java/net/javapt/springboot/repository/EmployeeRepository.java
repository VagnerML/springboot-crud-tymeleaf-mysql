package net.javapt.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javapt.springboot.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}