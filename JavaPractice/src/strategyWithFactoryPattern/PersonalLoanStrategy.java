package strategyWithFactoryPattern;

public class PersonalLoanStrategy implements InterestCalculationStrategy {

	@Override
	public double calculateInterest(double loanAmount) {
		return loanAmount * 0.12;
	}
	
}
