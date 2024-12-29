package strategyWithFactoryPattern;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {
	
	private static final Map<String, InterestCalculationStrategy> strategies = new HashMap<>();
	static {
		strategies.put("personal", new PersonalLoanStrategy());
		strategies.put("car", new CarLoanStrategy());
		strategies.put("home", new HomeLoanStrategy());
	}
	public static InterestCalculationStrategy getStrategy(String loanType) {
		return strategies.get(loanType);
	}
}
