public class ChildExTen extends ParentExEleven
{
	private void m1(double a)
	{
	    System.out.println("Start of non-static m1 method of ChildExTen");
	    System.out.println("The value of a is "+a);
	    System.out.println("End of non-static m1 method of ChildExTen");
	}
	private boolean m5(boolean b)
     {
         System.out.println("Start of   m5 non-static method with boolean parameter  of ChildExTen ");
         System.out.println("The value of b is "+b);
         System.out.println("End of m5 non-static method with boolean parameter of ChildExTen ");
         return b;
     }
     public String m1(String s)
     {
         System.out.println("Start of m1 non-static method with String parameter of ChildExTen ");
         System.out.println("The value of s is "+s);
         System.out.println("End of m1 non-static method with String parameter of ChildExTen ");
         return s;
	 }
	 public boolean m1(boolean b)
     {
         System.out.println("Start of   m1 non-static method with boolean parameter  of ChildExTen ");
         System.out.println("The value of b is "+b);
         System.out.println("End of m1 non-static method with boolean parameter of ChildExTen ");
         return b;
     }
     
     public char m2(char c)
     {
         System.out.println("Start of m1 non-static method with int parameter of ChildExTen ");
         System.out.println("The value of c is "+c);
         System.out.println("End of m1 non-static method with int parameter ChildExTen ");
         return c;
     }
     public byte m3(byte b)
     {
         System.out.println("Start of m1 non-static method with int parameter of ChildExTen ");
         System.out.println("The value of b is "+b);
         System.out.println("End of m1 non-static method with int parameter ChildExTen ");
         return b;
     }
     public static void main(String[]Child)
     {
     	System.out.println("Start of ChildExTen Main Method");
     	ChildExTen c10 = new ChildExTen();
     	c10.m1(1111.0);
     	boolean bvalue = c10.m5(true);
     	System.out.println("The returned value is "+bvalue);
     	System.out.println("End of ChildExTen Main Method");
     }
}