package com.msval;

import java.util.HashMap;
import java.util.Random;



public class UsersModel {
	private HashMap <String, User> users = new HashMap<String, User>();
	private Random ageGen = new Random();
	
	public UsersModel() {
		add("Little", "Bear");
		add("Mamma", "Bear");
		add("Bear", "Pappa");
		add("Tom", "Tom");
		add("Peter", "O'Hara");
	}
	
	public void add (String first, String last) {
		User user = new User();
		
		String id = "" + users.size();
		
		user.setId(id);
		user.setFirstname(first);
		user.setLastname(last);
		user.setAge("" + ageGen.nextInt(100));
		users.put(id, user);
	}
	
	public User add(User user) {
		user.setId("" + users.size());
		users.put(user.getId(), user);
		
		return user;
	}
	
	public User[] getAll() {
		return users.values().toArray(new User[users.values().size()]);
	}
	
	public User get(String id) {
		return users.get(id);
	}
	
	public User update(User user){
		users.put(user.getId(), user);
		
		return user;
		
	}
	
	public User delete(String  id) {
		User tmp = users.get(id);
		
		users.remove(id);
		
		return tmp;
	}
	
}
