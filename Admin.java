package models;
import java.lang.*;

public class Admin extends User 
{
	private String adminType;
	
	public Admin()
	{
		super();
	}
	
	public Admin(String userId, String name, String gender, int age, String email, String phoneNo, String address, String nid, int role, String password, String adminType)
	{
		super(userId, name, gender, age, email, phoneNo, address, nid, role, password);
		
		this.adminType = adminType;
	}
	
	public void setAdminType(String adminType)
	{
		this.adminType = adminType;
	}
	
	public String getAdminType()
	{
		return this.adminType;
	}
	
	public String toStringAdmin()
	{
		String str = this.adminType+"\n";
		
		return str;
	}
	
	public Admin formAdmin(String str)
	{
		String data[] = str.split(",");
		
		Admin ad = new Admin();
		
		ad.setAdminType(data[0]);
		
		return ad;
	}
}