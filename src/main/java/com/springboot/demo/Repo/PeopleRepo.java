package com.springboot.demo.Repo;

import com.springboot.demo.Entity.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepo extends JpaRepository<People, Integer>{
	
	People save(People people);

}
