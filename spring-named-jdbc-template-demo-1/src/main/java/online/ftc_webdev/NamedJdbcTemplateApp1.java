package online.ftc_webdev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import online.ftc_webdev.dao.OrganizationDao;
import online.ftc_webdev.domain.Organization;

@Component
public class NamedJdbcTemplateApp1 {

	@Autowired
	private OrganizationDao dao;
	
	@Autowired
	private DaoUtils daoU;
	
	public void actionMethod() {
		
		//creating seed data
		daoU.createSeedData(dao);
		
		//list organizations
		daoU.printOrganizations(dao.getAllOrganizations(), daoU.readOperation);
		
		//create a new organization record
		Organization org = new Organization("General Electric", 1978, "98989", 7565, "Imagin at Work");
		boolean isCreated = dao.create(org);
		daoU.printSuccessFailure(isCreated, daoU.createOperation);
		
		//list organizations with new record
		daoU.printOrganizations(dao.getAllOrganizations(), daoU.readOperation);
		
		//get a single organization
		Organization org2 = dao.getOrganization(1);
		daoU.printOrganization(org2, "getOrganization");
		
		//updating slogan for organization
		Organization org3 = dao.getOrganization(2);
		org3.setSlogan("We are ** awesome ** ");
		boolean isUpdated = dao.update(org3);
		daoU.printSuccessFailure(isUpdated, daoU.updateOperation);
		daoU.printOrganization(org3, daoU.updateOperation);
		
		//list organizations again
		daoU.printOrganizations(dao.getAllOrganizations(), daoU.readOperation);
		
		//delete one organization
		boolean isDeleted = dao.delete(dao.getOrganization(1));
		daoU.printSuccessFailure(isDeleted, daoU.deleteOperation);
		daoU.printOrganizations(dao.getAllOrganizations(), daoU.readOperation);
		
		//cleanup
		dao.cleanup();
		daoU.printOrganizationCount(dao.getAllOrganizations(), daoU.truncateOperation);
	}
	
	
	public static void main(String[] args) {
		
		//create the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans_cp.xml");
		
		NamedJdbcTemplateApp1 mainApp = ctx.getBean(NamedJdbcTemplateApp1.class);
		mainApp.actionMethod();
		
		//close the application Context
		((ClassPathXmlApplicationContext)ctx).close();
			
	}

}
