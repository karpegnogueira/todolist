package com.api.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.todolist.model.TaskModel;

@Repository
public interface TaskRepository extends JpaRepository<TaskModel, Long>{

}
