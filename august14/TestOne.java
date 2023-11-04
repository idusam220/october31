public class TestOne
{
	public static void main(String[]args)
	{
	  System.out.println("Start of Main Method");
	  int x =1, y = 1;
	  x = ++x+ y++;
	  y = x-- + --y;

	  System.out.println(x+"..."+y);
	  System.out.println(x);
	  System.out.println("End of Main Method");
	}
}