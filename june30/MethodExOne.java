public class MethodExOne
{
	public long add(long a,long b)
   {
	System.out.println("Start of add method");
	long result = a+b;
	return result;
	//System.out.println("End of add method");


	}
	public void m1()
	{
		System.out.println("Start of m1 method");
		System.out.println("End of m1 method");
	}
	public static void main(String[]args)
	{
		System.out.println("Start of main Method");
		MethodExOne mn = new MethodExOne();
		mn.m1();
		long result= mn.add(23,12);
		System.out.println("The result is:"+result);
		System.out.println("End of Main method");
	}

}