public class MethodExTwo
{
	public double add(double a,double b)
	{
		System.out.println("start of add method");
		double valueOne = a;
		double valueTwo = b;
		System.out.println("The valueOne is :"+valueOne);
		System.out.println("The value two is :"+valueTwo);
		double result = valueOne+valueTwo;
		return result;
		//System.out.println("End of aad method");
		//unreachable statements are not allowed in java.

	}
	public void h1()
	{
	System.out.println("start of h1-method");
	g1();
	System.out.println("End of h1-method");
    }
    public void g1()
    {
    System.out.println("Start of g1-method");
    System.out.println("End of g1-method");
    }
    public static void main(String[]Venant)
    {
    	MethodExTwo mt = new MethodExTwo();
    	mt.h1();
    	double output = mt.add(23.4,12.5);
    	System.out.println("The output is :"+output);
    	System.out.println("End of Main Method");
    }

}
