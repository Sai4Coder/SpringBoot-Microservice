package com.appsdeveloperblog.app.ws.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDetailsRequestModel {
	
    @NotNull(message="First name cannot be null")
    @Size(min=2,message="First must be 2 character")
	private String firstName;
    
    @NotNull(message="Last name cannot be null")
	private String lastName;
    
    @NotNull(message="Email name cannot be null")
    @Email
	private String email;
    
    @Size(min=8, max=16, message="Password must be equal or greater than 8 characters and less than 16 characters")
	private String password;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
