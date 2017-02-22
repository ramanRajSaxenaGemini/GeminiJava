import java.io.FileReader;
import java.util.*;
import java.util.Iterator;
import java.io.*;
import java.net.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
 
public class SolutionJSON3 {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
 
        try {
    		
			URL url = new URL("http://restcountries.eu/rest/v1/all");
			URLConnection urlConnection = url.openConnection();
			urlConnection.connect();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            		Object obj = parser.parse(bufferedReader);
            		JSONArray objectArray=(JSONArray)obj;
			
			Iterator object = objectArray.iterator();
			while(object.hasNext()){
			JSONObject jsonObject=(JSONObject) object.next();
			String countryName=(String) jsonObject.get("name");
				
				if (countryName.equals("India")){	
				System.out.println("\n\nALL THE DATA OF INDIA\n\n");
				Set keys=jsonObject.keySet();
				Iterator itr1=keys.iterator();
		/*Inner While*/	while(itr1.hasNext()){
						String key=(String)itr1.next();
						System.out.println(key+":"+jsonObject.get(key));
				}//eo innerwhile
				}//eo if
				
				
				if(countryName.equals("Australia")){
				System.out.println("\n\nTIMEZONES IN AUSTRALIA\n\n");
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
				System.out.println("\n\nBORDERS OF CHINA\n\n");
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
			System.out.println("\n\nThe Countries of Region Europe\n\n");
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
 
        }//eo try
	catch (Exception e) {
        	e.printStackTrace();
        }//eo catch
    }//eo main
}//eo class


//Use this line to compile

//   javac -cp json-simple-1.1.1.jar: SolutionJSON3.java


//Use this line to run

//   java -cp json-simple-1.1.1.jar: SolutionJSON3
