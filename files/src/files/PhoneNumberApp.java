package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {
	
	public static void main(String [] args)
	{
		String filename = "C:\\RituPractice\\myfiles\\PhoneNumber.txt";
		String number="";
		String [] phoneNums =  new String[4];
		File file = new File(filename);
		int l=0;
		
		
		 try
		 {
			 BufferedReader br = new BufferedReader(new FileReader(file));
			 for(l=0; l < phoneNums.length ; l++)
				{
			 phoneNums[l] = br.readLine();
			
			 } 
			 br.close();
		 }
		 catch (FileNotFoundException f)
		 {
			 System.out.println("file not found");
			 f.printStackTrace();
		 }
		 catch (IOException e)
		 {
			 System.out.println("could not read file");
			 e.printStackTrace();
		 }
		
		
		 
		 for(int j = 0 ; j <phoneNums.length ; j++)
		 {
			 number = phoneNums[j];
		 try {
			 if(number.length() != 10)
			 {
				 throw new TenDigitException(number);
			 }
			 if((number.substring(0,1).equals("0")) || (number.substring(0,1).equals("9")))
			 {
				 throw new AreaCodeException();
			 }
			 for(int i = 0 ; i<number.length() -2 ; i++)
			 {
				 if(number.substring(i, i+1).equals("9"))
				 {
					 if(number.substring(i+1, i+3).equals("11"))
					 {
						 throw new EmergencyException();
					 }
				 }
			 }
		 System.out.println(number);
	
		 }
		 catch(TenDigitException t)
		 {
			 System.out.println("error : phone number is not of ten digits");
		 }
		 catch(AreaCodeException a)
		 {
			 System.out.println("error : cannot start with zero");
		 }
		 catch(EmergencyException e)
		 {
			 System.out.println("error : cannot have 911");
		 }
		 }
		
		 
	}

}

class TenDigitException extends Exception
{
	String num;
	public TenDigitException(String num) {
		// TODO Auto-generated constructor stub
		this.num =num;
	}
	public String toString()
	{
		return "tenDigitException " + num;
	}
}


class AreaCodeException extends Exception
{
	
}


class EmergencyException extends Exception
{
	
}


