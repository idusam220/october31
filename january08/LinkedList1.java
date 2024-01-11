import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String []args)
	{
		LinkedList<String> list = new LinkedList<String>();
		list.add("Sam");
		list.add("Eric");
		list.add("Emmy");
		list.add("Patric");
		list.add("Placide");
		list.add("Betty");
		
		
		System.out.println(list);
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.add(1, "Paul");
		System.out.println(list);
		
		System.out.println(list.contains("Isaac"));
		
		System.out.println(list.get(2));
		System.out.println(list.isEmpty());
		System.out.println(list);
		System.out.println(list.lastIndexOf(list));
		System.out.println(list);
		System.out.println(list.indexOf(list));
		System.out.println(list);
		list.clear();
		list.clear();
		
		
		
		
		
		
		
	}

}
