package com.teja.rest.SwaggerSpringboot.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teja.rest.SwaggerSpringboot.model.User;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/rest/user")
@Api(value="User Resouce",description="It shows the User Details...")
public class UserResource {

	@GetMapping
	public List<User> getUsers(){
		return Arrays.asList(
				new User("Dharma", 38930L),
				new User("Durga", 15000L));
	}
	
	@GetMapping("/{userName}")
	public User getUser(@PathVariable("userName") final String userName) {
		return new User(userName, 1000L);
	}

}
