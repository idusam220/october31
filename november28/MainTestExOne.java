package victor.main.test;
import mark.waugh.exampletwo.ParentExFive;
import sam.chris.adam.exampleone.ParentExFour;
public class MainTestExOne
{
	public static void main(String[]args)
	{
	    System.out.println("Start of Main Method");
	    ParentExFour p1 = new ParentExFour();
	    ParentExFive p2 = new ParentExFive();
	    ParentExFour p3 = new ParentExFour(21,"David","Bank of America");
	    ParentExFive p4 = new ParentExFive(234,900);
	    System.out.println(p1);
	    System.out.println(p2);
	    System.out.println(p3);
	    System.out.println(p4);
	}
}
