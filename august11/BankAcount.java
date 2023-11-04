//Defined or Declared Bank account class
public class BankAcount
{   //Defined or declared the instance variables
	public String bankName;
	public int    accountNumber;
	public String accountHoldersName;
	public double balance;
    //Defined of declared constructor
	public BankAccount(String bankName,int accountNumber,String accountHoldersName,double balance)
	{
	  System.out.println("Start of constructor");
	  this.bankName            = bankName;
	  this.accountNumber       = accountNumber;
	  this.accountHoldersName  = accountHouldersName;
	  this.balance             = balance;
	  System.out.println("Bank Name is : "+bankName +"Account number is : "+accountNumber + "Account Holders Name is : "+accountHoldersName + "Balance is : "+balance);
	  System.out.println("End Of constructor");

	}
	//Defined or declared non static m1 method
	public void m1()
	{
		System.out.println("m1 non static method");
	}
	//Defined or declared the non static parameterized method
	public void m2(int i)
	{
		System.out.println("m2 non static method");
	}
	//defined or declared the main method
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		//creating an object i.e instatiation
		BankAcount b1 = new BankAccount("Bank of America",12334,"James Gosling",9000.00);
		BankAcount b2 = new BankAccount("JP Morgan",45677,"Brendan Eich",9000.00);
		b1.m2('E');
		b2.m2(23);
		b1.m1();
		System.out.println("End of Main Method");
	}
}