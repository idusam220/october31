	public class StringExFour
	{
	public static void main(String[]args)
	{
	 System.out.println("Start of Main Method");
	 String lastName = "James";
	 int i= 67;
	 boolean b= true;
	 System.out.println(b+lastName);
	 System.out.println(lastName+i+b);
	 System.out.println(i+lastName+b);
	 System.out.println("End of Main Method");

	}
	}

/*
	System.out.println(b+lastName)==>b+lastName
	                                 true+"James"
	                                 "trueJames"

	System.out.println(lastName+i+b)==>lastName+i
	                                    "James"+67
	                                     "James67"+b 
	                                      "James67"+true
	                                      "James67true"

    System.out.println(i+lastName+b)==>i+lastName
                                       67+"James"
                                       "67James"  +b
                                       "67james"  +true
                                          "67Jamestrue"
*/