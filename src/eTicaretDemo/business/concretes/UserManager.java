package eTicaretDemo.business.concretes;

import eTicaretDemo.business.abstracts.UserService;
import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.entities.concretes.User;

public class UserManager implements UserService{

	UserDao userDao;
	Conditions conditions;
	
	public UserManager(UserDao userDao,Conditions conditions) {
		super();
		this.userDao = userDao;
		this.conditions=conditions;
	}

	@Override
	public void add(User user) {
		boolean checkPassword = conditions.passwordCheck(user);
		boolean emailFormat = conditions.eMailFormat(user);
		if(checkPassword && emailFormat) {
			userDao.add(user);
		}
		else {
			System.out.println("Kayit basarisiz");
		}
		
	}

	@Override
	public void login(String email, String password) {
		userDao.login(email, password);
		
	}

	@Override
	public void googleLogin(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}


}
