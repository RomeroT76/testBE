package ec.edu.ups.ppw.test.bussines;

import ec.edu.ups.ppw.test.dao.UserDAO;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class UserManagement {
	
	@Inject
	UserDAO userD;
	
}
