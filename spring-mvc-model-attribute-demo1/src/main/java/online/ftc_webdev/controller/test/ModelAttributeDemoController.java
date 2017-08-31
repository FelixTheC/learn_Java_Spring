package online.ftc_webdev.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelAttributeDemoController {
	
	@RequestMapping(value="/home")
	public String home() {
		System.out.println("INSIDE home " + System.currentTimeMillis());
		return "modelAttributeHome";
	}
	
	/*
	 * Test series to determine the nature of the @ModelAttribute annotation (on a method)
	 */
	//Test 1: Demonstrating the usage of @ModelAttribute annotation (on a method)
	//to add multiple attributes
	@ModelAttribute
	public void modelAttributeTest1(Model model) {
		System.out.println("INSIDE modelAttributeTest1 " + System.currentTimeMillis());
		model.addAttribute("testdata1A", "Welcome to the @ModelAttribute test bed");
		model.addAttribute("testdata1B", "We will test both usages of the @ModelAttribute, on methods and in method arguments");
	}

}
