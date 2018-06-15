package algorithms;

public class Sort {
	public static void BubbleSort(int [] dataset)
	{
		System.out.println("the original array is");
		for(int i = 0 ; i < dataset.length ;i++) {
			System.out.print(dataset[i] + " ");
		}
		boolean b;
		do {
			b= false;
		for(int i = 0 ; i <dataset.length-1 ; i++)
		 {
			
			if(dataset[i] > dataset[i+1]) 
			{
				int temp = dataset[i];
				dataset[i]= dataset[i+1];
				dataset[i+1]= temp;
				b= true;
			}
		}
		}while(b);
		
		System.out.println("the sorted array is");
		for(int i = 0 ; i < dataset.length ;i++) {
			System.out.print(dataset[i] + " ");
		}
	}

}
