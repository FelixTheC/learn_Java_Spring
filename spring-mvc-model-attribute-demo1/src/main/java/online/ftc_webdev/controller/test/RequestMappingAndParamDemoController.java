package online.ftc_webdev.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(value="/requestMappingAndParamDemo")
@Controller
public class RequestMappingAndParamDemoController {
	
	@RequestMapping(value="/home")
	public String home() {
		return "requestMappingAndParamHome";
	}
	
	//test 1: testing @RequestParam without explicit attributes
	@RequestMapping("/test1")
	public String requestMappingAndParamDemotest1(@RequestParam("orgName") String orgName, Model model) {
		model.addAttribute("orgName", orgName);
		model.addAttribute("testSerial", "test1");
		return "requestMappingAndParamResults";
	}
	
	//test 2: testing @RequestMapping "method" attributes
	@RequestMapping(value="/test2", method=RequestMethod.GET)
	public String requestMappingAndParamTest2(@RequestParam("orgName") String orgName, Model model) {
		model.addAttribute("orgName", orgName);
		model.addAttribute("testSerial", "test2");
		return "requestMappingAndParamResults";
	}

	//test 3: testing @RequestMapping fall back feature
		@RequestMapping(value="*", method=RequestMethod.GET)
		//@RequestMapping(value="*", method= {RequestMethod.GET, RequestMethod.POST})
		public String requestMappingAndParamTest3() {
			return "fallback";
		}
}
