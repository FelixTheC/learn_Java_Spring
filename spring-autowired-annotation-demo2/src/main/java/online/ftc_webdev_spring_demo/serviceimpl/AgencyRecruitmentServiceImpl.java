package online.ftc_webdev_spring_demo.serviceimpl;

import java.util.Random;

public class AgencyRecruitmentServiceImpl implements RecruitmentService {

	public String recruitEmployees(String companyName, String departmentName, int numberOfRecruitment) {
		Random random = new Random();
		String hiringFacts = "\n" + companyName + "'s " + departmentName + " hired " + 
		random.nextInt(numberOfRecruitment) + " employees using varius hiring agencys";
		return hiringFacts;
	}

}
