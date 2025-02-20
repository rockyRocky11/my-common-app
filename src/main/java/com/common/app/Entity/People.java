package com.common.app.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "People")
public class People {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "people_seq")
	@SequenceGenerator(name = "people_seq", sequenceName = "people_SEQ", allocationSize = 1)
	private Integer id;
	
	@Column(name = "name")
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
