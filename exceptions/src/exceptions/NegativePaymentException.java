package exceptions;

public class NegativePaymentException extends Exception
{
	double payment;
	public NegativePaymentException(double payment)
	{
		System.out.println("ERROR: negatvive payment");
		this.payment =payment;
	}
	
	public String toString()
	{
		return "ERROR : cannot take negative payment : " + payment;
	}

}
