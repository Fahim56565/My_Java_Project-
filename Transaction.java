package models;
import java.lang.*;

public class Transaction
{
	private String transactionId;
	private String passengerId;
	private String busPassId;
	private String transactionDate;
	private String transactionType;
	private int amount;
	
	public Transaction()
	{
		
	}
	
	public Transaction(String transactionId, String passengerId, String busPassId, String transactionDate, String transactionType, int amount)
	{
		this.transactionId = transactionId;
		this.passengerId = passengerId;
		this.busPassId = busPassId;
		this.transactionDate = transactionDate;
		this.transactionType = transactionType;
		this.amount = amount;
	}
	
	public void setTransactionId(String transactionId)
	{
		this.transactionId = transactionId;
	}
	
	public void setPassengerId(String passengerId)
	{
		this.passengerId = passengerId;
	}
	
	public void setBusPassId(String busPassId)
	{
		this.busPassId = busPassId;
	}
	
	public void setTransactionDate(String transactionDate)
	{
		this.transactionDate = transactionDate;
	}
	
	public void setTransactionType(String transactionType)
	{
		this.transactionType = transactionType;
	}
	
	public void setAmount(int amount)
	{
		this.amount = amount;
	}
	
	public String getTransactionId()
	{
		return this.transactionId;
	}
	
	public String getPassengerId()
	{
		return this.passengerId;
	}
	
	public String getBusPassId()
	{
		return this.busPassId;
	}
	
	public String getTransactionDate()
	{
		return this.transactionDate;
	}
	
	public String getTransactionType()
	{
		return this.transactionType;
	}
	
	public int getAmount()
	{
		return this.amount;
	}
	
	public String toStringTransaction()
	{
		String str = this.transactionId+","+this.passengerId+","+this.busPassId+","+this.transactionDate+","+this.transactionType+","+this.amount+"\n";
		
		return str;
	}
	
	public Transaction formTransaction(String str)
	{
		String data[] = str.split(",");
		
		Transaction ts = new Transaction();
		
		ts.setTransactionId(data[0]);
		ts.setPassengerId(data[1]);
		ts.setBusPassId(data[2]);
		ts.setTransactionDate(data[3]);
		ts.setTransactionType(data[4]);
		ts.setAmount(Integer.parseInt(data[5]));
		
		return ts;
	}
}