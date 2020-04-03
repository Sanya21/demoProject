package com.aleks.demo.repository;
import com.aleks.demo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EmployeeRepository extends CrudRepository<User, Long> {

}