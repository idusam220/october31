public class CalculatorEx
{
	public double add(double a ,double b)
	{
     double result = a + b;
     return result;
	}
	public int add(int a , int b)
	{
	int result = a + b;
	return result;
}
public static void main(String[]args)
{
	System.out.println("Start of Main Method");
	CalculatorEx ce = new CalculatorEx();
	 int output1 =ce.add(10,20);
	 double output2 =ce.add(34.0,12.0);
	 System.out.println("The output is :"+output1);
	 System.out.println("The output two is"+output2);
	 System.out.println("End of Main Method");
}
}