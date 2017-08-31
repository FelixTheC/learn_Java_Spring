package online.ftc_webdev.spring_challange;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCAppChallange2 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans-challange.xml");
		
		City cty = (City) context.getBean("cityName");
		
		cty.cityName();
		
		((ClassPathXmlApplicationContext) context).close();
	}

}
