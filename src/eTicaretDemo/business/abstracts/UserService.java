package eTicaretDemo.business.abstracts;

import eTicaretDemo.entities.concretes.User;

public interface UserService {
	void add(User user);
	void login(String email,String password);
	void googleLogin(User user);
	void delete(User user);
}
