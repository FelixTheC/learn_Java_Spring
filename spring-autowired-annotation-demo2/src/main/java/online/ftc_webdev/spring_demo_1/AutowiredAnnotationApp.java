package online.ftc_webdev.spring_demo_1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import online.ftc_webdev.spring_demo.domain.HumanResourcesDept;
import online.ftc_webdev.spring_demo.domain.Organization;

public class AutowiredAnnotationApp {

	public static void main(String[] args) {
		// create application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");

		//create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		
		org.setCompanyName("ftc-webdev");
		org.setYearOfIncorparation(2017);
		
		//invoke company slogan
		System.out.println(org.companySlogan());
		
		//Print Organization details
		HumanResourcesDept hrdept = (HumanResourcesDept) ctx.getBean("humanRessource");
		System.out.println(hrdept.hiringStatus(5505));
		
		// close the application context
		((ClassPathXmlApplicationContext) ctx).close();
		
	}

}
