public class NestingForLoopExTwo
{
	public static void main(String[]args)
	{
		System.out.println("Start of Main Method");
		int a = 0;
		int b = 0;              
		                              //0<=5,1<=5,2<=5,3<=5,4<=5,5<=5
		for(System.out.println("Hello");a <= 5; System.out.println("Hi"))
		{
			System.out.println("Inside Outer Loop");
			a++;//1//2//3//4//5//6
			System.out.println("The value of a is : "+a);                            //0<=4,1<=4,2<=4,3<=4,4<=4
			for(System.out.println("Hey");b <= 4;System.out.println("Welcome"))
			{
				b++;//1//2//3//4//5
				System.out.println("The value of b is : "+b);
				System.out.println("Bye from outer for Loop");
			}//Close of Inner For Loop
			System.out.println("a"+a);
			System.out.println("b"+b);
		}//Close of Outer For Loop 
		
		System.out.println("End of Main Method");
		
	}

}

/*output
====== 
Start of Main method 
Hello 
Inside outer For Loop 
The value of a is : 1
Hey 
Bye from Outer for loop 
Wecome 
The value of b is :1
Bye from Outer for loop 
Wecome 
The value of b is : 2
Bye from Outer for loop 
Wecome 
The value of b is : 3
Bye from Outer for loop 
Wecome 
The value of b is :4
Bye from Outer for loop 
Wecome
The value of a is :2
Hey 
Bye from Outer for loop 
Wecome 
The value of b is :1
Bye from Outer for loop 
Wecome 
The value of b is : 2
Bye from Outer for loop 
Wecome 
The value of b is : 3
Bye from Outer for loop 
Wecome 
The value of b is :4
Bye from Outer for loop 
Wecome
The value of a is :3
Hey 
Bye from Outer for loop 
Wecome 
The value of b is :1
Bye from Outer for loop 
Wecome 
The value of b is : 2
Bye from Outer for loop 
Wecome 
The value of b is : 3
Bye from Outer for loop 
Wecome 
The value of b is :4
Bye from Outer for loop 
Wecome
The value of a is :4
Hey 
Bye from Outer for loop 
Wecome 
The value of b is :1
Bye from Outer for loop 
Wecome 
The value of b is : 2
Bye from Outer for loop 
Wecome 
The value of b is : 3
Bye from Outer for loop 
Wecome 
The value of b is :4
Bye from Outer for loop 
Wecome
The value of a is :5
Hey 
Bye from Outer for loop 
Wecome 
The value of b is :1
Bye from Outer for loop 
Wecome 
The value of b is : 2
Bye from Outer for loop 
Wecome 
The value of b is : 3
Bye from Outer for loop 
Wecome 
The value of b is :4
Bye from Outer for loop 
Wecome




*/

