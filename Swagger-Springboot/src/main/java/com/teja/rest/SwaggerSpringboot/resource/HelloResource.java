package com.teja.rest.SwaggerSpringboot.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/rest/hello")
@Api(value="HelloWorld Resource",description="It Shows the CURD for Hello World")
public class HelloResource {
	
	@ApiOperation(value="Returns Hello World")
	@ApiResponses(
			value= {
					@ApiResponse(code = 100, message="100 is Message"),
					@ApiResponse(code=200,message="Successful Response")
			})
	@GetMapping
	public String hello() {
		return "Hello World";
	}
	
	@ApiOperation(value="Returns Hello World")
	@PostMapping("/save")
	public String add(@RequestBody final String hello) {
		return hello;
	}
	
	@ApiOperation(value="Returns Hello World")
	@PutMapping("/update")
	public String update(@RequestBody final String hello) {
		return hello;
	}
	
	
	

}
