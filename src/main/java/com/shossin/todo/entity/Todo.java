package com.shossin.todo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	
	public String userName;
	
	public String title;
	
	public String description;
	
	public String status;
	
	
	

}
