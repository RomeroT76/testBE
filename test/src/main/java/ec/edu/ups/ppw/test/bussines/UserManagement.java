package ec.edu.ups.ppw.test.bussines;

import ec.edu.ups.ppw.test.dao.UserDAO;
import ec.edu.ups.ppw.test.model.User;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class UserManagement {
	
	@Inject
	UserDAO userD;
	
	public User getUser(String userName) {
		return this.userD.read(userName);
	}
}
