package orgtwo.demotwo;
import java.util.Scanner;
public class InputFromUser
{
public static void main(String[]args)
{
    System.out.println("Start of Main Method");
   Scanner sc    = null;
    String name   = null;
    int    age    = 0;
    double income = 0.0;
    sc = new Scanner(System.in);
    System.out.println("Please enter your Name : ");
   // name = sc.next();
    name = sc.nextLine();
    System.out.println("Please enter your Age : ");
    age = sc.nextInt();
    System.out.println("Please enter your Income : ");
    income = sc.nextDouble();
    System.out.println("Your details are as follows : ");
    System.out.println("Your Name is : "+name);
    System.out.println("Your Age is : "+age);
    System.out.println("Your Income is : "+income);
    System.out.println("End of Main Method");
}
	
}