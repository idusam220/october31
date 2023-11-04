public class StringExFive
{
public static void main(String[]args)
   {
      String userName = "Kyle";
      byte  b = 10;
      short s = 23;
     int   i = 23;
     System.out.println("Start of Main Method");
     System.out.println (b+s+i+userName);
     System.out. println(i+s+b+userName);
     System.out.println( userName+i+s+b);
     System.out.println("End of Main Method");
   }
}
/*

System.out.println (b+s+i+userName)==>b + s 
                                      10+23
                                         33+i
                                         33+23
                                            56+userName
                                            56+"Kyle"
                                            "56Kyle"

System.out. println(i+s+b+userName)==>i + s
                                      23+23
                                         46+b
                                         46+10
                                            56+userName
                                            56+"Kyle"
                                               "56Kyle"

System.out.println(userName+i+s+b)==>userName+i
                                       "Kyle" +23
                                          "Kyle23"+s
                                           "Kyle23"+23
                                            "Kyle2323"  +b 
                                              "Kyle2323"+10
                                                "Kyle232310"
   */