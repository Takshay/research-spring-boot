/**
 * 
 */
package com.employee.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.domain.Employee;
import com.employee.repository.EmployeeRepository;

/**
 * @author takshay.p
 *
 */
@RestController
@RequestMapping("/v1.0/employee")
public class EmployeeController {
	
	@Autowired
    EmployeeRepository employeeRepository;
 
    @RequestMapping(method = RequestMethod.POST)
    public Employee create(@RequestBody Employee employee){
         
        Employee result = employeeRepository.save(employee);
        return result;
    }
     
    @RequestMapping(method = RequestMethod.GET, value="/{employeeId}")
    public Employee get(@PathVariable String employeeId){
        return employeeRepository.findOne(employeeId);
    }
    
    @RequestMapping(method = RequestMethod.GET, value="/")
	public List<Employee> getAll(){
		return employeeRepository.findAll();
	}
}
