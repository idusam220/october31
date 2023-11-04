public class MainOne
{
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		TestOne   t1 = new TestClassOne();
		TestTwo   t2 = new TestClassOne();
		TestThree t3 = new TestClassOne();
		t1.m1();
		t1.m2();
		t1.m3();
		t1.m4();
		System.out.println("====================");
		t2.n1();
		t2.n2();
		t2.n3();
		t2.n4();
		System.out.println("=====================");
		t3.b1();
		t3.b2();
		System.out.println("End of Main Method");
	}

}