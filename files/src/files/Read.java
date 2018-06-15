package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String [] args) 
	{
		//define the file path that we want to read
		String filename = "C:\\RituPractice\\myfiles\\fileToRead.txt";
		String text="";
		//creating file in java
		File file = new File(filename);
		
		//open the file
		
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			
			//read the file
			 text = br.readLine();
			 // cloase the resources
			 br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("error : file not found : " + filename);
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error: could not read the data");
			e.printStackTrace();
		}
		finally
		{
			System.out.println("finished reading the file");
		}
		
        System.out.println(text);

		
		
	}
}
