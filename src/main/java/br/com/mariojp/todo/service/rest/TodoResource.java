package br.com.mariojp.todo.service.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.mariojp.todo.model.Todo;

@Path("todo")
public class TodoResource {
	
	@GET
	@Path("/teste")
	@Produces(MediaType.TEXT_PLAIN)
	public String testeMethod() {
		return "Servico OK";
	}
	
	
	@GET
	@Path("/todotest")
	@Produces(MediaType.APPLICATION_JSON)
	public Todo testeJSON() {
		return new Todo(new Integer(1),"Tarefa");
	}
	
}
