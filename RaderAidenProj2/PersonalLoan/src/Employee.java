
public class Employee extends Person 
{
	private int employeeID;

	public Employee(String name, String address, String licenseNumber, int employeeID) throws Exception
	{
		this.name = name;
		boolean isValid = true;
		for (int i = 0; i < licenseNumber.length(); i++)
		{
			if (i < 2)
			{
				if (!Character.isLetter(licenseNumber.charAt(i)))
				{
					isValid = false;
				}
			} else
			{
				if (!Character.isDigit(licenseNumber.charAt(i)))
				{
					isValid = false;
				}
			}
		}
		if(!isValid)
		{
			throw new Exception("error");
		} else
		{
			this.licenseNumber = licenseNumber; 
		}
		this.address = address;
		this.employeeID = employeeID;
	}

	public int getEmployeeID() 
	{
		return employeeID; // Getter
	}

	public void setEmployeeID(int employeeID) 
	{
		this.employeeID = employeeID; // Setter
	}
}
