public class PrintArray
{
	public static void main(String[]args)
	{
	    System.out.println("Start of Main Method");
	    int [][] arrayNumbers = {{45,54},{76,67},{19,91},{0,123}};
	    for(int column = 0;column<arrayNumbers[0].length;column++)
	    {
	    for(int row = 0;row<arrayNumbers.length;row++)
	    	{
	    		System.out.print(arrayNumbers[row][column] + "   ");
	    	}
	    	

	    	System.out.println("    ");
	    }
	    System.out.println("========");
	    for(int rows :row)
	    {
	    	System.out.println(rows);
	    // 	for(columns: column){
	    // 		System.out.println([rows][columns]);
	    // 	}
	    }
	    System.out.println("End of Main Method");

	}
}