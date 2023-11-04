public class TestClass implements TestOne
{


   public static void main(String[]args)
	 {
	   TestOne t1 = new TestClass();
	   System.out.println("Start of Main Method");
	   System.out.println("Value of i is : "+t1.i);
	   System.out.println(" The value of Name is : "+t1.name);
	   System.out.println("End of Main Method");
	 }
}