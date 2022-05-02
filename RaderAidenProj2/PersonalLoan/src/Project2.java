import java.io.*;
import java.util.Scanner; 

public class Project2
{

	public static void main(String[] args) throws Exception
	{
		// create File object
		File x = new File("input.txt"); //Creates a text file in the program file
		
		// create printWriter
		PrintWriter a = new PrintWriter("output.txt"); //Creates the output text file in the program file
		
		//Declare scanner
		Scanner input = new Scanner(x); //Declared scanner
		
		try //The Try-Catch
		{
			String objectType; 

			do 
			{
				objectType = input.nextLine(); 
				switch(objectType) //Change the object type, ex. Employee, Customer, etc.
				{
					case "Employee": //Employee.java
					{
						Employee emp;
						int constructorSelector = Integer.parseInt(input.nextLine());
						if (constructorSelector == 1) 
						{
							emp = new Employee(input.nextLine(),input.nextLine(), input.nextLine(), Integer.parseInt(input.nextLine())); //Call the first constructor
						}
						else
						{
							throw new Exception("error"); 
						}
						
						int methodSelector;
						
						do
						{
							methodSelector= Integer.parseInt(input.nextLine()); 
							
							
							switch(methodSelector) //Throughout the whole program, this code allows user to select which method and print out the output.
							
							{
							//a.println is the printwriter
							//System.out.println is to the console
							case 1:
							{
								a.println(emp.getName()); 
								System.out.println(emp.getName()); 
								break; 
							}
							case 2: 
							{
								a.println(emp.getAddress()); 
								System.out.println(emp.getAddress()); 
								break;
							}
							case 3:
							{
								a.println(emp.getLicenseNumber());
								System.out.println(emp.getLicenseNumber());
								break;
							}
							case 4:
							{
								a.printf("%08d\n",emp.getEmployeeID());
								System.out.printf("%08d\n",emp.getEmployeeID());
								break;
							}
							case 5:
							{
								emp.setName(input.nextLine());
								break;
							}
							case 6:
							{
								emp.setAddress(input.nextLine());
								break;
							}
							case 7:
							{
								emp.setLicenseNumber(input.nextLine());
								break;
							}
							case 8:
							{
								emp.setEmployeeID(Integer.parseInt(input.nextLine()));
								break;
							}
							
							default:
							{
								methodSelector = 0;	
								break;
							}
						}
							
					}
						while(methodSelector != 0);
							break;
					}
					case "Customer": //Customer.java
					{
						Customer cus;
						int constructorSelector = Integer.parseInt(input.nextLine());
						if (constructorSelector == 1)
						{
							cus = new Customer(input.nextLine(),input.nextLine(), input.nextLine());  //Call the first constructor
						}
						else
						{
							throw new Exception("error");
						}
						int methodSelector;
						
						do
						{
							methodSelector= Integer.parseInt(input.nextLine());
							
							switch(methodSelector) //This code allows user to select which method and print out the output.
							
							{
							//a.println is the printwriter
							//System.out.println is to the console
							case 1:
							{
								a.println(cus.getName());
								System.out.println(cus.getName());
								break;
							}
							case 2:
							{
								a.println(cus.getAddress());
								System.out.println(cus.getAddress());
								break;
							}
							case 3:
							{
								a.println(cus.getLicenseNumber());
								System.out.println(cus.getLicenseNumber());
								break;
							}
							case 4:
							{
								cus.setName(input.nextLine());
								break;
							}
							case 5:
							{
								cus.setAddress(input.nextLine());
								break;
							}
							case 6:
							{
								cus.setLicenseNumber(input.nextLine());
								break;
							}
							default:
							{
								methodSelector = 0;	
								break;
							}
						}
							
					}
						while(methodSelector != 0);
						
						break;
					}
					case "Loan": //Loan.java
					{
						Loan loan;
						int constructorSelector = Integer.parseInt(input.nextLine());
						if (constructorSelector == 1)
						{
							loan = new Loan(input.nextLine()); //Call the first constructor
						}
						else if(constructorSelector == 2)
						{
							loan = new Loan(Long.parseLong(input.nextLine()),Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine()), input.nextInt(), input.nextLine()); //Call the second constructor				
						}
						else
						{
							throw new Exception("error");
						}
						int methodSelector;
						
						do
						{
							methodSelector= Integer.parseInt(input.nextLine());
							
							switch(methodSelector) //This code allows user to select which method and print out the output.
							
							{
							//a.println is the printwriter
							//System.out.println is to the console
							case 1:
							{
								a.printf("%.2f\n",loan.getAccountBalance());
								System.out.printf("%.2f\n",loan.getAccountBalance());
								break;
							}
							case 2:
							{
								a.println(loan.getAccountNumber());
								System.out.println(loan.getAccountNumber());
								break;
							}
							case 3:
							{
								a.println(loan.getAnnualInterestRate());
								System.out.println(loan.getAnnualInterestRate());
								break;
							}
							case 4:
							{
								a.println(loan.getNumberOfYears());
								System.out.println(loan.getNumberOfYears());
								break;
							}
							case 5:
							{
								a.println(loan.getLoanDate());
								System.out.println(loan.getLoanDate());
								break;
							}
							case 6:
							{
								a.println(loan.getName());
								System.out.println(loan.getName());
								break;
							}
							case 7:
							{
								loan.setAccountBalance(Double.parseDouble(input.nextLine()));
								break;
							}
							case 8:
							{
								loan.setAnnualInterestRate(Double.parseDouble(input.nextLine()));
								break;
							}
							case 9:
							{
								loan.setNumberOfYears(Integer.parseInt(input.nextLine()));
								break;
							}
							case 10:
							{
								a.printf("%.2f\n",loan.getMonthlyPayment());
								System.out.printf("%.2f\n",loan.getMonthlyPayment());
								break;
							}
							case 11:
							{
								a.printf("%.2f\n",loan.getTotalPayment());
								System.out.printf("%.2f\n",loan.getTotalPayment());
								break;
							}
							default:
							{
								methodSelector = 0;	
								break;
							}
						}
							
					}
						while(methodSelector != 0);
						
						break;
					}
					
					case "Checking": //Checking.java
					{
						Checking che;
						int constructorSelector = Integer.parseInt(input.nextLine());
						if (constructorSelector == 1)
						{
							che = new Checking(Double.parseDouble(input.nextLine()),input.nextLine()); //Call the first constructor
						}
						else if(constructorSelector == 2)
						{
							che = new Checking(Long.parseLong(input.nextLine()),Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine()), input.nextLine()); //Call the second constructor
						}
						else
						{
							throw new Exception("error");
						}
						int methodSelector;
						
						do
						{
							methodSelector= Integer.parseInt(input.nextLine());
							
							switch(methodSelector) //This code allows user to select which method and print out the output.
							
							{
							//a.println is the printwriter
							//System.out.println is to the console
							case 1:
							{
								a.printf("%.2f\n",che.getAccountBalance());
								System.out.printf("%.2f\n",che.getAccountBalance());
								break;
							}
							case 2:
							{
								a.println(che.getAccountNumber());
								System.out.println(che.getAccountBalance());
								break;
							}
							case 3:
							{
								che.setAccountBalance(Double.parseDouble(input.nextLine()));
								break;
							}
							case 4:
							{
								a.println(che.getAnnualIntrestRate());
								System.out.println(che.getAnnualIntrestRate());
								break;
							}
							case 5:
							{
								a.println(che.getName());
								System.out.println(che.getName());
								break;
							}
							case 6:
							{
								che.setAnnualInterestRate(Double.parseDouble(input.nextLine()));
								break;
							}
							case 7:
							{
								che.makeDeposit(Double.parseDouble(input.nextLine()));
								break;
							}
							case 8:
							{
								che.makeWithdrawal(Double.parseDouble(input.nextLine()));
								break;
							}
			
							default:
							{
								methodSelector = 0;	
								break;
							}
						}
							
					}
						while(methodSelector != 0);
						
						break;
					}
					case "Savings": //Savings.java
					{
						Savings sav;
						int constructorSelector = Integer.parseInt(input.nextLine());
						if (constructorSelector == 1)
						{
							sav = new Savings(Double.parseDouble(input.nextLine()),input.nextLine());//Call the first constructor
						}
						else if(constructorSelector == 2)
						{
							sav = new Savings(Long.parseLong(input.nextLine()),Double.parseDouble(input.nextLine()), Double.parseDouble(input.nextLine()), input.nextLine()); //Call the second constructor
						}
						else
						{
							throw new Exception("error");
						}
						int methodSelector;
						
						do
						{
							methodSelector= Integer.parseInt(input.nextLine());
							
							switch(methodSelector) //This code allows user to select which method and print out the output.
							
							{
							//a.println is the printwriter
							//System.out.println is to the console
							case 1:
							{
								a.printf("%.2f\n",sav.getAccountBalance());
								System.out.printf("%.2f\n",sav.getAccountBalance());
								break;
							}
							case 2:
							{
								a.println(sav.getAccountNumber());
								System.out.println(sav.getAccountBalance());
								break;
							}
							case 3:
							{
								sav.setAccountBalance(Double.parseDouble(input.nextLine()));
								break;
							}
							case 4:
							{
								a.println(sav.getAnnualIntrestRate());
								System.out.println(sav.getAnnualIntrestRate());
								break;
							}
							case 5:
							{
								a.println(sav.getName());
								System.out.println(sav.getName());
								break;
							}
							case 6:
							{
								sav.setAnnualInterestRate(Double.parseDouble(input.nextLine()));
								break;
							}
							case 7:
							{
								sav.makeDeposit(Double.parseDouble(input.nextLine()));
								break;
							}
							case 8:
							{
								sav.makeWithdrawal(Double.parseDouble(input.nextLine()));
								break;
							}

							default:
							{
								methodSelector = 0;	
								break;
							}
						}	
					}
						while(methodSelector != 0);
						
						break;
					}
					default:
				}
			}
			
			while(!objectType.equals("0"));	
		}
		catch(Exception e) //Try-Catch method
		{
			e.printStackTrace();
			System.out.println("error");
		}
		//Closes printwriter and console output
		a.close();
		input.close();
	}
	
}
