public class ChildExThree extends ParentExOne
{
	public ChildExThree(int i)
	{
	    System.out.println("Start of constructor with int parameter");
	    System.out.println("The value of i "+i);
	    System.out.println("End of constructor with int parameter ");
	}
	public ChildExThree()
	{
	    System.out.println("Start of constructor with int parameter");
	    System.out.println("End of constructor with int parameter ");
	}
	public ChildExThree(int i,int j)
	{
	    System.out.println("Start of constructor with int parameter");
	    System.out.println("The value of i "+i);
	    System.out.println("The value of j is "+j);
	    System.out.println("End of constructor with int parameter ");
	}
	public double multiply(double a,double b,double c)
	{
		System.out.println("Start of multiply() non-static method of ChildExThree");
		double result = a*b*c;
		System.out.println("Result = "+result);
		System.out.println("End of multiply()non-static method of ChildExThree");
		return result ;
	}
}