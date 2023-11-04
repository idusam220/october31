public class ChildExOne extends ChildExTen
{
	public void r1(boolean b)
	{
	    System.out.println("Start of non-static r1 method of ChildExOne ");
	    System.out.println("The value of b is "+b);
	    System.out.println("End of non-static r1 method of ChildExOne");
	}
	public boolean m1(boolean b)
     {
         System.out.println("Start of   m1 non-static method with boolean parameter  of ChildExOne ");
         System.out.println("The value of b is "+b);
         System.out.println("End of m1 non-static method with boolean parameter of ChildExOne ");
         return b;
     }
     public String m1(String name)
     {
         System.out.println("Start of m1 non-static method with String parameter of ChildExOne ");
         System.out.println("The name is "+name);
         System.out.println("End of m1 non-static method with String parameter of ChildExOne");
         return name;
     }
     public char m2(char c)
     {
         System.out.println("Start of m2 non-static method with char parameter of ChildExOne ");
         System.out.println("The value of c is "+c);
         System.out.println("End of m2 non-static method with char  parameter ChildExOne ");
         return c;
     }
     public byte m3(byte b)
     {
         System.out.println("Start of m3 non-static method with byte parameter of ChildExOne ");
         System.out.println("The value of b is "+b);
         System.out.println("End of m3 non-static method with byte parameter ChildExOne ");
         return b;
     }
}