package com.startupkit.rest.jersey.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.startupkit.rest.jersey.bean.User;

@Path("/userservice")
public class UserService {
	
	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)
	public User[] getUsers() {
		List<User> users = new ArrayList<User>();
		User u1 = new User();
		u1.setUserName("murali");
		u1.setUserId("2222");
		u1.setPassword("pwd");
		users.add(u1);
		
		return users.toArray(new User[users.size()]);
	}
	
	@GET
	@Path("/user")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(){
		User u1 = new User();
		u1.setUserName("krishna");
		u1.setUserId("1111");
		u1.setPassword("pwd");
		
		return u1;
	}
}
