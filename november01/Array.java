import java.util.Arrays;
import java.util.ArrayList;
public class Array

{
	public static void main(String []args)
	{
		String[] arrayFriends1 = new String[2];
		arrayFriends1[0] = "Eric";
		arrayFriends1[1] = "Luc";
		ArrayList< String > arraylist1 = new ArrayList<>(Arrays.asList("Thomas","Claude","Arron","Betty"));

	   String[] arrayFriends = {"John","Jack","George","Joseph"};
	   System.out.println(arrayFriends[3]);
	   	System.out.println(arrayFriends1[1]);
	   	System.out.println(arraylist1.get(2));




	}
}