package com.shossin.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.shossin.todo.entity.Todo;
import com.shossin.todo.service.TodoService;


@Controller
public class TodoRestController {
	
	@Autowired
	private TodoService todoService;
	
	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Todo todo){
		
		return new ResponseEntity<>(todoService.saveTodo(todo), HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getAllTodo() {
		
		return new ResponseEntity<>(todoService.getAllTodo(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getTodoById(@PathVariable int id) {
		
		return new ResponseEntity<>(todoService.getById(id), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateTodo(@RequestBody Todo todo, @PathVariable int id) {
		
		return new ResponseEntity<>(todoService.updateTodo(id, todo), HttpStatus.OK);
	}
	
	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteTodo(@PathVariable int id) {
		todoService.delete(id);
		
		return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
	}
	
	

}
