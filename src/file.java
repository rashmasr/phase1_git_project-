import java.io.File;  // Import the File class
import java.io.IOException; // Import the IOException class to handle errors
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
public class file 
{
private static File f;
public static void main(String[] args)throws IOException
{      
int ch=-1;
     try (Scanner S = new Scanner(System.in)) {
		do
		{
			System.out.println("welocome to lockme.com" );
			System.out.println(" programmer name:rashma" );
			System.out.println("1.create" );
			System.out.println("2.add the file " );
			System.out.println("3.delete the file" );
			System.out.println("4.search the file" );
			System.out.println("5.move to parent" );
			System.out.println("6. list down the files " );
			System.out.println("0.close the application" );
			System.out.println("enter your choice:");
			ch=S.nextInt();
		switch(ch) 
		{
			case 1:
				try {
				      File myObj = new File("filename.txt");
				      if (myObj.createNewFile()) {
				        System.out.println("File created: " + myObj.getName());
				      } else {
				        System.out.println("File already exists.");
				      }
				    } catch (IOException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    }
				 break;
			case 2:
			f = null;
			f = new File("file1.txt"); 
			 if(f!=null){
			    System.out.println("File created: " + f.getName());
			  } else {
			    System.out.println("File already exists.");
			  }
				 break;
			case 3:
				File myObj = new File("filename.txt"); 
			    if (myObj.delete()) { 
			      System.out.println("Deleted the file: " + myObj.getName());
			    } else {
			      System.out.println("Failed to delete the file.");
			    } 
		break;
		case 4:
			
			System.out.println("Enter the path to folder to search for files");
		      Scanner s1 = new Scanner(System.in);
		      String folderPath = s1.next();
		      File folder = new File(folderPath);
		      
		      if (folder.isDirectory()) {
		         File[] listOfFiles = folder.listFiles();
		         if (listOfFiles.length < 1)
	System.out.println("There is no File inside Folder");
		         else System.out.println("List of Files & Folder");
		         for (File file : listOfFiles) {
		            if(!file.isDirectory())
	System.out.println(file.getCanonicalPath().toString());
		         } 
		      } 
		      else System.out .println("There is no Folder @ given path :" + folderPath);
		   break;
		case 5:
			Path temp = Files.move
		        (Paths.get("C:\\"),
		                Paths.get("C:\\"));
		         
		                if(temp != null)
		                {
		                    System.out.println("File renamed and moved successfully");
		                }
		                else
		                {
		                    System.out.println("Failed to move the file");
		                }
		       
			break;
		case 6:
			  File file = new File("D:\\rashmaammu\\PHASE 1 PROJECT");

			    // returns an array of all files
			    String[] fileList = file.list();

			    for(String str : fileList) {
			      System.out.println(str);
			    }break;}
		}while(ch!=0);
			

}

}

}

				
				
			


