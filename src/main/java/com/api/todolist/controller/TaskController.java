package com.api.todolist.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.todolist.model.TaskModel;
import com.api.todolist.repository.TaskRepository;
import com.api.todolist.service.TaskService;

@RestController
@RequestMapping(value = "todolist")
public class TaskController {

	@Autowired	
	TaskService taskService;
	
	@Autowired
	TaskRepository taskRepository;
	
	@GetMapping
	public List<TaskModel> findAll(){
		return taskService.findAll();
	}
	
	@GetMapping
	public TaskModel findById(Long id) {
		return taskService.findById(id);
	}
	
	@PostMapping
	public TaskModel save(@Valid @NotNull @RequestBody TaskModel taskModel) {
		return taskService.save(taskModel);
	}
	
	@PutMapping
	public TaskModel update(@Valid @NotNull @RequestBody TaskModel taskModel) {
		return taskService.save(taskModel);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id ) {
		taskService.deleteById(id);
		return ResponseEntity.ok("Sucesso!");
	}
	
	
	
	
}
