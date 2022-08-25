package com.cognizant.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
public class AuthRequest {

	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public AuthRequest() {};
	public AuthRequest(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	

}
