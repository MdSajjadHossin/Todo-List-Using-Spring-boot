package com.shossin.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import com.shossin.todo.entity.Todo;
import com.shossin.todo.exception.ResourceNotFoundException;
import com.shossin.todo.repository.TodoRepo;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoRepo todoRepo;

	@Override
	public Todo saveTodo(Todo todo) {
		// TODO Auto-generated method stub
		return todoRepo.save(todo);
	}

	@Override
	public List<Todo> getAllTodo() {
		// TODO Auto-generated method stub
		return todoRepo.findAll();
	}

	@Override
	public Todo getById(int id) {
		// TODO Auto-generated method stub
		return todoRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Id not found with id="+id));
	}
	
	@Override
	public Todo updateTodo(int id, Todo todo) {
		// TODO Auto-generated method stub
		Todo oldTodo = todoRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Id not found with id="+id));
		oldTodo.setUserName(todo.getUserName());
		oldTodo.setTitle(todo.getTitle());
		oldTodo.setDescription(todo.getDescription());
		oldTodo.setStatus(todo.getStatus());
		
		return todoRepo.save(oldTodo);
	}


	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Todo todo = todoRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("Id not found with id="+id));
		todoRepo.delete(todo);
	}

	
	
	

}
