public class TestClassFour implements TestThree
{
   public static void main(String[]args)
   {
   	System.out.println("Start of Main Method");
   	TestThree t3 = new TestClassFour();
   	System.out.println("Your income is = "+t3.salary);
   	System.out.println("Your name is : "+t3.name);
   	System.out.println("End of Main Method");
   }	
}