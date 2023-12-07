package harris.david.eric.examplethree;
public class ParentExThree extends ParentExTwo
{
	int contactNumber;
	public ParentExThree()
	{
		System.out.println("Start of ParentExThree()");
		System.out.println("End of ParentExThree()");
	}
	public ParentExThree(String firstName,String middleName, String lastName,int contactNumber)
	{
		super(firstName,middleName,lastName);
		this.contactNumber = contactNumber;
		System.out.println("Enf of ParentExThree()constructor");
	}
	public String toString()
	{
		return "First Name is : "+firstName+" Middle Name is : "+middleName+" Last Name is : "+lastName+" contactNumber is :"+contactNumber;
	}
}