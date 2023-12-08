import java.util.ArrayList;
public class ArrayListExTwo
{
	public static void main(String[]args)
	{
	   ArrayList <String> names = new ArrayList<>();
	   names.add("Jahn");
	      names.add("Marthe");
	         names.add("Betty");
	         for(String s : names)
	         {
	         	System.out.println(s);
	         }

	         // System.out.println("Names are : "+names);
	         System.out.println(names.size());
	}
}
