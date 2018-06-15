
public class sum {
	public static void main (String args[])
	{
		sum.add(20);
		System.out.println(sum.fact(0));
		
		int [] numbers = {9,-2,5,4,-10,34,45,3,4};
		System.out.println("min " + sum.FindMin(numbers));
		System.out.println("max " + sum.FindMax(numbers));
		System.out.println("average " + sum.avg(numbers));
	}
   public static void add(int n)
   {
	   int sum = 0;
	   for(int i= 0 ; i<=n ;i++)
	   {
		   sum = sum + n;
	   }
	   System.out.println(sum);
   }
   
   public static int fact(int n )
   {
	   if(n==0)
		   return 1;
	   else
		   return fact(n-1)*n;
   }
   
   
   public static int FindMin(int [] arr)
   {
	   int min = arr[0];
	   for(int i = 0; i < arr.length ; i++)
	   {
		   if(arr[i] < min)
		   {
			   min = arr[i];
		   }
	   }
	   return min;
   }
   
   public static int FindMax(int [] arr)
   {
	   int max = arr[0];
	   for(int i = 0; i < arr.length ; i++)
	   {
		   if(arr[i] > max)
		   {
			   max = arr[i];
		   }
	   }
	   return max;
   }
   
   public static double avg(int [] n)
   {
	   int sum = 0;
	   for(int i = 0 ; i < n.length ; i++)
	   {
		   sum = sum + n[i];
	   }
	   return sum/n.length;
   }
}
