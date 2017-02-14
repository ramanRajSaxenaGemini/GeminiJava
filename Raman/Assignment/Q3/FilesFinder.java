import java.util.Scanner;
import java.io.*;

class FilesFinder{
	public static void main(String s[]){

		System.out.println("Enter Directory : ");
		File dir = new File(new Scanner(System.in).nextLine());
		if(dir.isDirectory())
			printFileList(dir);
	
	}
	
	public static void printFileList(File dir){
		try{
			File[] filesList = dir.listFiles();
			for (File file : filesList) {
				if (file.isFile()) {
					System.out.println(file.getAbsolutePath());
				}
				else if(file.isDirectory())
					printFileList(file);
			}
		}catch(Exception e){
			System.out.println("!! Invalid File");
		}
	}

}
