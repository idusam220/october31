//import java.util.Scanner;
public class TryAndCatch

{
	String password;
    String name;
	public static void main(String[]args) throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please type your Password and press enter:");
       String password = sc.next();
       Thread.sleep(3000);
        System.out.println("Enter your Name");
        String name = sc.next();
        try{
        Thread.sleep(3000);
           }
        catch(Exception e)
        {

        }
        System.out.println("  ");
        int array[] = new int[5];
        array[4]= 2998475;
        try{
       System.out.println(array[4]);
      }
      catch(ArrayIndexOutOfBoundsException k)
      {
      	System.out.println("Array length is not in the range");
      }

      finally
      {
      	System.out.println("The length exception is now handled");
      }try{
        Thread.sleep(10000);
    }
    catch(Exception e)
    {
    	System.out.println("Break,");
    }

            System.out.println("End of Main Method");
            try{
        Thread.sleep(10000);
    }
    catch(Exception e)
    {
    	System.out.println("Done.");
        System.out.println("Close the program");
    }
    System.out.println("Done.");
        System.out.println("Close the program");

	}
}