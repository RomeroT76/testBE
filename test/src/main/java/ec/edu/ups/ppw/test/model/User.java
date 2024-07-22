package ec.edu.ups.ppw.test.model;

import java.io.Serializable;

import ec.edu.ups.ppw.test.enums.Rol;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Users")
public class User implements Serializable{
	
	@Id
	@Column(name = "us_id")
	public int id;
	
	@Column(name = "us_name")
	private String name;
	
	@Column(name = "us_userName")
	private String userName;
	
	@Column(name = "us_password")
	private String password;
	
	@Column(name = "us_email")
	private String email;
	
	@Column(name = "us_rol")
	private Rol rol;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Rol getRol() {
		return rol;
	}
	public void setRol(Rol rol) {
		this.rol = rol;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
