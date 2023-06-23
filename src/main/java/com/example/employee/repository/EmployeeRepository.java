// Write your code here
package com.example.employee.repository;

import com.example.employee.model.Employee;
import java.util.ArrayList;

public interface EmployeeRepository {
    ArrayList<Employee> getEmployees();
    Employee getEmployeeByEmployeeId(int employeeId);
    Employee addEmployee(Employee employee);
    Employee updateEmployee(int employeeId,Employee employee);
    void deleteEmployee(int employeeId);
}