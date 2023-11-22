package rohit.rahul.exampletwo;
public class MainOne
{
	public static void main(String[]args)
	{
	   System.out.println("Start of Main Method ");
       ParentExOne p1 = new ParentExOne("James","101",8700.00);
       ChildExOne c1 = new ChildExOne("Patric","201",8800.00);
       c1.printInformation();
       c1.m1('I');
       System.out.println(p1);
       System.out.println(c1);
       System.out.println("End of Main Method");
	}
}