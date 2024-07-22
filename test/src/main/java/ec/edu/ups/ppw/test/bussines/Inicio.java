package ec.edu.ups.ppw.test.bussines;

import ec.edu.ups.ppw.test.dao.UserDAO;
import ec.edu.ups.ppw.test.enums.Rol;
import ec.edu.ups.ppw.test.model.User;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class Inicio {
	
	@Inject
	UserDAO userD;
	@PostConstruct
	public void init() {
		
		User u = new User();
		u.setUserName("Roberto");
		u.setPassword("R123");;
		u.setRol(Rol.ADMIN);
		
		userD.insert(u);
	}

}
