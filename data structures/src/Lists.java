import java.util.ArrayList;

public class Lists {
	public static void main(String [] args)
	{
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("asansol");
		ar.add("hyderabad");
		ar.add("bangalore");
		
		for(String city : ar)
		{
			System.out.println(city);
		}
		
		System.out.println("\n");
		System.out.println(ar.get(2));
		
		ar.remove(0);
		
		for(String city : ar)
		{
			System.out.println(city);
		}
		
		System.out.println(ar.size());
	}

}
