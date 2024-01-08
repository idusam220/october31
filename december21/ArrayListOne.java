import java.util.ArrayList;
public class ArrayListOne
{
	public static void main(String[]args)
	{
		ArrayList<ArrayList<String>> grocery= new ArrayList<>();
	    ArrayList<String>food=new ArrayList<String>();
	    food.add("maize");
	     food.add("hotdog"); 
	     food.add("Fufu"); 
	     food.add("cake");
	     for(int i =0;i<food.size();i++)
	     {
	     	System.out.println(food.get(i));
	     }
	     System.out.println(food);
	     ArrayList<String>drinks=new ArrayList<String>();
	     drinks.add("Milk");
	     drinks.add("Water");
	     drinks.add("Juice");
	     for(int b =0;b<drinks.size();b++)
	     {
	     	System.out.println(drinks.get(b)+ "   ");
	     }
	     ArrayList<String>ingredients=new ArrayList<String>();
	     ingredients.add("tomato");
	     ingredients.add("Pepper");
	     ingredients.add("Oil");
	     ingredients.add("butter");
	     for(int c =0;c<ingredients.size();c++)
	     {
	     	System.out.println(ingredients.get(c));
	     }
	     grocery.add(food);
	     grocery.add(drinks);
	     grocery.add(ingredients);
	     System.out.println(grocery);


	}
}