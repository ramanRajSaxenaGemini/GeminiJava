import java.io.*;

public class FilePrinter{  
	
	public static void main(String args[]){    
		BufferedReader br;
		try{
			System.out.println("Enter File Name : ");
			br=new BufferedReader(new FileReader(new java.util.Scanner(System.in).nextLine()));    
			int count = 0,total = 0;    
			while((br.readLine())!=null)    
				total++;
			System.out.println("Total Lines : "+total);
			String s;
			br=new BufferedReader(new FileReader("File.txt"));
			while((s =br.readLine())!=null){
				count++;
				if(count>total-10)
					System.out.println("Line Number "+count+" : "+s);
			}    
			
			br.close();
		}
		catch(IOException fnfe){
			System.out.println("File Not Found");
		}
		
    }    
} 
