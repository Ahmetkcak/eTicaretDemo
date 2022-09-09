package eTicaretDemo;

import eTicaretDemo.business.abstracts.UserService;
import eTicaretDemo.business.concretes.Conditions;
import eTicaretDemo.business.concretes.UserManager;
import eTicaretDemo.dataAccess.abstracts.UserDao;
import eTicaretDemo.dataAccess.concretes.HibarnateUserDao;
import eTicaretDemo.entities.concretes.User;

public class Main {
	public static void main(String[] args) {
		
		
		  UserDao userDao = new HibarnateUserDao();
		  Conditions  con = new Conditions();
	      UserService userService = new UserManager(userDao,con);
	      
	      User user = new User("abcd","abcd","abc@hotmail.com","12345abc");
	        userService.add(user);
	}
}
