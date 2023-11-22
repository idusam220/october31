//package com.test;
//import eric.bob.kyle.*;
package eric.bob.kyle;
public class MainTestOne
{
	public static void main(String[]args)
	{
	  System.out.println("Start of Main Method");
      ParentExOne p1 = new ParentExOne();
      ParentExOne p2 = new ParentExOne(101,"James","Gosling");
      ExampleOne e1  = new ExampleOne();
      ExampleOne e2  = new ExampleOne();
      p2.m2();
      p2.m2(12,13);
      System.out.println(p1);
      System.out.println(p2);
      System.out.println("=================");
      e1.m3();
      e1.m3('a','b');
      //e1.m2();
      //e1.m2(45,46);
      System.out.println(e1);
      System.out.println(e2);
	  System.out.println("End of Main Method");


	}
}