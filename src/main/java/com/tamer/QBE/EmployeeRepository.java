package com.tamer.QBE;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface EmployeeRepository extends JpaRepository<Employee, Long>, QueryByExampleExecutor<Employee> {
}