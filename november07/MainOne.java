package org.main.testone;
//import com.demo.exampleone.ExampleOne;
public class MainOne
{
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		com.demo.exampleone.ExampleOne e1 = new com.demo.exampleone.ExampleOne();
		int intResult = e1.sum('A',87);
		double doubleResult = e1.sum(45.5,65.0);
		System.out.println("End of Main Method");
	}
}