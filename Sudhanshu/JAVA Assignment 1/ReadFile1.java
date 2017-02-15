import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class ReadFile1 {
    public static void main(String[] args) throws Exception {
	System.out.println("Please Enter the File name");      
        FileInputStream in = new FileInputStream(new Scanner(System.in).nextLine());
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        

	ArrayList<String> lines = new ArrayList<String>();

        String tmp="";
        while ((tmp = br.readLine()) != null) {
            lines.add(tmp);
        }
        for (int i = lines.size()-10; i < lines.size(); i++) {
            System.out.println(lines.get(i));
        }
        in.close();
    }//eo main
}//eo class
