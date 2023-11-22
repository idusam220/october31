package robin.harris.examplefive;
import java.util.Scanner;
import bob.eric.exampleone.ExampleOne;
public class ExampleFive
{
	private int bankAccountNumber;
	private String bankName;
	private double balance;

	public ExampleFive()
	{
        System.out.println("Start of ExampleFive() Constructor");
        System.out.println("End of ExampleFive) Constructor");
	}
	
	private void m1()
	{
        System.out.println("Start of m1) method of ExampleFour class");
        System.out.println("Your Bank Name is =  Bank Of America");
        System.out.println("End of m1() method of ExampleFour class");
	}
	private void printDetails()
	{
		System.out. println("Your Details are as follows : ");
        System.out. println("Your Bank Account Number is = " + bankAccountNumber);
        System.out.println("Your Bank Name is = " + bankName);
        System.out.println("Your Balance is = "+ balance);
	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		Scanner sc = null;
		int bankNumber = 0;
		String bName = null;
		sc = new Scanner(System.in);
		System.out.println("Enter Bank Name : ");
		bName = sc.nextLine();
		System.out.println("Please enter your Bank account number : ");
		bankNumber = sc.nextInt();
	
		ExampleFive e4 = new ExampleFive();
		e4.bankAccountNumber = bankNumber;
		e4.bankName = bName;
		System.out.println("Your Bank Number is : "+e4.bankAccountNumber);
		System.out.println("Your Bank Name is :"+e4.bankName);
		e4.printDetails();
		e4.m1();
		// System.out.println(e4.id);
		// System.out.println(e4.name);
		// System.out.println(e4.income);
		System.out.println("End of Main Method");


	}
}
