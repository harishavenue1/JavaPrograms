
public class PrimeChecker {

	public static void main(String[] args) {

		// print prime numbers
		
		int count = 25;
		isPrimeCheck(count);
		for (int i = 1; i < count; i++) {
			if (isPrimeCheck(i))
				System.out.println(i);
		}
	}

	private static boolean isPrimeCheck(int num) {
		if (num == 2)
			return true;
		else if (num < 2 || num % 2 == 0)
			return false;
		else {
			int sq = (int)Math.sqrt(num);
			for (int c = 3; c <= sq; c = c + 2) {
				if (num % c == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
