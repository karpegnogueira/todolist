package com.api.todolist.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class TaskModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotBlank
	private String titulo;
	
	@NotBlank
	private String descrissao;
	
	@NotBlank
	private LocalDateTime dataEHora;
	
	private LocalDateTime dataECriacao;
	
	private boolean ativo;
	
	private boolean deletado;
	
	
	
}
