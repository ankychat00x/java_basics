import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CreditCardStatement {
	public static void main(String [] args)
	{
List<String []> transactions = new ArrayList<String []>();
		
		String filename = "C:\\RituPractice\\myfiles\\creditCardStatement.txt";
		String testrow="";
		double balance = 0;
		
		try {
			//open the file
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			//read data as long as it is not empty
		
				while((testrow = br.readLine()) != null)
				{
					String[] line = testrow.split(",");
					transactions.add(line);
				}
				
			}
		catch (IOException e) 
		    {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		for (String [] tran : transactions)
		{
			String date = tran[0];
			String type = tran[1];
			String vendor = tran[2];
			
			double amount = Double.parseDouble(tran[3]);
			
			System.out.println(date + " " + type + " " + vendor + " " + amount);
			
			if(type.equalsIgnoreCase("CREDIT"))
			{
				//System.out.println("add to balance");
				balance = balance + amount;
				System.out.println("available balance = " + balance);
			}
			
			else if(type.equalsIgnoreCase("DEBIT"))
			{
				//System.out.println("subtract from balance");
				balance = balance - amount;
				System.out.println("available balance = " + balance);
			}
			
			else
			{
				System.out.println("some other transaction");
			}
			
			
		}
		
		//checking the balance
		
		if(balance > 0)
		{
			System.out.println("you have a balance of " + balance);
			System.out.println("you are charged a 10% fee of " + 0.1*balance);
			System.out.println("your new balance is " + balance * 1.1);
		}
		
		else if (balance < 0)
		{
			System.out.println("thanks for your payments");
			System.out.println("you have an overpayment of -"+balance);
		}
		
		else
		{
			System.out.println("thank you for your payment");
		}
		
	}

}
