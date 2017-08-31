package online.ftc_webdev;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import online.ftc_webdev.dao.OrganizationDao;
import online.ftc_webdev.domain.Organization;

@Service
public class DaoUtils {
	
	public final String createOperation = "CREATE";
	public final String updateOperation = "UPDATE";
	public final String deleteOperation = "DELETE";
	public final String readOperation = "READ";
	public final String truncateOperation = "TRUNCATE";
	
	
	public void printOrganizations(List<Organization> orgs, String operation) {
		System.out.println("*****************" + operation + "*********************");
		for (Organization org:orgs) {
			System.out.println(org);
		}
	}
	
	
	public void printOrganization(Organization org, String operation) {
		System.out.println("*****************" + operation + "*********************\n" + org + "\n");
	}
	
	
	public void printSuccessFailure(boolean param, String operation) {
		if(param) {
			System.out.println("\n" + operation + " successful" + "\n");
		}
		else {
			System.out.println("\n" + operation + " failed" + "\n");
		}
	}
	
	
	public void createSeedData(OrganizationDao dao) {
		Organization org1 = new Organization("Amazon", 1994, "65656", 8526, "Work hard, have fun, make history");
		Organization org2 = new Organization("Google", 1996, "54636", 6526, "Don't be evil");
		
		List<Organization> orgs = new ArrayList<Organization>();
		orgs.add(0, org1);
		orgs.add(1, org2);
		
		int createCount = 0;
		for (Organization org: orgs) {
			boolean isCreated = dao.create(org);
			if(isCreated) {
				createCount += 1;
			}
		}
		
		System.out.println("Created " + createCount + " Organizations");
	}
	
	
	public void printOrganizationCount(List<Organization> orgs, String operation) {
		System.out.println("\n We have " + orgs.size() + " organizations after "+ operation);
	}
	
}
