public class PrePostIncrementExOne
{
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		int g=78;
		g++;
		++g;
		int k=++g;
		int j=k;
		j++;
		++j;
		int z=++j;
		int y=j++;
		int a =y;
		a++;
		++a;
		System.out.println("The value of g is:" +g);
		System.out.println("The value of k is :" +k);
		System.out.println("The value of j is :" +j);
		System.out.println("The value of z is :" +z);
		System.out.println("The value of y is :" +y);
		System.out.println("The value of a is :" +a);
		System.out.println("End of Main Method");
	}
}