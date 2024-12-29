package strategyWithFactoryPattern;

public class HomeLoanStrategy implements InterestCalculationStrategy {

	@Override
	public double calculateInterest(double loanAmount) {
		return loanAmount * 0.09;
	}
	
}
