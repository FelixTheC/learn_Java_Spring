package online.ftc_webdev.spring_demo.domain;

import online.ftc_webdev_spring_demo.serviceimpl.RecruitmentService;

public class HumanResourcesDept implements Department {

	private String deptName;
	private RecruitmentService recruitmentService;
	private Organization organization;
	
	
	
	public HumanResourcesDept(RecruitmentService recruitmentService, Organization organization) {
		super();
		this.recruitmentService = recruitmentService;
		this.organization = organization;
	}



	public String getDeptName() {
		return deptName;
	}



	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}



	public String hiringStatus(int numberOfRecruitments) {
		String hiringFacts = recruitmentService.recruitEmployees(organization.getCompanyName(), deptName, numberOfRecruitments);
		return hiringFacts;
	}

}
