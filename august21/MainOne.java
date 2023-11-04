public class MainOne
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method");
	   Student          s1 = new Student();
	   FirstYearStudent f1 = new FirstYearStudent();
	   FinalYearStudent fy = new FinalYearStudent();
	   s1.name   = "James";
	   s1.height = 7;
	   s1.age    = 27;
	   System.out.println("Student name is "+s1.name);
	   System.out.println("Student height is "+s1.height);
       System.out.println("Student age is "+s1.age);
       s1.study(5);
       s1.doPartTimeWork(5.5);
       s1.submitFee(40000.00);
       System.out.println("===============================");
       f1.name   = "Harris";
       f1.height = 5.8;
       f1.age    = 24;
       f1.study(6);
       f1.doPartTimeWork(6);
       f1.submitFee(50000.00);
       System.out.println("First year student name is "+f1.name);
       System.out.println("First year student height is "+f1.height);
       System.out.println("First year student age is "+f1.age);
       System.out.println("==========================================");
       fy.name   = "Kyle";
       fy.height = 5.7;
       fy.age    = 30;
       fy.study(0);
       fy.doPartTimeWork(4);
       fy.submitFee(60000.00);
       System.out.println("Final year student name is "+fy.name);
       System.out.println("Final year student age is "+fy.age);
       System.out.println("Final year student height is "+fy.height);
       System.out.println("End of Main Method");


	}
}