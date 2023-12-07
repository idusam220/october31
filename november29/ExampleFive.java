package org.jack.kyle.examplefive;
import com.gaga.patric.exampleone.ExampleOne;
public class ExampleFive extends ExampleOne
{
	String passportId;
	public ExampleFive()
	{
		System.out.println("Start of ExampleFive()");
		System.out.println("End of ExampleFive");
	}
	public ExampleFive(String emailId,String userName,String userLocation,String passportId)
	{
		super(emailId,userName,userLocation);
		System.out.println("Start of ExampleFive()");
		this.passportId = passportId;
		System.out.println("End of ExampleFive");

	}
	public static void m11(int valueOne)
	{
		System.out.println("Start of m11()");
		System.out.println("The value one is : "+valueOne);
		System.out.println("End of m11()");

	}
	public String toString()
	{
		String parentData = super.toString();
		return parentData+" "+"Passport Id Is : "+passportId;
	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		ExampleOne e1 = new ExampleOne();
		ExampleOne e2 = new ExampleOne("Kyle11@gmail.com","Kyle","LA");
		ExampleFive e3 = new ExampleFive("nathan12@gmail.com","Nathan","New Zeland","A101");
		m11('A');
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println("End of Main Method");

	}

}