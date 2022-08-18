package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFunctionExamples {
	
	public static void main(String[] args) {
		var y=10;
		
		ArrayList<Integer>l =new ArrayList<>();
		l.add(0);
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		
		System.out.println(l);
		List<Integer>l1=	l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l1);
		
		ArrayList<Integer>marks =new ArrayList<>();
		marks.add(0);
		marks.add(5);
		marks.add(10);
		marks.add(3);
		marks.add(4);
		marks.add(12);
		marks.add(9);


		List<Integer>updatedMarks=	marks.stream().filter(i->i<10).collect(Collectors.toList());
	//	List<Integer>updatedMarks=	marks.stream().takeWhile(i->i<10).collect(Collectors.toList());
		long numberOfFailed=marks.stream().filter(i->i<10).count();
		
		List<Integer>sortedMarks=marks.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(numberOfFailed);
		System.out.println(marks);
		System.out.println(updatedMarks);
		System.out.println(sortedMarks);
		
		
		List<String> words = Arrays.asList("Modern", "Java", "In", "Action");
		List<Integer> wordLengths = words.stream()
		                                 //.map(s->s.length())
		                                 .map(String::length)
		                                 .collect(Collectors.toList());
		
		System.out.println(wordLengths);
		
		System.out.println("------------------");
		
		sortAndCompare();
		minAndMax();
		foreach();

		
		
		
		
		
	}
	
	public static void sortAndCompare() {
		
		ArrayList<String>names =new ArrayList<>();
		names.add("Pradesh Kadeep");
		names.add("Pradesh");
		names.add("Durga Sir");
		names.add("ET");

		
		/*In the case you want a custom sort...you can write your own comparator
		lambda function and pass it to the sort method*/
		
		Comparator<String> c=(s1,s2)->{
			return Integer.compare(s2.length(),s1.length());
		};
		
		List<String>sortedNamesByLength=names.stream().sorted(c).collect(Collectors.toList());
		//List<String>sortedNamesByLength=names.stream().sorted(Integer::compare).collect(Collectors.toList());
		System.out.println(sortedNamesByLength);

	}
	
	
	
	public  static void minAndMax() {

		ArrayList<Integer>marks =new ArrayList<>();
		marks.add(1);
		marks.add(5);
		marks.add(10);
		marks.add(3);
		marks.add(4);
		marks.add(12);
		marks.add(9);

		
		/*In the case you want a custom sort...you can write your own comparator
		lambda function and pass it to the sort method*/

		
		int min=marks.stream().min((i1,i2)->i1.compareTo(i2)).get();
	//	int min=marks.stream().min((i1,i2)->i1.compareTo(i2)).get();
		int max=marks.stream().reduce(Integer::max).get();
		System.out.println(min);
		System.out.println(max);

	}
	
	public static void transform(int i) {
		System.out.println("I am transforming i "+i);
	}
	
	
	public static void foreach() {

		ArrayList<Integer>marks =new ArrayList<>();
		marks.add(1);
		marks.add(5);
		marks.add(10);
		marks.add(3);
		marks.add(4);
		marks.add(12);
		marks.add(9);
		
	//	Consumer<Integer> c=ExampleOne::minAndMax;


		/*marks.stream().forEach(i->System.out.println(""));
		/marks.stream().forEach(System.out::println);
		foreach in streams  is to be used like a for each loop...so in the instance where you have a statement to be executed
		in the foreach loop...you simple pass that to the foreach in streams
		
		In the case you need to execute a simple syso...you can pass it as a lambda function...or 
		invoke the method reference of the native syso function
		
		TODO: Its however recommended to use map instead of foreach in the collection processing pipeline.
		They both do the samething but map is more efficient 
		
		this::transform can be used in the case where the method is non static*/
		
		marks.stream().forEach(StreamFunctionExamples::transform);

	}
	
	
	public static void streamsAsCollections() {
		Stream<Integer> s= Stream.of(1,3,4);
		s.forEach(System.out::println);
		
		Integer[]i= {1,2,4};
		
		Stream.of(i).forEach(System.out::println);
	}
	

	

}
