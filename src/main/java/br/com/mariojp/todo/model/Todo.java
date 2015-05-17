package br.com.mariojp.todo.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Todo {

	private Integer id;
	
	private String titulo;
	
	public Todo() {	}

	public Todo(Integer id, String titulo) {
		this.id = id;
		this.titulo = titulo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
}
