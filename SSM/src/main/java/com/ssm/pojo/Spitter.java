package com.ssm.pojo;


import org.springframework.beans.factory.annotation.Autowired;

public class Spitter {
	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private String username;
	private String password;
	/**
	 * Constructor with no parameters
	 */
	public Spitter() {
		super();
	}
	/**
	 * Constructor with full parameters
	 */
	@Autowired
	public Spitter(String firstName, String lastName, String email,
			String username, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	/**
	 * Override method toString()
	 */
	@Override
	public String toString() {
		return "Spitter [firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", username=" + username + ", password="
				+ password + "]";
	}
	
	public Spitter(Integer id, String firstName, String lastName, String email,
			String username, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	/**
	 * set/get method
	 */
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String userName) {
		this.username = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
