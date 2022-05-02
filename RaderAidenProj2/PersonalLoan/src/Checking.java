import java.io.File;
import java.io.PrintWriter;

public class Checking extends Account //Extension of the Account class
{
	protected double annualInterestRate;
	protected String name;
	
	public Checking(double annualIntrestRate, String name) //First Constructor
	{
		this.annualInterestRate = annualIntrestRate;
		this.name = name;
		
	}
	
	public Checking(long accNumber, double accBalance, double annualIntrestRate, String name) //Second Constructor 
	{
		this.accountNumber = accNumber;
		this.accountBalance = accBalance;
		this.annualInterestRate = annualIntrestRate;
		this.name = name;
	}
	
	public double getAnnualIntrestRate() //Getter
	{
		return annualInterestRate;
		
	}
	
	public String getName() //Getter
	{
		return name;
		
	}
	
	public void setAnnualInterestRate(double annualInterestRate) //Setter
	{
		this.annualInterestRate = annualInterestRate;
	}
	
	public void makeDeposit(double deposit) //Deposit method
	{
		double newBalance = accountBalance + deposit;
        accountBalance = newBalance;
	}
	
	public void makeWithdrawal(double withdrawal) //Withdrawal method
	{
		try 
		{
			File x = new File("output.txt");
			PrintWriter pW = new PrintWriter(x);
			
			if (accountBalance < withdrawal + 1)  //If account balance is less than withdrawal amount, add $1 to withdrawal as a fee
			{
				
				pW.println("overdraft");
				
				pW.close();
			}
			
		} 
		catch (Exception e) 
		{
			System.out.println("overdraft");
			e.printStackTrace();
		}
		
		double newBalance = accountBalance - withdrawal - 1;
		accountBalance = newBalance;

	}
	
	@Override
	public void setAccountBalance(double balance) //Setter from abstract method setAccountBalance
	{
		accountBalance = balance;
	}
}
