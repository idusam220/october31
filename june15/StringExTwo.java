public class StringExTwo
{
	public static void main(String[]args)
	{
		System.out.println(" Start of Main Method");
		String a ="kyle";
		int b=23,c=100,d=43;
		System.out.println(a+b+c+d);
		System.out.println(b+c+d+a);
		System.out.println(b+c+a+d);
		System.out.println(b+a+c+d);
		System.out.println("End of Main Method");

	}
}
/*
System.out.println(a+b+c+d)====> a    + b
                                "kyle"+ 23
                                "kyle23"  + c
                                "kyle23"  + 100
                                            "kyle23100"+d
                                            "kyle23100"+43
                                                        "kyle2310043"


System.out.println(b+c+d+a)===>b +c
                               23+100
                                   123+d
                                   123+43
                                      166+a
                                      166+"kyle"
                                          "166kyle"


System.out.println(c+d+a+b)===>c  +d
                               100+ 43
                                    143+a
                                    143+"kyle"
                                        "143kyle"+b
                                        "143kyle"+23
                                                "143kyle23"

System.out.println(b+a+c+d)==>b  + a
                              23 +"kyle"
                                  "23kyle"+c
                                  "23kyle"+100
                                      "23kyle100"+d
                                      "23kyle100"+43 
                                              "23kyle10043"
  */
                                      	
                               
                                   	
                                            	

