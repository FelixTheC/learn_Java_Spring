package online.ftc_webdev.spring_demo.domain;

import online.ftc_webdev.spring_demo.service.BusinessService;
public class Organization {
	private String companyName;
	private int yearOfIncorparation;
	private String postalCode;
	private int employeeCount;
	private String slogan;
	private BusinessService businessService;
	
	public Organization(String companyName, int yearOfIncorparation) {
		super();
		this.companyName = companyName;
		this.yearOfIncorparation = yearOfIncorparation;
	}

	public String companySlogan() {
		return slogan;
	}

	
	public String companService() {
		return businessService.offerService(companyName);
	}
	
	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + 
				", yearOfIncorparation=" + yearOfIncorparation +", employeeCount="+employeeCount+"]";
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getYearOfIncorparation() {
		return yearOfIncorparation;
	}

	public void setYearOfIncorparation(int yearOfIncorparation) {
		this.yearOfIncorparation = yearOfIncorparation;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public int getEmpolyeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int empolyeeCount) {
		this.employeeCount = empolyeeCount;
	}

	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public BusinessService getBusinessService() {
		return businessService;
	}

	public void setBusinessService(BusinessService businessService) {
		this.businessService = businessService;
	}

}
