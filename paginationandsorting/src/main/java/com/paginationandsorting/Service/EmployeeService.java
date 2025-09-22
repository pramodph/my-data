package com.paginationandsorting.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.stereotype.Service;

import com.paginationandsorting.Model.Employee;
import com.paginationandsorting.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	
	@Autowired
	private EmployeeRepository EmployeeRepository;

	public List<Employee> fetchAllEmployee(org.springframework.data.domain.Pageable pageable,String filterByName) {
		if(filterByName != null && !filterByName.isEmpty()) {
			return EmployeeRepository.findByName(filterByName, pageable).getContent();
		}
		return EmployeeRepository.findAll(pageable).getContent();
	}

}
