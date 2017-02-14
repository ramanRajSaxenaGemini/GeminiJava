import org.json.simple.*;
import org.json.simple.parser.*;
import java.io.*;

class JSONQ1{
	public static void main(String s[]){
		try{
			//reading and parsing json:
			
			FileReader reader = new FileReader("Q1.json");
			JSONParser jsonParser = new JSONParser();
	    	JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);
			System.out.println("\n");
			
			//printing runtime in seconds:
			
			String time = (String)jsonObject.get("runtime");
			int runTime = Integer.parseInt(time.substring(0,time.indexOf(' ')))*60;
			System.out.println("The Run Time is: " + runTime+" Seconds\n");
			
			//printing award wins:
			
			JSONObject awards = (JSONObject)jsonObject.get("awards");
	        System.out.println("Awards Wins: " + awards.get("wins"));
			
			//printing user reviews of tomato:
			
			JSONObject tomato = (JSONObject)jsonObject.get("tomato");
	        System.out.println("\nTomato User Reviews : " + tomato.get("userReviews"));
			
			//printing director's name:
			
	        System.out.println("\nDirector : " + jsonObject.get("director"));
			
			//printing name of second actor:
			
			JSONArray actors = (JSONArray)jsonObject.get("actors");
	        System.out.println("\nName of Second Actor : " + (String)actors.get(1));
			
			//printing revenue in indian currency//:
			
			String revenue = (String)jsonObject.get("Revenue");
			int revenueInRupees = Integer.parseInt(time.substring(1,revenue.indexOf(' ')))*65;
			System.out.println("\nRevenue : ₹ "+ revenueInRupees);
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}