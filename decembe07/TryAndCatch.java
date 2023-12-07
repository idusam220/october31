public class TryAndCatch
{
	public static void main(String[]args)
	{
        int array[] = new int[5];
        try{
       System.out.println(array[6]);
      }
      catch(ArrayIndexOutOfBoundsException k)
      {
      	System.out.println("Array length is not in the range");
      }
	}
}