package com.felixeisenmenger.service.demo;

import java.util.ArrayList;
import java.util.List;

public class WelcomeService {

	public List<String> getWelcomeMessage(String name) {
		List<String> myWelcomeMessage = new ArrayList<>();
	
		// Add data to the list
		myWelcomeMessage.add("Hello! ");
		myWelcomeMessage.add(name);
		myWelcomeMessage.add(", welcome to Java-Spring :)");
		
		return myWelcomeMessage;
	}
	
}
