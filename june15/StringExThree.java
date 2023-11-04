public class StringExThree
{
	public static void main(String[]args)
	{
    System.out.println("start of Main Method");
	String firstName ="Harris";
	double a = 89.3;
	int    b= 34;
	float  c =45.6f;
	System.out.println(firstName+a+b+c);
	System.out.println(a+b+firstName+c);
	System.out.println(a+b+c+firstName);
	System.out.println(a+firstName+b+c);
	System.out.println("End of Main Method");

	}
}	
	/*
	System.out.println(firstName+a+b+c)==>firstName+ a
	                                     "Harris"  +89.3
	                                        "Harris89.3"  +b 
                                             "Harris89.3" +34
                                                  "Harris89.334"  +c 
                                                    "Harris89.334"+45.6f
                                                      "Harris89.33445.6"


System.out.println(a+b+firstName+c)==>a  + b
                                     89.3+34
                                        123.3+firstName
                                        123.3+"Harris"
                                          "123.3Harris"  +c
                                           "123.3Harris" +45.6f
                                            "123.3Harris45.6"

System.out.println(a+b+c+firstName)==>a   + b
                                     89.3 +34
                                        123.3+c
                                        123.3+45.6f
                                             168.9+firstName
                                             168.9 +"Harris"
                                              "168.9Harris"
                                           


System.out.println(a+firstName+b+c)==>a   +firstName
                                      89.3+"Harris"
                                      "89.3Harris"+ b
                                      "89.3Harris"+34
                                       "89.3Harris34"
                                       "89.3Harris34"+c 
                                        "89.3Harris34"+45.6f 
                                         "89.3Harris3445.6"
*/
