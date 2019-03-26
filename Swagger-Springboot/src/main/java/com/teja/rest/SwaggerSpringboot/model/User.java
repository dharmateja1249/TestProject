package com.teja.rest.SwaggerSpringboot.model;

import io.swagger.annotations.ApiModelProperty;

public class User {
	@ApiModelProperty(notes="Name Of the User")
	private String userName;
	
	@ApiModelProperty(notes="Salary Of the User")
	private Long salary;
	
	public User() {
	}
	
	public User(String userName, Long salary) {
		this.userName = userName;
		this.salary = salary;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	
	

}
