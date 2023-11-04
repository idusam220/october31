public class TestOne
{
	public void m1(int i,float f)
	{
	   System.out.println("int-float version");
	}
	public void m1(float f,int i)
	{
		System.out.println("float-int version");
	}
	public static void main(String[] args) 
	{
		System.out.println("Start of Main Method");
		TestOne t4 = new TestOne();
		t4.m1(10,10.5F);
		t4.m1(10.5F,10);
		//t4.m1(10,10);
		//t4.m1(10.5F,10.5F);
		System.out.println("End of Main Method");
	}
}