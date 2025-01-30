package models;
import java.lang.*;

public class BusPass
{
	private String busPassId;
	private String passengerId;
	private String busId;
	private String issueDate;
	private String expireDate;
	private String passType;
	private String status;
	
	public BusPass()
	{
		
	}
	
	public BusPass(String busPassId, String passegerId, String busId, String issueDate, String expireDate, String passType, String status)
	{
		this.busPassId = busPassId;
		this.passengerId = passengerId;
		this.busId = busId;
		this.issueDate = issueDate;
		this.expireDate = expireDate;
		this.passType = passType;
		this.status = status;
	}
	
	public void setBusPassId(String busPassId)
	{
		this.busPassId = busPassId;
	}
	
	public void setPassengerId(String passengerId)
	{
		this.passengerId = passengerId;
	}
	
	public void setBusId(String busId)
	{
		this.busId = busId;
	}
	
	public void setIssueDate(String issueDate)
	{
		this.issueDate = issueDate;
	}
	
	public void setExpireDate(String expireDate)
	{
		this.expireDate = expireDate;
	}
	
	public void setPassType(String passType)
	{
		this.passType = passType;
	}
	
	public void setStatus(String status)
	{
		this.status = status;
	}
	
	public String getBusPassId()
	{
		return this.busPassId;
	}
	
	public String getPassengerId()
	{
		return this.passengerId;
	}
	
	public String getBusId()
	{
		return this.busId;
	}
	
	public String getIssueDate()
	{
		return this.issueDate;
	}
	
	public String getExpireDate()
	{
		return this.expireDate;
	}
	
	public String getPassType()
	{
		return this.passType;
	}
	
	public String getStatus()
	{
		return this.status;
	}
	
	public String toStringBusPass()
	{
		String str = this.busPassId+","+this.passengerId+","+this.busId+","+this.issueDate+","+this.expireDate+","+this.passType+","+this.status+ "\n";
		
		return str;
	}
	
	public BusPass formBusPass(String str)
	{
		String data[] = str.split(",");
		
		BusPass bp = new BusPass();
		
		bp.setBusPassId(data[0]);
		bp.setPassengerId(data[1]);
		bp.setBusId(data[2]);
		bp.setIssueDate(data[3]);
		bp.setExpireDate(data[4]);
		bp.setPassType(data[5]);
		bp.setStatus(data[6]);
		
		return bp;
	}
	
	
	
	
	
}

