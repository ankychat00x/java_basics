package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {
	public static void main(String [] args)
	{
		
	//define the file path that we want to write
	//create the file in java
	//open the file
	//write to the file
	//close the resources
	String filename = "C:\\RituPractice\\myfiles\\fileToWrite.text";
	String message = "i am writing data that will be placed to a file";
	
     File file = new File(filename); 
     //open the file
     FileWriter fw;
	try {
		fw = new FileWriter(file);
		 fw.write(message);
		 fw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println("error: could not read file");
		e.printStackTrace();
	}
    finally
    {
    	System.out.println("closing the filewriter");
    }
     
     
	}
}
