package com.example.spring_demo2.service;

import com.example.spring_demo2.model.Employee;
import com.example.spring_demo2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);

    void deleteEmployeeId(long id);

    Page<Employee>findPaginated(int pageNo,int pageSize,String sortField, String sortDirection);
}
