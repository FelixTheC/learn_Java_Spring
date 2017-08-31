package online.ftc_webdev.spring_demo_1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCApp2 {

	public static void main(String[] args) {
		// create application context (container)
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");

		//create the bean
		Organization org = (Organization) ctx.getBean("myorg");
		
		//invoke company slogan
		org.companySlogan();
		
		// close the application context
		((ClassPathXmlApplicationContext) ctx).close();
		
	}

}
