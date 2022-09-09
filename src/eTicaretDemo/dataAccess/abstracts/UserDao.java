package eTicaretDemo.dataAccess.abstracts;

import java.util.List;

import eTicaretDemo.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void login(String mail, String password);
	User getUser(int id);
	List<User> getAll();
}
