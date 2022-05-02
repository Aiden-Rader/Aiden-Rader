import java.io.File;
import java.io.PrintWriter;

public class Savings extends Account
{
	protected double annualInterestRate; 
	protected String name; 
	
	public Savings(double annualIntrestRate, String name) //First Constructor
	{
		this.annualInterestRate = annualIntrestRate;
		this.name = name;
		
	}
	
	public Savings(long accNumber, double accBalance, double annualIntrestRate, String name) //Second Constructor
	{
		this.accountNumber = accNumber;
		this.accountBalance = accBalance;
		this.annualInterestRate = annualIntrestRate;
		this.name = name;
	}
	
	public double getAnnualIntrestRate()
	{
		return annualInterestRate;
		
	}
	
	public String getName()
	{
		return name;
		
	}
	
	public void setAnnualInterestRate(double annualInterestRate)
	{
		this.annualInterestRate = annualInterestRate;
	}
	
	public void makeDeposit(double deposit)
	{	
		if (deposit <= 0) 
		{
			System.out.println("Error");
		}

		if (deposit > 10000) 
		{
			deposit += 5;
		}
 
		double newBalance = accountBalance + deposit;
		accountBalance = newBalance;

        //*the bank adds an additional $5 to the accountBalance 
        //*whenever a deposit of $10,000 or more occurs. 
		//You shouldn't have to worry about overdraft for depositing money
	}
	
	public void makeWithdrawal(double withdrawal)
	{
		try 
		{
			File x = new File("output.txt");
			PrintWriter pW = new PrintWriter(x);
			
			if (accountBalance < withdrawal + 1) 
			{
				
				pW.println("overdraft");
				
				pW.close();
			}
			
			else
			{
				double newBalance = accountBalance - withdrawal - 1;
				accountBalance = newBalance;
			}
			
		} 
		catch (Exception e) 
		{
			System.out.println("overdraft");
			e.printStackTrace();
		}
		//Overdrafts should NOT be possible
		//Print out Text file saying overdraft in this method as well, copy from Checking
	}
	@Override
	public void setAccountBalance(double balance) 
	{
		accountBalance = balance;
		
	}
}
