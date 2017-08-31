package online.ftc_webdev_spring_demo.serviceimpl;

import java.util.Random;

public class ReferralRecruitmentServiceImpl implements RecruitmentService {

	public String recruitEmployees(String companyName, String departmentName, int numberOfRecruitment) {
		Random random = new Random();
		String hiringFacts = "\n" + companyName + "'s " + departmentName + " hired " + 
		random.nextInt(numberOfRecruitment) + " employees which we referrer to the company by employees";
		return hiringFacts;
	}

}
