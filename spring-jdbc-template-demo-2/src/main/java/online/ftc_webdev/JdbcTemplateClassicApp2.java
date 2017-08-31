package online.ftc_webdev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import online.ftc_webdev.dao.OrganizationDao;
import online.ftc_webdev.domain.Organization;

public class JdbcTemplateClassicApp2 {

	public static void main(String[] args) {
		
		//create the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans_cp.xml");
		
		//create the bean
		OrganizationDao dao = (OrganizationDao) ctx.getBean("orgDao");
		DaoUtils.createSeedData(dao);
		
		
		//list organizations
		DaoUtils.printOrganizations(dao.getAllOrganizations(), DaoUtils.readOperation);
		
		//create a new organization record
		Organization org = new Organization("General Electric", 1978, "98989", 7565, "Imagin at Work");
		boolean isCreated = dao.create(org);
		DaoUtils.printSuccessFailure(isCreated, DaoUtils.createOperation);
		
		//list organizations with new record
		DaoUtils.printOrganizations(dao.getAllOrganizations(), DaoUtils.readOperation);
		
		//get a single organization
		Organization org2 = dao.getOrganization(1);
		DaoUtils.printOrganization(org2, "getOrganization");
		
		//updating slogan for organization
		Organization org3 = dao.getOrganization(2);
		org3.setSlogan("We are ** awesome ** ");
		boolean isUpdated = dao.update(org3);
		DaoUtils.printSuccessFailure(isUpdated, DaoUtils.updateOperation);
		DaoUtils.printOrganization(org3, DaoUtils.updateOperation);
		
		//list organizations again
		DaoUtils.printOrganizations(dao.getAllOrganizations(), DaoUtils.readOperation);
		
		//delete one organization
		boolean isDeleted = dao.delete(dao.getOrganization(1));
		DaoUtils.printSuccessFailure(isDeleted, DaoUtils.deleteOperation);
		DaoUtils.printOrganizations(dao.getAllOrganizations(), DaoUtils.readOperation);
		
		
		//close the application Context
		((ClassPathXmlApplicationContext)ctx).close();
		
	}

}
