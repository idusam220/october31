public class MethodExTwo
{
	public double multply(double a,double b)
	{
	double output = a*b;
	return output;
	}
	public int substract(int a, int b)
	{
	int result = a-b;
	return result;
	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		MethodExTwo m1 = new MethodExTwo();
		double finalOutput =m1.multply(23.2,12.3);
		int finalResult = m1.substract(45,12);
		System.out.println("Multiprication result is :" +finalOutput);
		System.out.println("substract result is :" +finalResult);
		System.out.println("End of Main Method");
	}
}