import java.util.Random;

public abstract class Account 
{
	protected long accountNumber;
	protected double accountBalance;
	
	public Account() //First Constructor
	{	
		 new Random(); //Random class/object
		 
		 this.accountBalance = 0;
		 this.accountNumber = (long)(Math.random()*(10000000000L)); //this will convert any number sequence into 10 character.
	}
	
	public Account(long accNumber, double accBalance) //Second Constructor
	{
		this.accountBalance = accBalance;

		this.accountNumber = accNumber;
	}
	
	public double getAccountBalance() 
	{
		return accountBalance; // Getter
	}
	
	public long getAccountNumber()
	{
		return accountNumber; // Getter
	}
	
	public abstract void setAccountBalance(double balance); //Abstract setter, its in the rest of the program files.
	{

	}
}
