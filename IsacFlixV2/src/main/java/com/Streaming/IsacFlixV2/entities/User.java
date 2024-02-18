package com.Streaming.IsacFlixV2.entities;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private byte id;
	private String name;
	private String email;
	private String CPF;
	private String password;
	
	public User() {
		
	}

	public User(byte id, String name, String email, String CPF, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.CPF = CPF;
		this.password = password;
	}

	public byte getId() {
		return id;
	}

	public void setId(byte id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	
	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		return Objects.hash(CPF, email, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(CPF, other.CPF) && Objects.equals(email, other.email) && id == other.id
				&& Objects.equals(name, other.name);
	}
	
	
	
}
