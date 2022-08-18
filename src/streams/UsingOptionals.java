package streams;

import java.util.Optional;

public class UsingOptionals {
	
//	public static void main(String[] args) {
//		//Empty optional
//        Optional<Trader> traders = Optional.empty();
//        traders.orElse(null);
//        
//        //Optional with Value only...a null value cant be used with this
//        Optional<Trader> optCars = Optional.of(traders);
//        
//        //optional with null
//        //You can use this method every time you want to safely transform a value that could be null into an optional.
//        Optional<Trader> optCar1 = Optional.ofNullable(traders);
//        Optional.ofNullable(traders);
//        
//        //Getting information from an optional object
//        Optional<Insurance> optInsurance = Optional.ofNullable(insurance);
//        Optional<String> name = optInsurance.map(Insurance::getName);
//
//	}
//	
//    //Getting information based on nested params
//    public String getCarInsuranceName(Optional<Person> person) {
//        return person.flatMap(Person::getCar)
//        		 .flatMap(Car::getInsurance)
//        	        .map(Insurance::getName)
//        	        .orElse("Unknown");
//    }
//    
//    
//    //This allows us to use isPresent instead of is==null
//    public void givenOptional_whenIfPresentWorks_thenCorrect() {
//        Optional<String> opt = Optional.of("baeldung");
//        opt.ifPresent(name -> System.out.println(name.length()));
//        
//        Optional<Integer> optNum = Optional.of(5);
//
//    }
//
//    //This can be used when there is an alternate value ot be used in case of a null
//    public void whenOrElseWorks_thenCorrect() {
//        String nullName = null;
//        String name = Optional.ofNullable(nullName).orElse("john");
//        //This does not create the default  object if the wrapped value is absent
//        String nameSup = Optional.ofNullable(nullName).orElseGet(()->"John");
//        
//        boolean namess = Optional.ofNullable(nullName).isPresent();
//
//
//    }

}
