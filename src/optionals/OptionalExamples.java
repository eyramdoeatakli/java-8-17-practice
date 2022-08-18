package optionals;

import java.util.Optional;

public class OptionalExamples {
	
	public static void main(String[] args) {
		
		
		//vanillaExampleWithoutOptional();
		//optionalMethodIfValueIsNotPresent();
		//optionalMethodIfValueIsPresent();
		optionalIfPresentMethod();
	}
	
	
	public static void vanillaExampleWithoutOptional() { 
		        String[] str = new String[10];  
		        String lowercaseString = str[5].toLowerCase();  
		        System.out.print(lowercaseString);  	     
	}
	
	
	public static void optionalMethodIfValueIsNotPresent() {
		 String[] str = new String[10];  
	        Optional<String> checkNull = Optional.ofNullable(str[5]);  
	        if(checkNull.isPresent()){  // check for value is present or not  
	            String lowercaseString = str[5].toLowerCase();  
	            System.out.print(lowercaseString);  
	        }else  
	            System.out.println("string value is not present");  
	    } 
	
	
	public static void optionalMethodIfValueIsPresent() {
		 String[] str = new String[10];        
	        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";// Setting value for 5th index  
	        Optional<String> checkNull = Optional.ofNullable(str[5]);  
	        if(checkNull.isPresent()){  // It Checks, value is present or not  
	            String lowercaseString = str[5].toLowerCase();  
	            System.out.print(lowercaseString);  
	        }else  
	            System.out.println("String value is not present");  
	}
	
	
	
	public static void optionalIfPresentMethod() {
        String[] str = new String[10];        
     //   str[5] = "JAVA OPTIONAL CLASS EXAMPLE";  // Setting value for 5th index  
        str[5] = null;  // Setting value for 5th index  
     //   Optional<String> checkNull=Optional.checkNull.ifPresent(System.out::println);
       // System.out.println(checkNull.get());
		
	}
	
	
	
	
	
	
	

}
