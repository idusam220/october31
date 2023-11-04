public class ChildExSeven extends ParentExFive
{
	public boolean g1()
	{
	   System.out.println("Start of g1 method of ChildExSeven");
	   System.out.println("End of g1 method of ChildExSeven");
	   return true;
	}
	public void h1()
     {
         System.out.println("Start of h1 non-static method of ChildExSeven ");
         System.out.println("End of h1 non-static method of ChildExSeven ");

     }
     public double h2(double a)
     {
         System.out.println("Start of h2 non-static method of ChildExSeven ");
         System.out.println("The value of a is "+a);
         System.out.println("End of h2 non-static method of ChildExSeven ");
         return a;

     }
     public boolean h3(boolean b)
     {
         System.out.println("Start of h3 non-static method of ChildExSeven ");
         System.out.println("The value of b is "+b);
         System.out.println("End of h3 non-static method of ChildExSeven ");
         return b;

     }
     public char h4(char e)
     {
         System.out.println("Start of h4 non-static method of ChildExSeven ");
         System.out.println("The value of e is "+e);
         System.out.println("End of h4 non-static method of ChildExSeven ");
         return e;

     }
     public int h5(int a)
     {
         System.out.println("Start of h5 non-static method of ChildExSeven ");
         System.out.println("The value of a is "+a);
         System.out.println("End of h5 non-static method of ChildExSeven ");
         return a;
     }

}