import java.util.ArrayList;
public class ArrayListExOne
{
	public static void main(String[]args)
	{
	   //ArrayList <Integer>list = new ArrayList<Integer>();
		ArrayList <Integer> list = new ArrayList<>();
	   list.add(1);
	     list.add(1);  list.add(10);  list.add(23);  list.add(54);  list.add(566555);
	   System.out.println(list);
	   System.out.println(list.size());
	   list.remove(3);
	   	   System.out.println(list);


	   System.out.println("Updated list size "+list.size());
	   ArrayList <String> names = new ArrayList<>();
	   names.add("Jahn");
	      names.add("Marthe");
	         names.add("Betty");

	         System.out.println("Names are : "+names);
	         System.out.println(names.size());
	}
}
