import java.io.FileReader;
import java.util.*;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
 
public class SolutionJSON2 {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
 
        try {
            
            FileReader fr=new FileReader("jsonfile2.json");
            Object obj = parser.parse(fr);
            JSONArray objectArray=(JSONArray)obj;
			
			Iterator object = objectArray.iterator();
			while(object.hasNext()){
			JSONObject jsonObject=(JSONObject) object.next();
			String countryName=(String) jsonObject.get("name");
				
				if (countryName.equals("India")){	
				System.out.println("\n\n1.ALL THE DATA OF INDIA\n\n");
				Set keys=jsonObject.keySet();
				Iterator itr1=keys.iterator();
		/*Inner While*/	while(itr1.hasNext()){
						String key=(String)itr1.next();
						System.out.println(key+":"+jsonObject.get(key));
				}//eo innerwhile
				}//eo if
				
				
				if(countryName.equals("Australia")){
				System.out.println("\n\n2.TIMEZONES IN AUSTRALIA\n\n");
				Set keys=jsonObject.keySet();
				Iterator itr1=keys.iterator();
		/*Inner While*/	while(itr1.hasNext()){
						String key=(String)itr1.next();
						if(key.equals("timezones")){
						System.out.println(key+":"+jsonObject.get(key));
						}//eo innerif
				}//eo innerwhile
					
				}//eo if
				
				if(countryName.equals("China")){
				System.out.println("\n\n3.BORDERS OF CHINA\n\n");
				Set keys=jsonObject.keySet();
				Iterator itr1=keys.iterator();
		/*Inner While*/	while(itr1.hasNext()){
						String key=(String)itr1.next();
						if(key.equals("borders")){
						System.out.println(key+":"+jsonObject.get(key));
						}//eo innerif
				}//eo innerwhile	
				}//eo if
			
				
			
			
			
			}//eo while
			
			object = objectArray.iterator();
			while(object.hasNext()){
			JSONObject jsonObject=(JSONObject) object.next();
			String regionName=(String) jsonObject.get("region");
				
				
				if (regionName.equals("Europe")){
				Set keys=jsonObject.keySet();
				Iterator itr1=keys.iterator();
		/*Inner While*/	while(itr1.hasNext()){
						String key=(String)itr1.next();
						if(key.equals("name")){
						System.out.println(key+":"+jsonObject.get(key));
						}//eo innerif
				}//eo innerwhile
				}//eo if
			
				
			
			
			
			}//eo while
			
			
			
			
         fr.close();
 
        }//eo try
		catch (Exception e) {
            e.printStackTrace();
        }//eo catch
    }//eo main
}//eo class


//Use this line to compile

//   javac -cp json-simple-1.1.1.jar: SolutionJSON2.java


//Use this line to run

//   java -cp json-simple-1.1.1.jar: SolutionJSON2
