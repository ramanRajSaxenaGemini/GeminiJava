import java.io.File;
import java.util.Scanner;
class PathFinder1{
	public void checkPath(File folder) throws Exception{
			File[] listOfFiles = folder.listFiles();
				for (File file : listOfFiles) {
				    	if (file.isFile()) {
						System.out.println(file.getCanonicalPath());
				    	}//eo if
						else if (file.isDirectory()){
							checkPath(file);
						}//eo else if
				}//eo for
		}//eo checkPath	

	public static void main(String args[])throws Exception{
	System.out.println("Please Enter the Path you want to search preceeded and followed by slash /");	
	String findPath=new Scanner(System.in).nextLine();
	File folder = new File(findPath);
	new PathFinder1().checkPath(folder);
	}//eo main

	
}//eo class