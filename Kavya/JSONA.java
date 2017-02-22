package assignment;
import org.json.simple.JSONObject; 
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray; 


import java.io.*;
public class JSONA{    
public static void main(String args[])throws IOException
{   
	JSONParser parser = new JSONParser();
	try{
		Object obj = parser.parse(new FileReader("/home/kgarg/input.json"));
		JSONObject jsonObject = (JSONObject) obj;
		String rtime= jsonObject.get("runtime").toString();
		int runtime= Integer.parseInt(rtime.substring(0,rtime.indexOf(' ')));
		runtime = runtime*60;
		JSONObject award= (JSONObject) jsonObject.get("awards");
		String aw = award.get("wins").toString();
		int award_wins= Integer.parseInt(aw);
		JSONObject tom= (JSONObject) jsonObject.get("tomato");
		String tm= tom.get("reviews").toString();
		int tomato_reviews= Integer.parseInt(tm);
		String director= jsonObject.get("director").toString();
		
		String actor =  ((JSONArray)jsonObject.get("actors")).get(1).toString();
		String revenue =  jsonObject.get("Revenue").toString();
		String rev = revenue.substring(1,revenue.indexOf(' '));
		int rv = Integer.parseInt(rev);
		rv =rv *65;
		System.out.println("runtime = "+ runtime);
		System.out.println("award_wins = "+ award_wins);
		System.out.println("tomato_reviews = "+ tomato_reviews);
		System.out.println("director = "+ director);
		System.out.println("Actor = "+ actor);
		System.out.println("revenue = "+ rv);
		}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
