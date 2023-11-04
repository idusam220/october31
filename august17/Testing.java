public class Testing
{
	String name;

	public Testing(String name)
	{
       this.name = name;
       System.out.println("Name is : "+name);

	}
	public void m4()
	{
		System.out.println("Hi");
	}
	public static void main(String[]samVenant)
	{
	    System.out.println("Start of Main Method");
	    Testing t1 = new Testing("Sam");
	    System.out.println("End of main method");
    }
}