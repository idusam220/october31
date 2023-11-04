public class MethodExOne
{
	public void b1()
	{
		System.out.println("start of b1 method");
		a1(10);
		c1();
		System.out.println("End of b1 method");
	}
		public void a1(int i)
		{
			System.out.println("start of a1 method");
			int value = i;
			System.out.println("The value is :"+value);
			System.out.println("End of a1 method");

		}
		public void c1()
		{
			System.out.println("Start of c1 method");
			double result =d2(23.4,12.0);
			System.out.println("The result is :"+result);
			System.out.println("End of c1 method");
		}
		public double d2(double a,double b)

		{
			double valueOne = a;
			double valueTwo =b;
			System.out.println("The valueOne is :"+valueOne);
			System.out.println("The valueTwo is :"+valueTwo);
			double output = valueOne+valueTwo;
			return output;


		}
		public static void main(String[]args)
		{
			System.out.println("Start of Main Method");
			MethodExOne mo = new MethodExOne();
			mo.b1();
			int a =10;
		    long b =20;
		    float addResult = a+b;
			System.out.println(" The add result is :"+addResult);
			System.out.println("End of Main Method");
		}


	}
