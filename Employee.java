package models;
import java.lang.*;

public class Employee extends User
{
	private String designation;
	private double salary;
	
	public Employee()
	{
		super();
	}
	
	public Employee(String userId, String name, String gender, int age, String email, String phoneNo, String address, String nid, int role, String password, String designation, double salary)
	{
		super(userId, name, gender, age, email, phoneNo, address, nid, role, password);
		this.designation = designation;
		this.salary = salary;
	}
	
	public void setDesignation(String designation)
	{
		this.designation = designation;
	}
	
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public String GetDesignation()
	{
		return this.designation;
	}
	
	public double getSalary()
	{
		return this.salary;
	}
	
	public String toStringEmployee()
	{
		String str = this.designation+","+this.salary+"\n";
		
		return str;
	}
	
	public Employee formEmployee(String str)
	{
		String data[] = str.split(","); //"software engineer, 100" = "software engineer" "100"
		
		Employee em = new Employee();
		
		em.setDesignation(data[0]);
		em.setSalary(Double.parseDouble(data[1]));
		
		return em;
	}
	
}