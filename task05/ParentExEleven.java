public class ParentExEleven
{
	private void m1(double a)
     {
         System.out.println("Start of m1 non-static method of ParentExEleven ");
         System.out.println("The value of a is "+a);
         System.out.println("End of m1 non-static method of ParentExEleven ");
     }
     public boolean m1(boolean b)
     {
         System.out.println("Start of   m1 non-static method with boolean parameter  of ParentExEleven ");
         System.out.println("The value of b is "+b);
         System.out.println("End of m1 non-static method with boolean parameter of ParentExEleven ");
         return b;
     }
     public String m1(String name)
     {
         System.out.println("Start of m1 non-static method with String parameter of ParentExEleven ");
         System.out.println("The name is "+name);
         System.out.println("End of m1 non-static method with String parameter of ParentExEleven ");
         return name;
     }
     private int m1(int a)
     {
         System.out.println("Start of m1 non-static method with int parameter of ParentExEleven ");
         System.out.println("The value of a is "+a);
         System.out.println("End of m1 non-static method with int parameter ParentExEleven ");
         return a;
     }
     public char m2(char c)
     {
         System.out.println("Start of m1 non-static method with int parameter of ParentExEleven ");
         System.out.println("The value of c is "+c);
         System.out.println("End of m1 non-static method with int parameter ParentExEleven ");
         return c;
     }
     public byte m3(byte b)
     {
         System.out.println("Start of m1 non-static method with int parameter of ParentExEleven ");
         System.out.println("The value of b is "+b);
         System.out.println("End of m1 non-static method with int parameter ParentExEleven ");
         return b;
     }
     public static void main(String[]parent)
     {
     	System.out.println("Start of parent Main Method");
     	ParentExEleven p11 = new ParentExEleven();
     	p11.m1(11.0);
     	int valueTwo = p11.m1(10);
     	System.out.println("The value Two is :"+valueTwo);
     	System.out.println("End of parent Main Method");
     }


}