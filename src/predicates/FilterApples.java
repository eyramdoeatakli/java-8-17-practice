package predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterApples {
	
	
	
	
	public static void main(String[] args) {
		
		List<Apple> inventory = Arrays.asList(new Apple(80, Color.GREEN),
                new Apple(155, Color.GREEN),
                new Apple(120, Color.RED));
		

        List<Apple> heavyApples =
        filterApples(inventory, new AppleHeavyWeightPredicate());
        System.out.println("Heavy Apples {}"+heavyApples.get(0));
		
	}
	
	
	
	
	
	
	public static List<Apple> filterApples(List<Apple> inventory,
			ApplePredicate p) {


		List<Apple> result = new ArrayList<>();
		for(Apple apple: inventory) {
			
			boolean ptestVal=p.test(apple);
	        System.out.println("ptestVal {}"+ptestVal);

			if(ptestVal) {
				result.add(apple);
			}   	   
		}
        System.out.println("result {}"+result.size());

		return result;
	}
	
	
//	public static void prettyPrintApple(List<Apple> inventory, ???) {
//	    for(Apple apple: inventory) {
//	        String output = ???.???(apple);
//	        System.out.println(output);
//	    }
//	}



	
	
	
	}



