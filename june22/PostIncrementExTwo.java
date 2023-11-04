public class PostIncrementExTwo
{
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		int i= 67;
		i++;
		int j =i++;
		i++;
		int b=i++;
		int c=b;
		b++;
		int s=i++;
		System.out.println("The value of i is :"+i);
		System.out.println("The value of j is :"+j);
		System.out.println("The value of b is :"+b);
		System.out.println("The value of c is :"+c);
		System.out.println("The value of s is :"+s);
		System.out.println("End of Main Method");
	}
}