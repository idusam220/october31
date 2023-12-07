package org.testingone;
import co.us.ibm.exampletwo.ParentExTwo;
import harris.david.eric.examplethree.ParentExThree;
public class MainOne
{
	public static void main(String[]args)
	{
	     System.out.println("Start of Main Method");
	     ParentExThree p1 = new ParentExThree("James","Harris","Gosling",999999999);
	     ParentExTwo   p2 = new ParentExTwo("Jack","Kyle","Mark");
	     ParentExOne   p3 = new ParentExOne();
	     ParentExTwo   p4 = new ParentExThree();
	     System.out.println(p4);
	     System.out.println(p2);
	     System.out.println(p1);
	     System.out.println("End of Main Method");
	}
} 