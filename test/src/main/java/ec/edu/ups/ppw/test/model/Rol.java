package ec.edu.ups.ppw.test.model;

import ec.edu.ups.ppw.test.enums.RolName;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class Rol {
	
	@Id
	@Column(name = "rol_id")
	private int id;
	
	@Column(name = "rol_name")
	@Enumerated(EnumType.STRING)
	private RolName name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RolName getName() {
		return name;
	}

	public void setName(RolName name) {
		this.name = name;
	}
	
}
