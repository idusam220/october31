//import java.util.Arrays;
public class Arrays
{
	public static void main(String[]args)
	{
	int [][]array = {{1,2},{3,4},{5,6}};

	for(int a = 0;a<array.length;a++ )
	{
	   for(int b= 0;b<array[0].length;b++){
	   System.out.print(array[a][b] + "  ");
	   }
	   System.out.println("   ");
	}
	}
}