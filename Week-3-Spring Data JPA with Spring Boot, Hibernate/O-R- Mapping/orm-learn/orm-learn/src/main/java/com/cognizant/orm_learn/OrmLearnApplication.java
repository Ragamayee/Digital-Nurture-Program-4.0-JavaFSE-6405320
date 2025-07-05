package com.cognizant.orm_learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;

import com.cognizant.orm_learn.service.CountryService;
import com.cognizant.orm_learn.service.DepartmentService;
import com.cognizant.orm_learn.service.EmployeeService;
import com.cognizant.orm_learn.service.exception.CountryNotFoundException;
import com.cognizant.orm_learn.model.Country;
import com.cognizant.orm_learn.model.Department;
import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.model.Stock;
import com.cognizant.orm_learn.repository.StockRepository;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@SpringBootApplication
public class OrmLearnApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

	private static EmployeeService employeeService;
	private static DepartmentService departmentService;

	public static void main(String[] args) throws Exception {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		employeeService = context.getBean(EmployeeService.class);
		departmentService = context.getBean(DepartmentService.class);

		 //testAddEmployee();
		 //testGetEmployee();
		 testUpdateEmployee();

	}
	private static void testAddEmployee() {
	    LOGGER.info("Start");

	    Employee employee = new Employee();
	    employee.setName("Ravi");
	    employee.setSalary(75000);
	    employee.setPermanent(true);
	    employee.setDateOfBirth(new Date());

	    Department dept = departmentService.get(1);
	    employee.setDepartment(dept);

	    employeeService.save(employee);
	    LOGGER.debug("Employee: {}", employee);

	    LOGGER.info("End");
	}

	private static void testGetEmployee() {
	    LOGGER.info("Start");
	    Employee employee = employeeService.get(1);
	    LOGGER.debug("Employee: {}", employee);
	    LOGGER.debug("Department: {}", employee.getDepartment());
	    LOGGER.info("End");
	}
	
	private static void testUpdateEmployee() {
	    LOGGER.info("Start");
	    Employee employee = employeeService.get(1);

	    Department newDept = departmentService.get(2);
	    employee.setDepartment(newDept);

	    employeeService.save(employee);
	    LOGGER.debug("Updated Employee: {}", employee);
	    LOGGER.info("End");
	}

}
