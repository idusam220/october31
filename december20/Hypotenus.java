import java.util.Scanner;
public class Hypotenus
{
	public static void main(String[]args)
	{
	  System.out.println("Program starts!");
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the value of a :");
	  int a = sc.nextInt();
	  System.out.println("Enter the value of b :");
	  int b = sc.nextInt();
	  double c = (double)Math.sqrt((a*a)+(b*b));
	  System.out.println("The Hypotenus of Triangle is :"+c);
	  System.out.println("The program ends !");
	}
}