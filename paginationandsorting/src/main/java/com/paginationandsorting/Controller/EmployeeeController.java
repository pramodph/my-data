package com.paginationandsorting.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;


import com.paginationandsorting.Model.Employee;
import com.paginationandsorting.Service.EmployeeService;

@RestController
@RequestMapping("/employees") 
public class EmployeeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/list")
	public List<Employee> getEmployee(@RequestParam(required =false, defaultValue="1") int pageNo, 
									  @RequestParam(required =false, defaultValue="5") int pageSize,
									  @RequestParam(required =false, defaultValue="id") String sortBy,
									  @RequestParam(required =false, defaultValue="asc") String sortDir,
									  @RequestParam(required =false, defaultValue="") String filterByName
									  ){
		Sort sort = sortDir.equalsIgnoreCase("asc") ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
		//return employeeService.fetchAllEmployee(PageRequest.of(pageNo, pageSize));
		//return employeeService.fetchAllEmployee(PageRequest.of(pageNo - 1, pageSize, sort));
		return employeeService.fetchAllEmployee(PageRequest.of(pageNo - 1, pageSize, sort), filterByName);
	}
	
	@GetMapping("/hello")
	public String EmployeeeController() {
		return "hello world";
	}
}
