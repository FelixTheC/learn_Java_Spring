package online.ftc_webdev;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.BadSqlGrammarException;

import online.ftc_webdev.dao.OrganizationDao;
import online.ftc_webdev.domain.Organization;

public class JdbcTemplateExceptionApp {

	public static void main(String[] args) {
		
		//create the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans_cp.xml");
		
		//create the bean
		OrganizationDao dao = (OrganizationDao) ctx.getBean("orgDao");
		
		List<Organization> orgs = null;
		
		try {
			
			orgs = dao.getAllOrganizations();
			for (Organization org : orgs) {
				System.out.println(org);
			}
			
		} catch(BadSqlGrammarException bge) {
			
			System.out.println("Message: " + bge.getMessage() );
			System.out.println("Class: " + bge.getClass() );
			
		} catch(DataAccessException dae) {
			
			System.out.println("Message: " + dae.getMessage() );
			System.out.println("Class: " + dae.getClass() );
		
		}
		
		//close the application Context
		((ClassPathXmlApplicationContext)ctx).close();
		
	}

}
