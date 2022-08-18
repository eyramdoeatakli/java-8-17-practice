package predicates;

public class AppleHeavyWeightPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		//return apple.getWeight() > 150;
		if (apple.getWeight() > 150) {
		return true;
		}else {
		return false;
	
		}
		
		}
	

}
