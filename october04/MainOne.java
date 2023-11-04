public class MainOne
{
	public static void main(String[]args)
	{
	    System.out.println("Start of Main Method");
	    Device d1 = new Mobile();
	    Device d2 = new Television();
	    Device d3 = new Laptop();
	    d1.turnOn();
	    d1.turnOff();
	    System.out.println("============");
	    d2.turnOn();
	    d2.turnOff();
	    System.out.println("=============");
	    d3.turnOn();
	    d3.turnOff();
	    TouchScreen t1 = new Mobile();
	    TouchScreen t2 = new Television();
	    TouchScreen t3 = new Laptop();
	    t1.touch();
	    t2.touch();
	    t3.touch();
	    System.out.println("End of Main Method");
	}
}