package online.ftc_webdev_spring_demo.serviceimpl;

import java.util.Random;

import online.ftc_webdev.spring_demo.service.BusinessService;

public class CloudServiceImpl implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\nAs an Organization, " + companyName +
				" \nThe annual income exceeds " + random.nextInt(revenue) + "€.";
		return service;
	}

}
