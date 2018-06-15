package algorithms;

public class LinearSearch {
	public static void main(String [] args)
	{
		int [] numbers = {23,12,3,67,56,2,100,78,99};
		/*int [] sortednumbers = {5,9,23,56,78,87,90,99,201,358,400,450,543,1000};
		
		int res = algorithms.search.LS(numbers, 2);
		System.out.println("position is " + res);
		
		int a = algorithms.search.BS(sortednumbers, 90, 0, sortednumbers.length);
		System.out.println("is found at position " + a);*/
		
		algorithms.Sort.BubbleSort(numbers);
	}

}
