public class Threedimentional
{
	 
	
	public static void main(String[]args)
	{
		int[][][] storage = new int[3][4][5];//jagged array
		


	for(int i = 0;i<3;i++)
	{
	  for(int j = 0;j<4;j++)

	  {
	  	for(int k =0;k<5;k++){
      storage[i][j][k]= (int)(Math.random()*100);
	   
	  System.out.println(storage[i][j][k] + "   ");
	  }
	   System.out.println(  );
	  }
	   System.out.println(  );

	}
}
}