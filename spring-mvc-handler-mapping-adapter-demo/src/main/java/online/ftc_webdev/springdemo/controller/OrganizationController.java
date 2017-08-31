package online.ftc_webdev.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import online.ftc_webdev.domain.Organization;
import online.ftc_webdev.springdemo.service.OrganizationService;

@Controller
public class OrganizationController {

	@Autowired
	private OrganizationService organizationService;
	
	
	@RequestMapping("/jstlsql")
	public String listOrganizationUsinigSQLTag() {
		return "listOrganization1";
	}
	
	@RequestMapping("/service")
	public String listOrganizationUsingService(Model model) {
		List<Organization> orgs = organizationService.getOrgList();
		model.addAttribute("orgList", orgs);
		return "listOrganization2";
	}
}
