package models;
import java.lang.*;

public class Passenger extends User
{
	private String memberShipType;
	private String status;
	
	public Passenger()
	{
		super();
	}
	
	public Passenger(String userId, String name, String gender, int age, String email, String phoneNo, String address, String nid, int role, String password, String memberShipType, String status)
	{
		super(userId, name, gender, age, email, phoneNo, address, nid, role, password);
		this.memberShipType = memberShipType;
		this.status = status;
	}
	
	public void setMemberShiptype(String memberShipType)
	{
		this.memberShipType = memberShipType;
	}
	
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	public String getMemberShipType()
	{
		return this.memberShipType;
	}
	
	public String getStatus()
	{
		return this.status;
	}	
	
	public String toStringPassenger()
	{
		String str = this.memberShipType+","+this.status+"\n";
		
		return str;
	}
	
	public Passenger formPassenger(String str)
	{
		String data[] = str.split(",");
		
		Passenger p = new Passenger();
		
		p.setMemberShiptype(data[0]);
		p.setStatus(data[1]);
		
		return p;
	}
	
}