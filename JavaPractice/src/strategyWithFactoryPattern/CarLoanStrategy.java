package strategyWithFactoryPattern;

public class CarLoanStrategy implements InterestCalculationStrategy {

	@Override
	public double calculateInterest(double loanAmount) {
		return loanAmount * 0.085;
	}
	
}
