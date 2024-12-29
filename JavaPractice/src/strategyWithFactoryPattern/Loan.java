package strategyWithFactoryPattern;

public class Loan {

	private final double amount;
	private final InterestCalculationStrategy interestStrategy;
	
	public Loan(double amount, String loanType) {
		this.amount = amount;
		this.interestStrategy = StrategyFactory.getStrategy(loanType);
	}
	
	public double calculateInterest() {
		return interestStrategy.calculateInterest(amount);
	}
	
}
