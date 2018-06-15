package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordCriteriaApp {
	
	public static void main(String [] args)
	{
		String filename = "C:\\RituPractice\\myfiles\\passwordCriteria.txt";
		File file = new File(filename);
		boolean f1=false,f2=false,f3=false,f4=false;
		String passwrd="";
		String[] pass = new String [13];
		int i=0;
		
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(file));
			for(i=0 ; i < pass.length ; i++) 
			{
			 pass[i] = br.readLine();
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
		
		
		
		
		 for(int k = 0 ; k <pass.length ; k++)
		 {
			 passwrd = pass[k];
			 
			 
			 for(int a = 0 ; a < passwrd.length() ; a++)
			 {
					 if("0123456789".contains(passwrd.substring(a,a+1)))
					 {
						 f1=true;
						// System.out.println("position " + a + "contains a number");
					 }
					 
					 else if("abcdefghijklmnopqrstuvwxyz".contains(passwrd.substring(a,a+1).toLowerCase()))
							 {
						 
						         f2=true;
						        // System.out.println("position " + a + "contains a letter");
							 }
					 
					 else if("!@#$%^&*-_".contains(passwrd.substring(a,a+1)))
							 {
						 
						       f3=true;
						      // System.out.println("position : " + a + "contains a character");
							 }
					 else
					 {
						 f4=true;
					 }
						 System.out.println("invalid character");
					 }
			// }
				 
	
	//test
	try {
	if(f4)
	{
		throw new InvalidCharacterException();
	}
	else if(!f1 || !f2 || !f3)
	{
		System.out.println("criteria mismatch");
		throw new CriteriaException();
	
	}
	else
	{
		System.out.println("valid password");
	}
	
  
	}
	catch(InvalidCharacterException e)
	{
		System.out.println("error: invalid password");
	}
	catch(CriteriaException c)
	{
		System.out.println("error: criteria exception");
	}
			 }
		 }

}

class NumberException extends Exception
{
	
}
class LetterException extends Exception
{
	
}

class SpecialCharacterException extends Exception
{
	
}
class InvalidCharacterException extends Exception
{
	
}
class CriteriaException extends Exception
{
	
}

