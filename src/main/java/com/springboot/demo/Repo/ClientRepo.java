package com.springboot.demo.Repo;

import com.springboot.demo.Entity.ClientDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepo extends JpaRepository<ClientDto, Integer>{

	ClientDto save(ClientDto client);

	List<ClientDto> findAll();

	void delete(ClientDto client);
}
