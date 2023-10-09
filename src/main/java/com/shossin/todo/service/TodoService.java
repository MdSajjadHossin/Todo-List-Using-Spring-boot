package com.shossin.todo.service;

import java.util.List;

import com.shossin.todo.entity.Todo;

public interface TodoService {
	
	public Todo saveTodo(Todo todo);
	
	public List<Todo> getAllTodo();
	
	public Todo getById(int id);
	
	public Todo updateTodo(int id, Todo todo);
	
	public void delete(int id);
	
}
