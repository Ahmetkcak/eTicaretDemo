package eTicaretDemo.business.concretes;

import java.util.regex.Pattern;

import eTicaretDemo.entities.concretes.User;

public class Conditions {
	
	 public boolean passwordCheck(User user){
	        int letterCount= user.getPassword().length();
	        if(letterCount>=6){
	            return true;
	        }else{
	            System.out.println("Gecersiz sifre");
	            return false;
	        }
	    }

	    public boolean eMailFormat(User user){
	        String mail=user.getEmail();
	        boolean et= Pattern.matches(".*@.*", mail);
	        boolean dotCom=Pattern.matches(".*.com", mail);
	        if (et&&dotCom){
	            return true;
	        }else{
	            System.out.println("Gecersiz email");
	            return false;
	        }
	    }
}
