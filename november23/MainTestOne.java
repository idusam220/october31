package com.jack.kyle.exampleone;
public class MainTestOne
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   ParentExOne p1 = new ParentExOne(101,"James Gosling",9000.00);
	   ChildExOne c1  = new ChildExOne("USA",201);
	   ParentExOne p2 = new ParentExOne(102,"Patric",8500.00);
	   ChildExOne c2  = new ChildExOne("London",202);
	   ParentExOne p3 = new ParentExOne();
	   ChildExOne c3  = new ChildExOne();
	   c2.m5(12,45,90);
       String yourFullName = c3.m1("Harris","Jacob");
       System.out.println("Your Full Name is : " + yourFullName);
       String name = p2.m1();
       System.out.println(" Name is :" + name);
       System.out.println(p1);
       System.out.println(p2);
       System.out.println(p3);
       System.out.println("=================");
       System.out.println(c1);
       System.out.println(c2);
       System.out.println(c3);
       System.out.println("End of Main Method");


	}
}