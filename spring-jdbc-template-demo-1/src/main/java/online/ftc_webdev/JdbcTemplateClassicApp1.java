package online.ftc_webdev;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import online.ftc_webdev.dao.OrganizationDao;
import online.ftc_webdev.daoimpl.OrganizationDaoImpl;
import online.ftc_webdev.domain.Organization;

public class JdbcTemplateClassicApp1 {

	public static void main(String[] args) {
		
		//create the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans_cp.xml");
		
		//create the bean
		OrganizationDao dao = (OrganizationDao) ctx.getBean("orgDao");
		List<Organization> orgs = dao.getAllOrganizations();
		for (Organization org : orgs) {
			System.out.println(org);
		}
		
		//close the application Context
		((ClassPathXmlApplicationContext)ctx).close();
		
	}

}
