package online.ftc_webdev.dao;

import online.ftc_webdev.domain.Organization;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.stereotype.Service;


public interface OrganizationDao {

	//Set the data-source that will be required to crate a connection to the database
	public void setDataSource(DataSource ds);
	
	//Create a record in the organization table
	public boolean create(Organization org);
	
	//Retrieve a single organization
	public Organization getOrganization(Integer id);
	
	//Retrieve all organizations
	public List<Organization> getAllOrganizations();
	
	//Delete specific organization from table
	public boolean delete(Organization org);
	
	//Update a specific organization
	public boolean update(Organization org);
	
	
	public void cleanup();
}
