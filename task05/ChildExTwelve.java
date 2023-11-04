public class ChildExTwelve extends ParentExEleven
{
	public char m5(char value)
	{
	    System.out.println("Start of non-static m5 method of ChildExTwelve");
	    System.out.println("The value is "+value);
	    System.out.println("End of non-static m5 method of ChildExTwelve");
	    return value;
	}
	private int m1(int a)
	{
	    System.out.println("Start of non-static m1 method of ChildExTwelve");
	    System.out.println("The value is "+a);
	    System.out.println("End of non-static m1 method of ChildExTwelve");
	    return a;
	}
	public boolean m1(boolean b)
     {
         System.out.println("Start of   m1 non-static method with boolean parameter  of ChildExTwelve ");
         System.out.println("The value of b is "+b);
         System.out.println("End of m1 non-static method with boolean parameter of ChildExTwelve");
         return b;
     }
     public String m1(String name)
     {
         System.out.println("Start of m1 non-static method with String parameter of ChildExTwelve ");
         System.out.println("The name is "+name);
         System.out.println("End of m1 non-static method with String parameter of ChildExTwelve ");
         return name;
     }
     public char m2(char c)
     {
         System.out.println("Start of m1 non-static method with int parameter of ChildExTwelve ");
         System.out.println("The value of c is "+c);
         System.out.println("End of m1 non-static method with int parameter ChildExTwelve ");
         return c;
     }
     public byte m3(byte b)
     {
         System.out.println("Start of m1 non-static method with int parameter of ChildExTwelve ");
         System.out.println("The value of b is "+b);
         System.out.println("End of m1 non-static method with int parameter ChildExTwelve ");
         return b;
     }
     public static void main(String[]args)
     {
     	System.out.println("Start of ChildExTwelve Main Method");
     	ChildExTwelve c12 = new ChildExTwelve();
     	int valueThree = c12.m1(11);
     	System.out.println("The returned value is "+valueThree);
     	System.out.println("End of ChildExTwelve Main Method");
     }

}