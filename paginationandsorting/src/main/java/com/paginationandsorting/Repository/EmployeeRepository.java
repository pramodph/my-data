package com.paginationandsorting.Repository;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paginationandsorting.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	Page<Employee> findByName(String name, org.springframework.data.domain.Pageable pageable);
}
