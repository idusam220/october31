public class MethodExample
{
	String make;
	String model;
	int year ;
	public void buyCar(String a)//A method is a set of codes for a specific task 
	{ System.out.println("Start of non static buyCar method");
	   make ="Ford";
	   model ="Escape";
	   year     =2020;
       int price    = 15000;
       System.out.println("The price of the car is:"+price);
       System.out.println("End of Method");
	}
	public void buyCar(float gasStorageSize)// method overloading means same method name with different parameters
	{
		System.out.println("Start of non static buyCar by gasStorageSize method");
		System.out.println("End of non static buyCar method");
	}

	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		MethodExample me = new MethodExample();
		me.buyCar("Brandnew");//calling method with me reference 
		me.buyCar(25.5f);// method calling 
		System.out.println("The make of The car is:"+me.make);
		System.out.println("The model of the car is :"+me.model);
		System.out.println("Year of the car is :"+me.year);
		System.out.println("End of Main Method");


	}
}