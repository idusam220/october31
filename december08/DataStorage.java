import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class DataStorage
{
	public static void main(String[]args)
	{
	   System.out.println("Main Method");

	   String[] soccerTeam = {"john","Paul","Claude","Emmy","Josh","Martin","Olivier"};
	   for(int i = 0;i<soccerTeam.length;i++)

	   {
	   	if (i ==3)
	   	{
	   		System.out.println(soccerTeam[3]);
	   	}
	   	else 
	   	{


	   	  System.out.println("Soccer Player: "+soccerTeam[i] );
	   	  // System.out.println("Soccer Player2: "+soccerTeam[1] );
	   	  // System.out.println("Soccer Player3: "+soccerTeam[2] );
	   	  // System.out.println("Soccer Player4: "+soccerTeam[3] );
	   	  // System.out.println("Soccer Player5: "+soccerTeam[4] );
	   	  // System.out.println("Soccer Player6: "+soccerTeam[5] );
	   	}

	   }
	   ArrayList <String>membersOfH25= new ArrayList<String>();
	   membersOfH25.add("Douglas");
	   	   membersOfH25.add("Marco");
	   membersOfH25.add("Fina");
	   membersOfH25.add("Emile");
	   membersOfH25.add("Sam");

	   for(String h25:membersOfH25)
	   {
            System.out.println(h25);
	   }
	   HashMap <Integer,String>listOfAttendants = new HashMap<Integer,String>();
	   listOfAttendants.put(01,"Betty");
	   listOfAttendants.put(02,"Harry");
	   listOfAttendants.put(03,"Jane");
	   listOfAttendants.put(04,"Joseph");
	   listOfAttendants.put(05,"Baptiste");
	   listOfAttendants.put(06,"Mary");
	   listOfAttendants.put(07,"Josee");
	  listOfAttendants.put(012,"Alice");
       listOfAttendants.put(010,"Peter");
	   //for(:listOfAttendants)
	   System.out.println(listOfAttendants);
	   for(Map.Entry attendanceList:listOfAttendants.entrySet())
	   {
	   	 System.out.println(attendanceList.getKey()+"  "+attendanceList.getValue());
	   }
	   listOfAttendants.remove(07);
	   	   System.out.println(listOfAttendants);
	   	   for(Map.Entry attendanceList:listOfAttendants.entrySet())
	   {
	   	 System.out.println(attendanceList.getKey()+"  "+attendanceList.getValue());
	   }






	}
}