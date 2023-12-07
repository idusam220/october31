public class EnhancedForLoop
{
	public static void main(String[]args)
	{
	   int a[][]={{12,13},{23,24},{34,35},{45,46}};
	   System.out.println("The length of of row is : "+a.length);
	   System.out.println("The length of of colunm is : "+a[0].length);

	   for(int i[]:a)
	   {
	   	for(int j : i)
	   	{
	   		System.out.print(j+"  ");

	   	}
	   	System.out.println(" ");
	   }
	}
}