package com.rd.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rd.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Serializable>{

}
