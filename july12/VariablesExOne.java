public class VariablesExOne
{//Start of the class or Open the class
	static String societyName ="Barbados Society";//static variable
	int numberOfPeople= 2500;//instance or non static variable 
	double maintenanceFees =1200.00;// non static variable
	String ownerName ="James Gosling";//instance or non static variable
	public void playInTheGround()
	{//Start of playInTheGround
		System.out.println("Start of playInTheGround method");
		int numberOfChildren =1200; // local variable to playInTheGround
		int numberOfChairs =1500; // local variable to playInTheGround

		System.out.println("Total Number of children play in society playground is : +numberofChildren");
		System.out.println("Total number of chairs in the society playground is :"+numberOfChairs);
		System.out.println("End of Playground method");

	}//close of playInTheGround method
	public void payTaxes(int amount)// Here amount is a parameter or formal parameter
	{//open of payTaxes method
		System.out.println("Start of Pay taxes method");
		System.out.println("Pay amount of tax is :"+amount);
		int total =amount;// Here total is a local varible to payTaxes

		System.out.println("Total of tax amount in month is :"+total);
		System.out.println("End of pay taxes method");


	}
	public void m1()
	{//Start of m1() method
		System.out.println("Start of m1 method");
		int numberOne = 10; //local variable to m1() method
		int numberTwo =20; // local variable to m1()method
		int finalResult = numberOne+numberTwo;//local variable to m1()method
		System.out.println("The final result is :"+finalResult);
		System.out.println("End of m1 method");

	}// close of m1()method
	public static void main(String[]args)
	{//start of Main Method
	System.out.println("Start of Main Method");
	VariablesExOne vo = new VariablesExOne();
	vo.m1();
	int i =89;// local variable to main() method
	vo.playInTheGround();
	vo.payTaxes(9000);//9000 is argument or actuel parameter
	System.out.println("End of Main Method");
}//close of Main Method


}//close of class

