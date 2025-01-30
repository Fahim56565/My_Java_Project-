package models;
import java.lang.*;

public class User
{
	protected String userId;
	protected String name;
	protected String gender;
	protected int age;
	protected String email;
	protected String phoneNo;
	protected String address;
	protected String nid;
	protected int role; 
	protected String password;
	
	public User()
	{
		
	}
	
	public User (String userId, String name, String gender, int age, String email, String phoneNo, String address, String nid, int role, String password)
	{
		this.userId = userId;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
		this.nid = nid;
		this.role = role;
		this.password = password;
	}
	
	public void setUserId(String userId)
	{
		this.userId = userId;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setGender(String gender)
	{
		this.gender = gender;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public void setPhoneNo(String phoneNo)
	{
		this.phoneNo = phoneNo;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public void setNid(String nid)
	{
		this.nid = nid;
	}
	
	public void setRole(int role)
	{
		this.role = role;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getUserId()
	{
		return  this.userId;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getGender()
	{
		return this.gender;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	public String PhoneNo()
	{
		return this.phoneNo;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	
	public String getNid()
	{
		return this.nid;
	}
	
	public int getRole()
	{
		return this.role;
	}
	
	public String getPassword()
	{
		return this.password;
	}
	
	public String toStringUser()
	{
		String str = this.userId+","+this.name+","+this.gender+","+this.age+","+this.email+","+this.phoneNo+","+this.address+","+this.nid+","+this.role+","+this.password+"\n";
		
		return str;
	}
	
	public User formUser(String str)
	{
		String data[] = str.split(",");
		
		User u = new User();
		
		u.setUserId(data[0]);
		u.setName(data[1]);
		u.setGender(data[2]);
		u.setAge(Integer.parseInt(data[3]));
		u.setEmail(data[4]);
		u.setPhoneNo(data[5]);
		u.setAddress(data[6]);
		u.setNid(data[7]);
		u.setRole(Integer.parseInt(data[8]));
		u.setPassword(data[9]);
		
		return u;	
	}
}