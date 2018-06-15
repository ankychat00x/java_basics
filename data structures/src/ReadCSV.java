import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
	public static void main(String [] args)
	{
		List<String []> data = new ArrayList<String []>();
		
		String filename = "C:\\RituPractice\\myfiles\\CSVfile.txt";
		String testrow="";
		
		try {
			//open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			//read data as long as it is not empty
		
				while((testrow = br.readLine()) != null)
				{
					String[] line = testrow.split(",");
					data.add(line);
				}
				
			}
		catch (IOException e) 
		    {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		for(String[] s : data) 
			{
			for(String a : s)
			{
				System.out.println(a);

			}
		}
}



}
