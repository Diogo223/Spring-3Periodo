package com.example.demo.controller.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Professor{	
	
	@Id
	@GeneratedValue
	
	private long id;
	private String nome;
	private int data;
	private String intervalo;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	
	public String getIntervalo() {
		return intervalo;
	}
	public void setIntervalo(String intervalo) {
		this.intervalo = intervalo;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}	

}
