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
import java.util.*;

public class JsonParserUrl {
   
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
	ArrayList<String> eur= new ArrayList<String>();

        try {        
            URL oracle = new URL("https://restcountries.eu/rest/v1/all "); // URL to Parse
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
           
            String inputLine;
            while ((inputLine = in.readLine()) != null) {              
                JSONArray a = (JSONArray) parser.parse(inputLine);
               
                //loop through each item
                for (Object o : a) {
                    JSONObject tutorials = (JSONObject) o;

                    String id = (String) tutorials.get("name");
			if (id.equals("India")){
				System.out.println("----------------------------------------------------\n\n");
				System.out.println("\n\nALL THE DATA OF INDIA:\n");
				for(Object objj : tutorials.keySet()){
					System.out.println(objj+"="+tutorials.get(objj));
				}}

                    //System.out.println("Post ID : " + id);

                   // String title = (String) tutorials.get("capital");
                   // System.out.println("Post Title : " + title);

                  //  System.out.println("\n");
		if(id.equals("Australia")){
		//String title = (String) tutorials.get("timezones");
		String title= ((JSONArray)tutorials.get("timezones")).get(1).toString();
		System.out.println("\n\nTIMEZONES OF AUSTRALIA:  " + title+"\n\n");
		}

		if(id.equals("China")){
			JSONArray border= ((JSONArray)tutorials.get("borders"));
			System.out.println("---------------------------------------------\n\n");
			System.out.println("Borders of China are:\n");
			for(int i=0; i<border.size();i++){
				System.out.println(border.get(i));				
				}			
			}
		
		 String info = (String) tutorials.get("region");
			if (info.equals("Europe")){

					eur.add(tutorials.get("name").toString());
				}
		
                }System.out.println("-------------------------------------------------\n\n");
		System.out.print("\n\nALL THE COUNTRIES HAVING REGION=EUROPE:\n\n");
		for (String data : eur){System.out.println(data);}
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
