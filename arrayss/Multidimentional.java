public class Multidimentional
{
	 
	
	public static void main(String[]args)
	{
		int[][] storage = new int[4][];//jagged array
		storage[0]=new int[4];
		storage[1]=new int[2];

        storage[2]=new int[3];
        storage[3]=new int[1];



	for(int i = 0;i<4;i++)
	{
	  for(int j = 0;j<storage[i].length;j++)
	  {
      storage[i][j]= (int)(Math.random()*100);
	   
	  System.out.println(storage[i][j] + "");
	  }
	  System.out.println();
	}
}
}