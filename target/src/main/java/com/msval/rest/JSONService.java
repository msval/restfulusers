package com.msval.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.msval.User;
import com.msval.UsersModel;

@Path("/users")
public class JSONService {
	
	private static UsersModel db = new UsersModel();
	
	@OPTIONS
	public Response optionsResponse() {
		return Response.ok("ok").build();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public User[] getAll() {
		
		return db.getAll();
	}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public User get(@PathParam(value = "id") String id) {
		
		User user = db.get(id);
		
		return user;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public User createUser(User user) {
		db.add(user);
		
		return user;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON) 
	public User updateUser(User user) {
		db.update(user);
		
		return user;
	}
	
	@DELETE
	@Path("{id}")
	public User delete(@PathParam(value = "id") String id) {
		
		return db.delete(id); 
	}

}
// to pass in a parameter after the ? ... example get-request?id=something
// public User get(@DefaultValue("All") @QueryParam(value = "id") final String id) {