public class ChildExOne extends ParentExOne
{
	public void m2(boolean a)
	{
	   System.out.println("Start of m2 method of class ChildExOne");
	   System.out.println("value of a is "+a);
	   System.out.println("End of m2 method of class ChildExOne");
	}
	public void m5()
	{
		System.out.println("Start of m5 method of class ChildExOne");
		System.out.println("End of m5 method of class ChildExOne");
	}
	public double m6(double value)
	{
        System.out.println("Start of m6 method of class ChildExOne");
        System.out.println("End of m6 method of class ChildExOne");
        return value;
	}
	public int m3()
	{
		System.out.println("Start of m3 method of class ChildExOne");
		System.out.println("End of m2 method of class ChildExOne");
		return 45;
	}
	public static void main(String[]args)
	{
        System.out.println("Start of ChildExOne Main Method");
        ChildExOne c1 = new ChildExOne();
        int childExOneValue =c1.m3();
        System.out.println("Child Ex one value is "+childExOneValue);
        System.out.println("End of ChildExOne Main Method");
	}
	
}