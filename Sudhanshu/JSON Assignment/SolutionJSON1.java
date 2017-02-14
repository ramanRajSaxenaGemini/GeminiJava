import java.io.FileReader;
import java.util.Iterator;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
 
public class SolutionJSON1 {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
 
        try {
            
            FileReader fr=new FileReader("jsonfile.json");
            Object obj = parser.parse(fr);
 
            JSONObject jsonObject = (JSONObject) obj;
 
        String runtime = (String)jsonObject.get("runtime");
		String firstWord=null;
        if (runtime.contains(" ")){
            firstWord=runtime.substring(0, runtime.indexOf(" "));
        }
        int runtimeInSeconds=(Integer.parseInt(firstWord)*60);
		System.out.println("1. Runtime in Seconds: "+runtimeInSeconds+" Seconds");
		
		
		JSONObject awards=(JSONObject)jsonObject.get("awards");
		System.out.println("2. Awards Win: "+awards.get("wins"));
		
		
		JSONObject reviews=(JSONObject)jsonObject.get("tomato");
		System.out.println("3. Awards Win: "+reviews.get("reviews"));
		
		String director=(String)jsonObject.get("director");
		System.out.println("4. Name of All Directors: "+director);
		
		JSONArray actors=(JSONArray) jsonObject.get("actors");
		System.out.println("5. Name of Second Actor: "+actors.get(1));
		
		String revenue=(String)jsonObject.get("Revenue");
		String revenueContains=null;
        if (revenue.contains(" ")){
            revenueContains=revenue.substring(1, revenue.indexOf(" "));
        }
        int revenueIndian=(Integer.parseInt(revenueContains)*6500000);
		System.out.println("6.Revenue in Indian Currency: "+revenueIndian+" INR");
        
            
         fr.close();
 
        }//eo try
		catch (Exception e) {
            e.printStackTrace();
        }//eo catch
    }//eo main
}//eo class


//Use this line to compile

//   javac -cp json-simple-1.1.1.jar: SolutionJSON1.java


//Use this line to run

//   java -cp json-simple-1.1.1.jar: SolutionJSON1
