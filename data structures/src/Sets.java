import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
public class Sets {

	public static void main(String [] args)
	{
		
		// sets work on unique values
		//HashSet<String> animals = new HashSet<String>();
		
		//All the methods are gonna be the same like Set but would be implemented like a Hashset
		
		//if we use LinkedHashSet we get the display in the order we entered
		//HashSet has random order
		//TreeSet has alphabetical order
		
		Set<String> animals = new LinkedHashSet<String>();
		animals.add("dog");
		animals.add("cat");
		animals.add("bull");
		animals.add("cow");
		animals.add("snake");
		//hashset has random order
		System.out.println(animals.size() + " " + animals);
		
		System.out.println("\n");
		
		animals.add("cat");
		animals.add("buffalo");
		animals.add("giraffe");
		
		//displays only unique elements
		System.out.println(animals.size() + " " + animals);
		
		//for order we need to use polymorphism.We would create a class of Set but would be implemented like a HashSet.
		
		Set<String> farmAnimals =  new LinkedHashSet<String>() ;
		farmAnimals.add("cat");
		farmAnimals.add("cow");
		farmAnimals.add("chicken");
		farmAnimals.add("pig");
		farmAnimals.add("horse");
		farmAnimals.add("snake");
		
		// now we would find the intersection between two sets
		//copy existing set into a new set
		Set<String> intersectionSet = new LinkedHashSet<String>(animals);
		System.out.println(intersectionSet);
		//retain only those elements which are in the other set
		
		intersectionSet.retainAll(farmAnimals);
		
		System.out.println("intersection :" + intersectionSet);
		
		//finding the union of both sets
		
		Set<String> unionSet = new LinkedHashSet<String>(farmAnimals);
		
		unionSet.addAll(animals);
		
		System.out.println("union :" +unionSet);
		
		
		//what is the difference
		
		Set<String> diffSet = new LinkedHashSet<String>(farmAnimals);
		 diffSet.removeAll(animals);
		 
		 System.out.println("difference :" + diffSet);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
