package com.common.app.Repo;

import com.common.app.Entity.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepo extends JpaRepository<People, Integer>{
	
	People save(People people);

}
