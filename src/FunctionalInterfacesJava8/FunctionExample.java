package FunctionalInterfacesJava8;

import java.util.function.Function;

public class FunctionExample {
	
	public static void main(String[] args) {
		
		Function<Integer,Integer>f= i->i*i;
		System.out.println(f.apply(10));
		
		
		
		
		Function<String,Integer>f1 =s->s.length();
		System.out.println(f1.apply("len"));
		
		Function<String,Integer>f2=FunctionExample::getlength;
		System.out.println(f2.apply("testingmic1tooo"));
	
		
	}

	
	public static Integer  getlength(String s) {
		return s.length();
	}
	
	
}
