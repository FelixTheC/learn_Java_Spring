package online.ftc_webdev;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import online.ftc_webdev.dao.OrganizationDao;
import online.ftc_webdev.domain.Organization;

@Service
public class DaoUtils {
	
	private static Logger LOGGER = LoggerFactory.getLogger("Logging Tester");
	
	public final String createOperation = "CREATE";
	public final String updateOperation = "UPDATE";
	public final String deleteOperation = "DELETE";
	public final String readOperation = "READ";
	public final String truncateOperation = "TRUNCATE";
	
	
	public void printOrganizations(List<Organization> orgs, String operation) {
		LOGGER.info("*****************" + operation + "*********************");
		for (Organization org:orgs) {
			LOGGER.info(org.toString());
		}
	}
	
	
	public void printOrganization(Organization org, String operation) {
		LOGGER.info("*****************" + operation + "*********************\n" + org + "\n");
	}
	
	
	public void printSuccessFailure(boolean param, String operation) {
		if(param) {
			LOGGER.info("\n" + operation + " successful" + "\n");
		}
		else {
			LOGGER.info("\n" + operation + " failed" + "\n");
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
		
		LOGGER.info("Created " + createCount + " Organizations");
	}
	
	
	public void printOrganizationCount(List<Organization> orgs, String operation) {
		LOGGER.info("\n We have " + orgs.size() + " organizations after "+ operation);
	}
	
}
