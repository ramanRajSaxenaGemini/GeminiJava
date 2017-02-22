import org.json.simple.*;
import java.io.*;
import org.json.simple.parser.*;
import java.util.*;

public class Assignment1 {
	public static void main(String args[]){
		JSONParser parser = new JSONParser();
		try{
		Object rawdata = parser.parse(new FileReader("/home/akapoor/EclipseWorkspace/Personal/src/Jsonfile.txt"));
		JSONObject json = (JSONObject) rawdata;
		String runtime = (String)json.get("runtime");
		String runtimeMin = runtime.substring(0,3);
		int runtimeinsec = Integer.parseInt(runtimeMin);
		System.out.println("Movie run time in Sec: " + runtimeinsec*60 + " sec");
		
		Map<String, Long> mapforawards = new HashMap<String, Long>();
		mapforawards = (HashMap)json.get("awards");
		System.out.println("Award wins: " + mapforawards.get("wins"));
		
		Map<String, Long> mapforReviews = new HashMap<String, Long>();
		mapforReviews = (HashMap)json.get("tomato");
		System.out.println("User reviews: " + mapforReviews.get("userReviews"));
		
		String directorname = (String)json.get("director");
		System.out.println("Movie Director: " + directorname);
		
		JSONArray actors = new JSONArray();
		actors = (JSONArray)json.get("actors");
		System.out.println("2nd actor in movie is: " + actors.get(1));
		
		String revenue = (String)json.get("Revenue");
		revenue = revenue.replaceAll("\\D+","");
		int revenueInInt = Integer.parseInt(revenue);
		int RevenueInRupee = revenueInInt * 65 * 1000000;
		System.out.println("revenue in rupee : " + RevenueInRupee);
		}catch(Exception e){
			System.out.print(e);
		}		
	}

}

