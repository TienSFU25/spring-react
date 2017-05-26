package springreacttutorial.demo;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by tienv on 5/25/2017.
 */
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}