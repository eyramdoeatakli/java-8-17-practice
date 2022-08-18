package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;




public class CollectorExercises {
	
	
	

	public  void maxUsingCollectorInterf() {

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

		    Comparator<Transaction> transvaluesComparator =
			    comparing(t->t.getValue());
			Optional<Transaction> maxTransValue =
					transactions.stream()
			        .collect(Collectors.maxBy(transvaluesComparator));
        		
        	    System.out.println(maxTransValue.get());
        	    
        	    
               //Finding avg using collectors
                double avgTrans =
                		transactions.stream().collect(averagingInt(Transaction::getValue));
                
                
                
                //Using collectors 
        	    int sumOfTransactionsCambridge=transactions.stream()
        		.filter(t->t.getTrader().getCity()=="Cambridge")
        		.collect(summingInt(Transaction::getValue));
        	    System.out.println(sumOfTransactionsCambridge);
        	    
        	    //Using reduce an collectors
        	    
        	    int sumOfTransactionsCambridgeRC = transactions.stream().collect(reducing(0,
        	    		Transaction::getValue,
                        Integer::sum));


        	    
        	    
        	    //Finding summary stats using collectors
        	    IntSummaryStatistics menuStatistics =
        	    		transactions.stream().collect(summarizingInt(Transaction::getValue));
        	    
        	    
        	    
        	    
        	    
        	    
                		
		
	}
	
	

}
