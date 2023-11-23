package harris.chris.testingone;
import com.sam.idu.exampleone.ParentExOne;
import org.david.gaga.exampletwo.ChildExTwo;
import kyle.nathan.ChildExThree;
public class TestingExOne
{
	public static void main(String[]args)
	{
		System.out.println("Start of Main method");
		ParentExOne p1 = new ParentExOne();
		ParentExOne p2 = new ParentExOne(101,"James Gosling",true);
		ParentExOne p3 = new ParentExOne(201,"Natalie",false);
		ChildExTwo c1 = new ChildExTwo();
		//ChildExTwo = new ChildExThree();
		p1.m1(12,'A');
		p2.m1(89,'b');
		c1.m4();
		//c2.m4();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(c1);
		//System.out.println(c2);
		System.out.println("End of Main method");
	}//End of Main Method
}//End of class