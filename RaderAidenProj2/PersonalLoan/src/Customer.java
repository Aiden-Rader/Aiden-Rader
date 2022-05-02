
public class Customer extends Person //Extension of the Person Class
{
	public Customer(String name, String address, String licenseNumber) throws Exception  //First Constructor
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

	}
}
