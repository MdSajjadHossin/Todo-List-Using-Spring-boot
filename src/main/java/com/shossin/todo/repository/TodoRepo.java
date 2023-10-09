package com.shossin.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shossin.todo.entity.Todo;


public interface TodoRepo extends JpaRepository<Todo, Integer> {

}
