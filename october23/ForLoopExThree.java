public class ForLoopExThree
{
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		int a = 7;
		int b = 6;
		                                //  7>=6;6>=6
		for(System.out.println("Take care");a >= b;System.out.println("Hey"))
		{
			System.out.println("Start of For Loop");
			System.out.println("End of For Loop");
			a--;//6//5
			//b--;
		}
		System.out.println("End of Main Method");

	}
}

Output 
======
Start of Main Method 
Take Care 
Start of For Loop 
End of For Loop 
Hey 
Start of For Loop
End of For Loop
Hey 
End of Main Method



dry Run
========


  for(System.out.println("Take Care ");a >= b ;System.out.println("Hey"))
                      
                      Start of Main Method
  	step 1:output===> Take care
  	step 2:7>=6==>true
    step 3:           Start of For Loop 
                      End of For Loop
    step 4:7>= 6=====>Hey                             

    
  	step 4: a-- ===>7-1=6>=6
  	        output====>Start of For Loop
  	                   End of For Loop
  	                   Hey
    Step 4: a--====>6-1=5>=6?invalid==>end of the Loop 
                       End of Main Method




