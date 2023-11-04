public class SportPerson
{
	static String team ="Venant of Venant";
	String name;
	int age;
	double weight;

public static void m2()
{
	System.out.println("static m2-method");
}
public static void m2(int i)
{
	System.out.println("m2-int parameter method");

}
public static void main(String[]args)
{
	System.out.println("start of Main Method");
	SportPerson sp1= new SportPerson();
	SportPerson sp2= new SportPerson();
	sp1.name="Nathan";
	sp1.age =23;
	sp1.weight=60.5;
	sp2.team="Master of Sam";
	System.out.println("SP One name is :"+sp1.name);
	System.out.println("SP One age is :"+sp1.age);
	System.out.println("SP One weight is :"+sp1.weight);
	System.out.println("SP One team name is :"+sp1.team);
	sp2.name="Jack";
	sp2.age=20;
	sp2.weight=70.5;

	System.out.println("SP two name is :"+sp2.name);
	System.out.println("SP two age is :"+sp2.age);
	System.out.println("SP two weightis :"+sp2.weight);
	System.out.println("SP two team name is :"+sp2.team);
	System.out.println("End of Main Method");
}
}
