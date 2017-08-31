package online.ftc_webdev.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import online.ftc_webdev.dao.OrganizationDao;
import online.ftc_webdev.domain.Organization;

@Service
public class OrganizationService {
	
	@Autowired
	private OrganizationDao organizationDao;
	
	public List<Organization> getOrgList() {
		List<Organization> orgList = organizationDao.getAllOrganizations();
		return orgList;
	}
}
