package strategyWithFactoryPattern;

public class Demo {

	public static void main(String[] args) {
		
		Loan personalLoan = new Loan(10000,"personal");
		System.out.println("PI "+ personalLoan.calculateInterest());
		
/* Strategy
 * 
 * In Strategy pattern, we create objects which represent various strategies and
 * a context object (loan) whose behavior varies as per its strategy object. 
 * The strategy object changes the executing algorithm of the context object.
 */
		
//		Starting from public static void main, our entry point:
//
//		The main method starts by creating a new Loan object. 
//		During the Loan object instantiation, it passes the loan amount and type (e.g., "personal") 
//		to the Loan class constructor.
//
//		Inside the Loan class constructor, the StrategyFactory.getStrategy method is called 
//		with the loan type as an argument. 
//		This factory method returns the appropriate InterestCalculationStrategy instance 
//		based on the loan type. The returned strategy object is then associated 
//		with the Loan object for interest calculation. 
//		This demonstrates the use of the Factory pattern to instantiate strategy objects.
//
//		The main method then calls the calculateInterest method on each Loan object. 
//		This method delegates the interest calculation to the strategy object (interestStrategy) 
//		associated with the loan. The calculation is done based on the loan type's 
//		specific interest rate defined in the respective strategy class 
//		(e.g., PersonalLoanInterestStrategy calculates interest at 12% for personal loans).
	}

}
