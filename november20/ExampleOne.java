package eric.bob.kyle;
public class ExampleOne
{
	public ExampleOne()
	{
		System.out.println("Start of ExampleOne constructor");
		System.out.println("End of ExampleOne constructor");
	}
	void m3()
	{
		int valueOne = 34;
		System.out.println("Start of m3() method");
		System.out.println("Value One is = "+valueOne);
		System.out.println("End of m3 () method");
	}
	void m3(char valueOne,char valueTwo)
	{
		System.out.println("Start of m3() with 2 parameters");
		int output = valueOne+valueTwo;
		System.out.println("Output is = "+output);
		System.out.println("End of m3 () with 2 parameters");
	}
	public String toString()
	{
		return "Hi from ExampleOne";
	}
	public static void main(String[]args)
	{
		ParentExOne p3 = new ParentExOne();
		p3.m2();
		p3.m2(90,10);
	}
}