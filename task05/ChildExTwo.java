public class ChildExTwo extends ChildExTwelve
{
	public char p1(char valueOne)
	{
	   System.out.println("Start of non-static p1 mehtod of ChildExTwo");
	   System.out.println("The value one is "+valueOne);
	   System.out.println("End of non-static p1 mehtod of ChildExTwo");
	   return valueOne;
	}
	public boolean m1(boolean b)
     {
         System.out.println("Start of   m1 non-static method with boolean parameter  of ChildExTwo ");
         System.out.println("The value of b is "+b);
         System.out.println("End of m1 non-static method with boolean parameter of ChildExTwo ");
         return b;
     }
     public String m1(String name)
     {
         System.out.println("Start of m1 non-static method with String parameter of ChildExTwo");
         System.out.println("The name is "+name);
         System.out.println("End of m1 non-static method with String parameter of ChildExTwo ");
         return name;
     }
     public char m2(char c)
     {
         System.out.println("Start of m2 non-static method with char parameter of ChildExTwo ");
         System.out.println("The value of c is "+c);
         System.out.println("End of m2 non-static method with char parameter ChildExTwo ");
         return c;
     }
     public byte m3(byte b)
     {
         System.out.println("Start of m2 non-static method with byte parameter of ChildExTwo ");
         System.out.println("The value of b is "+b);
         System.out.println("End of m2 non-static method with byte parameter ChildExTwo ");
         return b;
     }
     public char m5(char value)
     {
     	System.out.println("Start of non-static m5 method of class ChildExTwo");
     	System.out.println("The value is :"+value);
     	System.out.println("End of non-static m5 method of class childExTwo");
     	return value;
     }
     
}