public class MethodExTwo
{
	public void m2(int a,int b)
	{
		System.out.println("Start of m2 method");
		int result =a + b;
		System.out.println("The result is:"+result);
		m4();
		System.out.println("End of m2 method");
	}
		public void m4()
		{
			System.out.println("start of m4 method");
			m5(30);
			m6(45.5);
			m7(true);
			System.out.println("End of m4 method");
		}
		public void m5(long i)
		{
			System.out.println("Start of m5 method");
			long value =i;
			System.out.println("The value of i is :"+i);
			System.out.println("End of m5 method");
			}
			public void m6(double d)
			{
			
				System.out.println("Hi from m6 method");


				

				}
				public void m7(boolean b)
				{
					System.out.println("The value of b is :"+b);

				}
				public static void main(String[]args)
				{
					MethodExTwo mw = new MethodExTwo();
					mw.m2(10,20);
					System.out.println("Happy weekend from main method");
				}
			}
		
	
