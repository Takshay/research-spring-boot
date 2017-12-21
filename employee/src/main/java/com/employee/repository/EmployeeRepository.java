/**
 * 
 */
package com.employee.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.employee.domain.Employee;

/**
 * @author takshay.p
 *
 */
@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

}
