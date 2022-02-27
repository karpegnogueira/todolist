package com.api.todolist.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.todolist.repository.TaskRepository;

@Component
public class DummyData {

	@Autowired
	TaskRepository taskRepository;
	
	
	
	
}
