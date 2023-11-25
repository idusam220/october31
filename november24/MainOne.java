package co.us.james.gosling.demoone;
	public class MainOne
	{
	public static void main(String[]args)
	{
        System.out.println("Start of Main Method");
        ExampleOne e1 = new ExampleOne();
        ExampleOne e2 = new ExampleOne(101,"Kyle",9000.00,20);
        ChildExampleTwo c2 = new ChildExampleTwo();
        ChildExampleTwo c3 = new ChildExampleTwo(102,"Patric",9100.00,10,"USA");
        ChildExampleThree c4 = new ChildExampleThree();
        System.out.println("===============");
        String yourFullName = c4.displayName("David","Jacob","Miller");
        c4.m1();
        double yourBalance =c3.displayBalance();
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        System.out.println("End of Main Method");
	}
	
}