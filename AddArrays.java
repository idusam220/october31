public class AddArrays
{
	public static void main(String[]args)
	{
	   int b[]= {7,8,9,10,11,12};
	  // System.out.println(a[4]);
	   System.out.println(b[1]);
	   int multiply = 1;
	   for(int a :b)
	   {
	   	 multiply *= a;
	   	 
	   }
	   System.out.println(multiply);
	}
}