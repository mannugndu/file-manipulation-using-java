package com.test;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {

	String username = "Manpreet";
	transient String password = "Manjit";
	transient int pin = 1305;
	
	private void writeObject(ObjectOutputStream os)throws Exception
	{
		os.defaultWriteObject();
		String epassword = "123"+password;
		os.writeObject(epassword);
		int epin = 1234+pin;
		os.writeInt(epin);
		
	}
	
	private void readObject(ObjectInputStream is)throws Exception
	{
		is.defaultReadObject();
		String epassword = (String)is.readObject();
		int epin = is.readInt();
		epin = epin-1234;
		password = epassword.substring(3);
		pin = epin;
		
	}
	
	
	public void show()
	{
		System.out.println("name:"+username);
		System.out.println("password:"+password);
		System.out.println("pin:"+pin);
		
	}
	
	
}
