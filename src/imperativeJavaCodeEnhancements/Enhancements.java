package imperativeJavaCodeEnhancements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import static java.util.Map.entry;

public class Enhancements {
	
	
	//Old way of initialising array lists
	public void oldWayOfInitialisingArrayLists() {
		//Old way of initialising array lists
		List<String> friends = new ArrayList<>();
		friends.add("Raphael");
		friends.add("Olivia");
		friends.add("Thibaut");
	}


	
	//New way
	public void newWayOfInitialisingArrayLists() {
		//new way of initialising array lists
		List<String> friends = Arrays.asList("Raphael","Lily");
		
	    List<String> friends2 = List.of("Raphael", "Olivia", "Thibaut");
        friends.add("Chih-Chun");
        
        //disadvantage of this is you cannot add to already initialized list
	}
	
	
	
	public void oldWayOfInitialisingMaps() {
		//old way
		Map<String, Integer> ageOfFriends=new HashMap<>();
		//putIffAbsent
		ageOfFriends.put("Ellie", 2);
		//new way1
		Map<String, Integer> ageOfFriends1=Map.of("Raphael", 30, "Olivia", 25);
		//new way2
		Map<String, Integer> ageOfFriends2=Map.ofEntries(entry("Lisa",10));}
	
	
	
	
	public void sortingAMap() {
		Map<String, String> favouriteMovies
		= Map.ofEntries(entry("Raphael", "Star Wars"),
				entry("Cristina", "Matrix"),
				entry("Olivia",
						"James Bond"));
		favouriteMovies
		.entrySet()
		.stream()
		.sorted(Entry.comparingByKey())
		.forEachOrdered(System.out::println);
	}

}


