package com.common.app.Repo;

import com.common.app.Entity.ClientProjectDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientProjectRepo extends JpaRepository<ClientProjectDto, Integer>{

	ClientProjectDto save(ClientProjectDto client);

	List<ClientProjectDto> findAll();
	void delete(ClientProjectDto client);
}
