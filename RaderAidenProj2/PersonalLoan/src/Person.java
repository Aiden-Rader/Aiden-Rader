
public abstract class Person 
{
	protected String name;
	protected String licenseNumber;
	protected String address;
	
	public String getName() // Getter
	{
		return name;
	}
	
	public void setName(String name) //Setter
	{
		this.name = name;
	}
	
	public String getLicenseNumber() // Getter
	{
		return licenseNumber;
	}
	
	public void setLicenseNumber(String licenseNumber) //Setter
	{
		this.licenseNumber = licenseNumber;
	}
	
	public String getAddress() // Getter
	{
		return address;
	}
	
	public void setAddress(String address) //Setter
	{
		this.address = address;
	}
}
