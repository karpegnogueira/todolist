package com.api.todolist.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.todolist.model.TaskModel;

@Service
public interface TaskService {

	List<TaskModel> findAll();
	TaskModel findById(Long id);
	TaskModel save (TaskModel task);
	void deleteById(Long id);
}
