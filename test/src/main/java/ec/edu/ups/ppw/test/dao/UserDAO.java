package ec.edu.ups.ppw.test.dao;

import ec.edu.ups.ppw.test.model.User;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class UserDAO {

	@PersistenceContext
	EntityManager em;
	
	public User read(String userName) {
		User user = this.em.find(User.class, userName);
		return user;
	}
	
	public void insert(User user) {
		this.em.persist(user);
	}
	
	public void delete(String userName) {
		User user = this.read(userName);
		this.em.remove(user);
	}
	
	public void update(User user) {
		this.em.merge(user);
	}
}
