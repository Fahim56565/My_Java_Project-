package models;
import java.lang.*;

public class BusDetails
{
	private String busId;
	private int busNumber;
	private int capacity;
	private String route;
	private double fare;
	private String status;
	
	public BusDetails()
	{
		
	}
	
	public BusDetails(String busId, int busNumber, int capacity, String route, double fare, String status)
	{
		this.busId = busId;
		this.busNumber = busNumber;
		this.capacity = capacity;
		this.route = route;
		this.fare = fare;
		this.status = status;
	}
	
	public void setBusId(String busId)
	{
		this.busId = busId;
	}
	public void setBusNumber(int busNumber)
	{
		this.busNumber = busNumber;
	}
	public void setCapacity(int capacity)
	{
		this.capacity = capacity;
	}
	public void setRoute(String route)
	{
		this.route = route;
	}
	public void setFare(double Fare)
	{
		this.fare = fare;
	}
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	public String getBusId()
	{
		return this.busId;
	}
	public int getBusNumber()
	{
		return this.busNumber;
	}
	public int getCapacity()
	{
		return this.capacity;
	}
	public String getRoute()
	{
		return this.route;
	}
	public double getFare()
	{
		return this.fare;
	}
	public String getStatus()
	{
		return this.status;
	}
	
	public String toStringBusdetails()
	{
		String str = this.busId+","+this.busNumber+","+this.capacity+","+this.route+","+this.fare+","+this.status+"\n";
		
		return str;
	}
	
	public BusDetails formBusDetails(String str)
	{
		String data[] = str.split(",");
		
		BusDetails bd = new BusDetails();
		
		bd.setBusId(data[0]);
		bd.setBusNumber(Integer.parseInt(data[1]));
		bd.setCapacity(Integer.parseInt(data[2]));
		bd.setRoute(data[3]);
		bd.setFare(Double.parseDouble(data[4])); // problems 4.0
		bd.setRoute(data[5]);
		
		//System.out.println(data[4]);
		
		return bd;	
	}
}