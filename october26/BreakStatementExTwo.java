public class BreakStatementExTwo
{
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		int i = 1, j = 1;
		    //1<=5,2<=5,3<=5,4<=5,5<=5,
		while(i++<=5)
		{
			System.out.println("Value of i : "+i);
			     //1<=6,2<=6,3<=6,4<=6,5<=6,6<=6
			while(j++<=6)
			{
				System.out.println("Value of j : "+j);
			    //2==3,3==3,4==3,5==3,6==3
			    if(j==3)
			    break;
		        else
			    System.out.println("i : "+i);// i : 2,i : 3, i : 3, i : 3, i : 3
		        System.out.println("j : "+j);// j : 2,j : 4, j : 5, j : 6, j : 7
		    }//End of inner While loop

		}//End of Outer While Loop
	}//End of Main Method
}//End of class


/*Output
======
Start of Main Method
i : 2
j : 2
i : 3
j : 4
i : 3
j : 5
i : 3
j : 6
i : 3
j : 7
*/



