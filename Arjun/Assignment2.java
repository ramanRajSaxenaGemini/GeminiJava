import java.net.*;
import java.util.*;
import java.io.*;

import org.json.simple.parser.*;
import org.json.simple.*;


public class Assignment2 {
public static void main(String args[]){
	final String USER_AGENT = "Mozilla/5.0";
	String url = "http://restcountries.eu/rest/v1/all";
	try{
	//opening connection
	URL object = new URL(url);
	HttpURLConnection connection = (HttpURLConnection) object.openConnection();
	connection.setRequestMethod("GET");
	connection.setRequestProperty("User-Agent", USER_AGENT);
	
	//converting response data into JSON 
	JSONParser parser = new JSONParser();
	Object rawdata = parser.parse(new InputStreamReader(connection.getInputStream()));
	JSONArray json = (JSONArray) rawdata;
	ArrayList<String> europecountries = new ArrayList<String>();
	for(Object obj : json){
		JSONObject objj = (JSONObject)obj;
		//1st
		if (objj.get("name").equals("India"))
				{
					for(Object objjj : objj.keySet()){
						System.out.println(objjj + " = " + objj.get(objjj));
					}
				}
		//2nd
		if (objj.get("name").equals("Australia")){
			System.out.println(objj.get("timezones"));
			System.out.println("\n");
						
		}
		//3th
		if (objj.get("name").equals("China")){
			System.out.println(objj.get("borders"));
			System.out.println("\n");				
		}
		//4th 
		if (objj.get("region").equals("Europe")){
			europecountries.add((String)objj.get("name"));
							
		}
		
	}
	System.out.println(europecountries);
	}catch(Exception e){
		System.out.println(e);	
		
	}	
}
}

