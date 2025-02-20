package com.springboot.demo.controllers;


import com.springboot.demo.Entity.ClientDto;
import com.springboot.demo.Entity.ClientProjectDto;
import com.springboot.demo.Entity.People;
import com.springboot.demo.Repo.ClientProjectRepo;
import com.springboot.demo.Repo.ClientRepo;
import com.springboot.demo.Repo.EmployeeRepo;
import com.springboot.demo.Repo.PeopleRepo;
import com.springboot.demo.Dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	@Autowired
	private PeopleRepo peopleRepo;

	@Autowired
	private ClientRepo clientRepo;

	@Autowired
	private EmployeeRepo employeeRepo;

	@Autowired
	private ClientProjectRepo clientProjectRepo;
	
	@GetMapping("/api/healthCheck")
	public String healthCheck() {
		
		People people = new People();
		people.setName("test");
		peopleRepo.save(people);
		return "success";
		
	}
	@GetMapping("/api/getRoles")
	public DataDto getRoles() {

		List<RolesDto> rolesList = new ArrayList<>();


		rolesList.add(RolesDto.builder().roleID(2).role("Junior Developer").build());
		rolesList.add(RolesDto.builder().roleID(1).role("Senior Developer").build());
		rolesList.add(RolesDto.builder().roleID(3).role("Team Lead").build());
		rolesList.add(RolesDto.builder().roleID(3).role("Manager").build());


		
		return DataDto.builder().message("Roles List Sent").data( rolesList).build();
		
	}

	@GetMapping("/api/getDesignations")
	public DesignationDataDto getDesignations() {

		List<DesignationDto> rolesList = new ArrayList<>();


		rolesList.add(DesignationDto.builder().designationID(2).designation("Fullstack Developer").build());
		rolesList.add(DesignationDto.builder().designationID(1).designation("Java Developer").build());
		rolesList.add(DesignationDto.builder().designationID(3).designation("UI Lead").build());
		rolesList.add(DesignationDto.builder().designationID(3).designation("DBA").build());



		return DesignationDataDto.builder().message("Designation List Sent").data( rolesList).build();

	}

	@GetMapping("/api/getDesignations2")
	public List<DesignationDto> getDesignations2() {

		List<DesignationDto> rolesList = new ArrayList<>();


		rolesList.add(DesignationDto.builder().designationID(2).designation("Fullstack Developer").build());
		rolesList.add(DesignationDto.builder().designationID(1).designation("Java Developer").build());
		rolesList.add(DesignationDto.builder().designationID(3).designation("UI Lead").build());
		rolesList.add(DesignationDto.builder().designationID(3).designation("DBA").build());



		return rolesList;

	}


	@GetMapping("/api/getClients")
	public ClientDataDto getClients() {

		//List<ClientDto> rolesList = new ArrayList<>();
		//rolesList.add(ClientDto.builder().id(1).contactPersonName("Vivek").companyName("Infosys").address("1054 Bliarhom ave").city("Mississauga").postalCode("L5C3E1").province("Ontario").employeeStrength(100).gstNo("GASHDF213").contactNo("54671481345").regNo("KHVSFK24R5G4R4").build());
		return ClientDataDto.builder().message("Client List Sent").data( clientRepo.findAll()).build();

	}

	@PostMapping("/api/addUpdateClient")
	public ResponseEntity<ClientDataDto> updateClient(@RequestBody ClientDto clientDto) {

		//ClientDto response = clientRepo.save(ClientDto.builder().id(1).contactPersonName("Vivek").companyName("Infosys").address("1054 Bliarhom ave").city("Mississauga").postalCode("L5C3E1").province("Ontario").employeeStrength(100).gstNo("GASHDF213").contactNo("54671481345").regNo("KHVSFK24R5G4R4").build());
		ClientDto response = clientRepo.save(clientDto);

		return ResponseEntity.ok(ClientDataDto.builder().message("success").data( Arrays.asList(response)).build());

	}

	@PostMapping("/api/deleteClient")
	public ResponseEntity<ClientDataDto> deleteClient(@RequestBody ClientDto clientDto) {

		//ClientDto response = clientRepo.save(ClientDto.builder().id(1).contactPersonName("Vivek").companyName("Infosys").address("1054 Bliarhom ave").city("Mississauga").postalCode("L5C3E1").province("Ontario").employeeStrength(100).gstNo("GASHDF213").contactNo("54671481345").regNo("KHVSFK24R5G4R4").build());
		clientRepo.delete(clientDto);

		return ResponseEntity.ok(ClientDataDto.builder().message("success").build());

	}

	@GetMapping("/api/getClientProjects")
	public ClientProjectDataDto getClientProjects() {

		//List<ClientDto> rolesList = new ArrayList<>();
		//rolesList.add(ClientDto.builder().id(1).contactPersonName("Vivek").companyName("Infosys").address("1054 Bliarhom ave").city("Mississauga").postalCode("L5C3E1").province("Ontario").employeeStrength(100).gstNo("GASHDF213").contactNo("54671481345").regNo("KHVSFK24R5G4R4").build());
		return ClientProjectDataDto.builder().message("Client List Sent").data( clientProjectRepo.findAll()).build();

	}

	@PostMapping("/api/addUpdateClientProject")
	public ResponseEntity<ClientProjectDataDto> addUpdateClientProject(@RequestBody ClientProjectDto clientProjectDto) {

		//ClientDto response = clientRepo.save(ClientDto.builder().id(1).contactPersonName("Vivek").companyName("Infosys").address("1054 Bliarhom ave").city("Mississauga").postalCode("L5C3E1").province("Ontario").employeeStrength(100).gstNo("GASHDF213").contactNo("54671481345").regNo("KHVSFK24R5G4R4").build());
		ClientProjectDto response = clientProjectRepo.save(clientProjectDto);

		return ResponseEntity.ok(ClientProjectDataDto.builder().message("success").data( Arrays.asList(response)).build());

	}

	@PostMapping("/api/deleteClientProject")
	public ResponseEntity<ClientProjectDataDto> deleteClientProject(@RequestBody ClientProjectDto clientProjectDto) {

		//ClientDto response = clientRepo.save(ClientDto.builder().id(1).contactPersonName("Vivek").companyName("Infosys").address("1054 Bliarhom ave").city("Mississauga").postalCode("L5C3E1").province("Ontario").employeeStrength(100).gstNo("GASHDF213").contactNo("54671481345").regNo("KHVSFK24R5G4R4").build());
		clientProjectRepo.delete(clientProjectDto);

		return ResponseEntity.ok(ClientProjectDataDto.builder().message("success").build());

	}

	@GetMapping("/api/getEmployee")
	public EmployeeDataDto getEmployee() {

		//List<ClientDto> rolesList = new ArrayList<>();
		//rolesList.add(ClientDto.builder().id(1).contactPersonName("Vivek").companyName("Infosys").address("1054 Bliarhom ave").city("Mississauga").postalCode("L5C3E1").province("Ontario").employeeStrength(100).gstNo("GASHDF213").contactNo("54671481345").regNo("KHVSFK24R5G4R4").build());
		return EmployeeDataDto.builder().message("Client List Sent").data( employeeRepo.findAll()).build();

	}

}
