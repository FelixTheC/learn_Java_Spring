package online.ftc_webdev.spring_challange;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class IOCAppChallange1 {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/beans-challange.xml");
		City cty = (City) context.getBean("cityName");
		
		cty.cityName();
		
		((FileSystemXmlApplicationContext) context).close();
	}

}
