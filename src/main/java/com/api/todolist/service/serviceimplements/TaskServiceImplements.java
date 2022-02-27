package com.api.todolist.service.serviceimplements;

import java.util.List;

import javax.management.JMRuntimeException;

import org.springframework.beans.factory.annotation.Autowired;

import com.api.todolist.model.TaskModel;
import com.api.todolist.repository.TaskRepository;
import com.api.todolist.service.TaskService;

public class TaskServiceImplements implements TaskService{

	@Autowired
	TaskRepository taskRepository;
	
	
	@Override
	public List<TaskModel> findAll() {
		return taskRepository.findAll();
	}

	@Override
	public TaskModel findById(Long id) {
		return taskRepository.findById(id).orElseThrow(()->new RuntimeException("Nao  encontrado!"));
	}

	@Override
	public TaskModel save(TaskModel task) {
		return taskRepository.save(task);
	}

	@Override
	public void deleteById(Long id) {
		this.findById(id);
		  taskRepository.deleteById(id);
	}

}
