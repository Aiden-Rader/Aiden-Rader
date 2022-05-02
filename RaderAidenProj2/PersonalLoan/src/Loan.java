
public class Loan extends Account //Extension of the Account class
{
	protected double annualInterestRate;
	private int numberOfYears;
	private java.util.Date loanDate;
	protected String name;
	
	public Loan(String name) //First Constructor
	{
		this.name = name;
	}
	public Loan(long accNumber, double accBalance, double annualInterestRate, int numOfYears, String name) //Second Constructor
	{
		this.accountNumber = accNumber;
		this.accountBalance = accBalance;
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numOfYears;
		this.name = name;
	}
	
	//Setter methods
	public double getAnnualInterestRate() //Return annualInterestRate
	{
		return annualInterestRate;
	}
	
	public int getNumberOfYears( )//Return numOfYears
	{
		return numberOfYears;
	}
	
	public java.util.Date getLoanDate() //Return the object loanDate with date attached
	{
		return loanDate;
	}
	
	public String getName() //Return name
	{
		return name;
	}
	
	//Getter methods
	public void setAnnualInterestRate(double annualInterestRate) //Setter
	{
		this.annualInterestRate = annualInterestRate;
	}
	
	public void setNumberOfYears(int numOfYears) //Setter for NumOfYears
	{
		this.numberOfYears = numOfYears;
	}
	
	public double getMonthlyPayment() //Getter
	{
		double monthlyInterestRate = this.annualInterestRate / 1200; //MIR = AIR/1200
		double monthlyPayment = this.accountBalance * monthlyInterestRate / (1 - 1/ Math.pow(1 + monthlyInterestRate, this.numberOfYears * 12)); //MP = AB*MIR/1-1/(1+MIR^(NOY*12))
			return monthlyPayment;
	}
	
	public double getTotalPayment() //Getter
	{
		double totalPayment = getMonthlyPayment() * this.numberOfYears * 12; //TP = MP*NOY*12
			return totalPayment;
		
	}
	
	@Override
	public void setAccountBalance(double balance) //Setter from abstract method setAccountBalance
	{
		this.accountBalance = balance;
	}

}
