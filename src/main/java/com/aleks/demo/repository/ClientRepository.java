package com.aleks.demo.repository;
import com.aleks.demo.model.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {

}
