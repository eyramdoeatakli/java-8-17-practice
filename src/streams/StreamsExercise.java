package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExercise {
	
	public static void main(String[] args) {
	
    
        process2011();
        System.out.println("----------------");
        processUniqueCities();
        System.out.println("----------------");
        processNamesSorted();
        System.out.println("----------------");
        processNamesSortedAndPrintOutAsString();
        System.out.println("----------------");
        processTradersFromMilan();
        System.out.println("----------------");
        transactionsForTradersInCambridge();
        System.out.println("----------------");
        minMaxForAllTransactions();

	        
	        
	}

	public static void process2011() {

		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario","Milan");
		Trader alan = new Trader("Alan","Cambridge");
		Trader brian = new Trader("Brian","Cambridge");

		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950)
				);


        
        
    	Comparator<Transaction> c=(s1,s2)->{
			return Integer.compare(s1.getValue(),s2.getValue());
		};
        
       // List<Transaction> transaction_2011 =   transactions.stream()
        	   transactions.stream()
        		//.filter(t->t.getYear()==2011)
        		.filter(StreamsExercise::isYear2011)
        		.sorted(c)
        		
        		//.collect(Collectors.toList())
                .forEach(System.out::println);
        
      //  transaction_2011.forEach(System.out::println);
   //     transaction_2011.forEach(s->System.out.println("These are the transactions for 2011 "));
        	   System.out.println("available processors "+Runtime.getRuntime().availableProcessors());
		
	}
	
	public static boolean isYear2011(Transaction transaction) {
		Predicate<Integer> p=t->t==2011;
		return p.test(transaction.getYear());	
	} 
	
	
	//B4 solving a problem...always try to match adjective in problem to stream function eg. unique maps to distinct 
	public static void processUniqueCities() {
		
		    Trader raoul = new Trader("Raoul", "Cambridge");
	        Trader mario = new Trader("Mario","Milan");
	        Trader alan = new Trader("Alan","Cambridge");
	        Trader brian = new Trader("Brian","Cambridge");
        
		List<Trader> traderList=Arrays.asList(raoul,mario,alan,brian);
		
		traderList.stream().map(Trader::getCity).distinct().forEach(System.out::println);
		
	}
	
	
	public static void processNamesSorted() {
		
	    Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
    
	 List<Trader> traderList=Arrays.asList(raoul,mario,alan,brian);
	traderList.stream().map(Trader::getName).sorted().forEach(System.out::println);
	
}
	
	public static void processNamesSortedAndPrintOutAsString() {
		
	    Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
    
	     List<Trader> traderList=Arrays.asList(raoul,mario,alan,brian);
	     String listOfNames= traderList.stream().map(Trader::getName).sorted().collect(Collectors.joining(","));
		  System.out.println("listOfNames: "+listOfNames);


	
}
	
	
	public static void processTradersFromMilan() {
		
	    Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
        Trader paulo = new Trader("Paulo","Milan");

    
	List<Trader> traderList=Arrays.asList(raoul,mario,alan,brian,paulo);
	
	traderList.stream().filter(c->c.getCity()=="Milan").forEach(System.out::println);
	
}

	

	public static void transactionsForTradersInCambridge() {

		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario","Milan");
		Trader alan = new Trader("Alan","Cambridge");
		Trader brian = new Trader("Brian","Cambridge");

		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950)
				);


        
        	    int sumOfTransactionsCambridge=transactions.stream()
        		.filter(t->t.getTrader().getCity()=="Cambridge")
        		.map(t->t.getValue())
        		.reduce(0,(t1,t2)->Integer.sum(t1, t2));
        	    System.out.println(sumOfTransactionsCambridge);
        	    
        	    
        	
        	    
        	    //using primitive type for streams
        	    int sumOfTransactionsCambridgePrim=transactions.stream()
                		.filter(t->t.getTrader().getCity()=="Cambridge")
                		.mapToInt(t->t.getValue())
                		.sum();
                	    System.out.println(sumOfTransactionsCambridgePrim);
                	    
                	    
            	    
        	    
        	    
        		List<Transaction> listTransactionsCambridge=transactions.stream()
                		.filter(t->t.getTrader().getCity()=="Cambridge")
                		.collect(Collectors.toList());	
        		
        	    System.out.println(listTransactionsCambridge);

                		
		
	}
	
	
	public static void minMaxForAllTransactions() {

		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario","Milan");
		Trader alan = new Trader("Alan","Cambridge");
		Trader brian = new Trader("Brian","Cambridge");

		List<Transaction> transactions = Arrays.asList(
				new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000),
				new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710),
				new Transaction(mario, 2012, 700),
				new Transaction(alan, 2012, 950)
				);


              // Comparator<Integer>c=(t1,t2)->Integer.compare(t1, t2);
        	    int higehestValue=transactions.stream()
        		.map(Transaction::getValue)
        		.max((t1,t2)->Integer.compare(t1, t2)).get();
        	    
        	    //Using comparing method
        
                 Optional<Transaction> higehestValueComp=transactions.stream()
                		.max(Comparator.comparingInt(Transaction::getValue));
                 
         	  //  int maxValComp=higehestValueComp.get();

                	    
        	    
        	    //Using optional types
        	    OptionalInt higehestValueOptional=transactions.stream()
                		.mapToInt(t->t.getValue())
                		.max();
        	    int maxVal=higehestValueOptional.orElse(0);
        	    
        	    
        	    
        	    
        	    int lowestValue=transactions.stream()
                		.map(Transaction::getValue)
                		.min((t1,t2)->Integer.compare(t1, t2)).get();

        		
        	    System.out.println(higehestValue);
        	    System.out.println(lowestValue);
        	    
        	    
     

                		
		
	}
	
	
	
	
	
	
	
	
	

}
