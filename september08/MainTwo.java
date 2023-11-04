public class MainTwo
{
	public static void main(String[]args)
	{
	    System.out.println("Start of Main Method");
	    ParentExOne p1 = new ParentExOne();
	    p1.m3();
	    int psum = p1.sum(90,10);
	    System.out.println("The sum of int number is: "+psum);
	    double pdivide = p1.divide(20,5);
	    System.out.println("The divide of 2 double number is: "+pdivide);
	    System.out.println("===============================================");
	    ChildExThree c3= new ChildExThree();
	    c3.m3();
	    int csum = c3.sum(10,20);
	    System.out.println("The sum of 2 in number is : "+csum);
	    System.out.println("End of Main Method");
	}
}