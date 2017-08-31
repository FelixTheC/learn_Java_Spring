package online.ftc_webdev.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.felixeisenmenger.service.demo.GenericWelcomeService;
import com.felixeisenmenger.service.demo.WelcomeService;

@Controller
public class WelcomeController {
	
	@Autowired
	private GenericWelcomeService welcomeService;
	
	@RequestMapping("/")
	public String doWelcome(Model model) {
		
		//1 Retrieving process data
		/*
		 * without @Autowired
		 * 
		 * WelcomeService welcomeService = new WelcomeService();
		 * */
		
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("Felix");
		
		//2 Add data to the model
		model.addAttribute("myWelcomeMessage", welcomeMessage);
		
		//3 return logical view name
		return "welcomeNew";
	}
		
	@RequestMapping("/hello-again")
	public String doWelcomeAgain(Model model) {
		
		//1 Retrieving process data
		/*
		 * without @Autowired
		 * 
		 * WelcomeService welcomeService = new WelcomeService();
		 * */
		
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("The Cat");
		
		//2 Add data to the model
		model.addAttribute("myWelcomeMessage", welcomeMessage);
		
		//3 return logical view name
		return "welcomeNew";
	}
	
}
