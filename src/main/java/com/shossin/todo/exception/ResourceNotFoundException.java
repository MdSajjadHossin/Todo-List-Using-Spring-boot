package com.shossin.todo.exception;

public class ResourceNotFoundException extends RuntimeException{
	
	public ResourceNotFoundException(String msg) {
		
		super(msg);
	}
}
