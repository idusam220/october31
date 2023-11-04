public class MainTwo
{
	public static void main(String[]args)
	{
	     System.out.println("Start of Main Method");
	     SportPerson sp1 = new SportPerson(333,"Gad",23,"Zebra fc",45000.00);
	     double spValueOne = sp1.m3(33.4);
	     System.out.println("sport person value oneis "+spValueOne);
	     char spValueTwo = sp1.m3('f');
	     System.out.println("Value Two is "+spValueTwo);
	     System.out.println(sp1);
	     System.out.println("=======================");
	     Boxer b1 = new Boxer(444,"Joe",30,"Chelsea fc",50000.00);
	     byte bvalue = b1.m4((byte)12);
	     System.out.println("Boxer value is "+bvalue);
	     System.out.println(b1);
	     System.out.println("=========================");
	     BasketBaller bb1 = new BasketBaller(131,"Eric",25,"APR FC",3000.00);
	     String bValue = bb1.m5("Tall");
	     System.out.println("BasketBaller value is to be "+bvalue);
	     System.out.println(bb1);
	     System.out.println("==========================");
	     FootBaller f1 = new FootBaller(99,"Messi",35,"Inter Miami Fc",90000.00);
	     double fValue = f1.m6(5500.5);
	     System.out.println("Footballer value "+fValue);
	     System.out.println(f1);
	     System.out.println("End of Main Method");


	}
}