package algorithms;

public class search {

	public static int LS (int [] dataset,int target)
	{
		for(int i = 0 ; i<dataset.length ; i++)
		{
			if(dataset[i] ==  target)
			{
				return i;
				
			}
		}
		return -1;
		
	}
	
	public static int BS (int [] dataset,int target,int start,int end)
	{
		int mid =(int)Math.floor((start+end)/2);
		System.out.println("mid" + mid);
		int val = dataset[mid];
		
		if( target > val)
		{
			System.out.println(target + " > " + val);
			return BS(dataset,target,mid+1,end);
		}
		else if(target < val)
		{
			System.out.println(target + " < " + val);
			return BS(dataset,target,0,mid-1);
		}
		System.out.println(target + " = " +val);
		return mid;
	}
}
