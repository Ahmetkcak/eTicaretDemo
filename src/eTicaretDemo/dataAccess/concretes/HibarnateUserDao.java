package eTicaretDemo.dataAccess.concretes;

import java.util.List;

import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class HibarnateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("Kullanici eklendi : " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void login(String mail, String password) {
		// TODO Auto-generated method stub
		
	}

}
