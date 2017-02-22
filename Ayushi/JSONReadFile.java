import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.*;
import java.util.*;
 
/**
 * @author Ayushi Chakraborty
 */
 
public class JSONReadFile {
 
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
 
        try {
 
            Object obj = parser.parse(new FileReader(
                    "/home/achakraborty/javajsonfile1.json"));
 
            JSONObject jsonObject = (JSONObject) obj;
 
            String runtime = (String) jsonObject.get("runtime");
		String money = (String) jsonObject.get("Revenue");
		String rev=null;
       
            JSONObject award = (JSONObject) jsonObject.get("awards");
	JSONObject tomato = (JSONObject) jsonObject.get("tomato");
	String dir = (String) jsonObject.get("director");
	JSONArray actors = (JSONArray) jsonObject.get("actors");
	
           
 
            System.out.println("Runtime: " + runtime);
            System.out.println("Awards: " + award.get("wins"));
		System.out.println("Reviews: " + tomato.get("userReviews"));
		System.out.println("Director: " + dir);
		System.out.println("2nd Actor: " + actors.get(1));
		 if (money.contains(" ")){
            rev=money.substring(1, money.indexOf(" "));
        }
        int revIndian=(Integer.parseInt(rev)*6500000);
		System.out.println("Revenue in Indian Currency: "+revIndian+" INR");

            
 
        } catch (Exception e) {
            e.printStackTrace();
        }}}
