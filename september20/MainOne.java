public class MainOne
{
	public static void main(String[]args)
	{
	    System.out.println("Start of Main Method");
	    Person p2 = new Person(1000,"Sam",34,"USA");
	    System.out.println(p2);
	   Person p1 = new Jack(1001,"Jack",44,"France",15000.0);
	   p1.move();
	   p1.doWork();
	   System.out.println(p1);
	   System.out.println("========================");
	   Mark m1 = new Mark(1002,"Mark",34,"England",7433377);
	   System.out.println(m1);
	   m1.move();
	   m1.run();
	   System.out.println(m1);
	   System.out.println("========================");
	   Person p3 = new Steve(1003,"Steve",54,"Kenya");
	   p3.move();
	   p3.doWork();
	   System.out.println(p3);
	   System.out.println("End of Main Method");
	}
}