package assignment;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.*;
import org.json.simple.parser.*;
import java.util.*;

public class JsonParseURL {
   
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        ArrayList<String> rg = new ArrayList<String>();

        try {        
            URL oracle = new URL("https://restcountries.eu/rest/v1/all "); // URL to Parse
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
           
            String inputLine;
            while ((inputLine = in.readLine()) != null) {              
                JSONArray a = (JSONArray) parser.parse(inputLine);
               
                // Loop through each item
                for (Object o : a) {
                    JSONObject tutorials = (JSONObject) o;

                    String id = (String) tutorials.get("name");
                    if (id.equals("India")) {
                    	System.out.println("Data about India:");
                    	for(Object kjj : tutorials.keySet()){
                    		System.out.println(kjj+ "=" + tutorials.get(kjj));
                    	}
                    }
                 if (id.equals("Australia")){
                	 //String title = (String) tutorials.get("timezones");
                	 String title =  ((JSONArray)tutorials.get("timezones")).get(1).toString();
                	 System.out.println("Timezone of Australia: "+ title);
                 }
                 if (id.equals("China")){
                	 JSONArray bor =  ((JSONArray)tutorials.get("borders"));
                	 /*for (int i=0; i<bor.length();i++){
                		 System.out.println(bor.get(i));
                	 }*/
                	 System.out.println("Borders of china are:");
                	 for(int i=0; i<bor.size(); i++)
                     {
                		 System.out.println(bor.get(i));
                     }
                 }
                 String region = (String) tutorials.get("region");
                 if(region.equals("Europe")){
                 	rg.add(tutorials.get("name").toString());

                 }
                    /*System.out.println("Post ID : " + id);

                    String title = (String) tutorials.get("capital");
                    System.out.println("Post Title : " + title);

                    System.out.println("\n");*/
                }
                System.out.println("Name of countries having region as Europe:");
                for (String data1 : rg){
                	System.out.println(data1);
                }
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }  
    }  
}
