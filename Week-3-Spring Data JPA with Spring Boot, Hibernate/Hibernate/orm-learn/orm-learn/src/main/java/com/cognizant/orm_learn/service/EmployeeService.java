package com.cognizant.orm_learn.service;

import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public Employee get(int id) {
        LOGGER.info("Start get()");
        return employeeRepository.findById(id).get();
    }

    @Transactional
    public void save(Employee employee) {
        LOGGER.info("Start save()");
        employeeRepository.save(employee);
        LOGGER.info("End save()");
    }

    @Transactional
    public List<Employee> getAllPermanentEmployees() {
        LOGGER.info("Fetching all permanent employees");
        return employeeRepository.getAllPermanentEmployees();
    }
}
