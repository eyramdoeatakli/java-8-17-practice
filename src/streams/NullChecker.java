package streams;

import java.util.Objects;
import java.util.function.Predicate;

public class NullChecker {
	
	public static void main(String[] args) {
		checkForNull(0);
		
	}
	
	//cleaner way of checking for nulls in java8 and above
	public static void checkForNull(int a) {
		Predicate<Integer> p=Objects::nonNull;
		System.out.println(p.test(a));
	}

}
