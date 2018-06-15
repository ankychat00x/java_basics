package exceptions;

import java.util.Scanner;

public class PaymentApp {
	
	public static void main(String [] args) 
	{
		double pay = 0;
		boolean b = true;
		do {
		System.out.println("enter the amount ");
		Scanner sc = new Scanner(System.in);
		try
		{
			pay =sc.nextDouble();
			if(pay < 0)
			{
				throw new NegativePaymentException(pay);
			}
			else
				b=true;
		}
		catch(NegativePaymentException e)
		{
			System.out.println(e.toString());
			b=false;
		}
	}while(!b);
		System.out.println("thank you for your payment");
	}

}
