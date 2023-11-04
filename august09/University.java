public class University
{
	String   name ;
	double   fee;
	int      departments;
	
    /* It is not recommended to write method names 
    using proper case or Pascal case , It is highly 
    recommended to use method names as camelCase in java. */
	public void University(String name,double fee,int departments)
	{
	   System.out.println("Start of non-static univeristy method");
	   name       = name;
	   fee        = fee;
	   departments= departments;
	   System.out.println("University name is : " + name + " and fee is : " +fee + " and department is : " + departments);
	   System.out.println("End of non-static university method");


	}
	public University(String name,double fee,int departments)
	{
		System.out.println("Start of Constructor");
		name        =name;
		fee         =fee;
		departments =departments;
		System.out.println("University name is : " + name + " and the University fee is :" + fee + " and the University has :" +departments +" departments");
		System.out.println("End of Constructor");
	}
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		University u1 = new University("University of Florida",50000.00,40);
		University u2 = new University("University of Colombus",40000.00,30);
		u1.University("UFC",50000.00,40);
		u2.University("UC",40000.00,30);
		System.out.println("End of Main Method");
	}
}