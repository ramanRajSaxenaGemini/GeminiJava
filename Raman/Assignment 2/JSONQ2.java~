import org.json.simple.*;
import org.json.simple.parser.*;
import java.io.*;
import java.net.*;

class JSONQ2{
	
	static JSONArray jsonArray = null;
	
	public static void main(String s[]){
		try{
			StringBuilder content = new StringBuilder();

			URL url = new URL("http://restcountries.eu/rest/v1/all");

			
			URLConnection urlConnection = url.openConnection();

			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

			String line;

			
		
   
  
			//FileReader reader = new FileReader("Q2.json");
			JSONParser jsonParser = new JSONParser();
	    	jsonArray = (JSONArray) jsonParser.parse(bufferedReader);
			
			printCountryDetails("India");
			printProperty("Australia","timezones");
			printProperty("China","borders");
			printCountries("Europe");
			
			
		}catch(Exception e){
			e.printStackTrace();
		}	
	
	}
	
	//Method to print details of a given country
	public static void printCountryDetails(String country){
		
		System.out.println("\n\n"+country+" Details\n\n");
		
		for(Object obj : jsonArray){
			JSONObject jObj = (JSONObject)obj;
			if(jObj.get("name").toString().equals(country)){
				for(Object name : jObj.keySet()){
					System.out.println(name+" : "+jObj.get(name.toString()));
				}
			}
		}
	}
	
	//Method to print name of countries in given region
	public static void printCountries(String region){
		System.out.println("\n\nCountries having region "+region+" : \n\n");
		for(Object obj : jsonArray){
			JSONObject jObj = (JSONObject)obj;
			if(jObj.get("region").toString().equals(region))
				System.out.println(jObj.get("name"));
			
		}
	}
	
	
	// Method to print a single property of a given country
	public static void printProperty(String country, String prop){
		for(Object obj : jsonArray){
			JSONObject jObj = (JSONObject)obj;
			if(jObj.get("name").toString().equals(country))
				System.out.println("\n\n"+country+"'s "+prop+" : "+jObj.get(prop)+"\n\n");
			
		}
	}
	
}
