
public class PrimeChecker {

	public static void main(String[] args) {

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
			int sq = (int)Math.sqrt(num);            // get the half value of N, to start multiplying from 1 - N/2 to see if N is multiple in between 1 - N/2
			for (int c = 3; c <= sq; c = c + 2) {    // 3 because 2 is already checked in 2nd if block, and +2 is becz, even already checked in 2nd if block
				if (num % c == 0) {
					return false;
				}
			}
		}
		return true; // if nothing is validated in above conditions, then its finally true
	}
}
