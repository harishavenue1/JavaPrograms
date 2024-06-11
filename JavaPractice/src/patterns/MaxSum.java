package patterns;

class MaxSum {
	public static int solution(int[] S) {
		int max_sum = 0;
		int current_sum = 0;
		boolean positive = false;
		int n = S.length;
		for (int i = 0; i < n; ++i) {
			int item = S[i];
			if (item < 0) {
				if (max_sum < current_sum) {
					max_sum = current_sum;
					current_sum = 0;
				}
			} else {
				positive = true;
				current_sum += item;
			}
		}
		if (current_sum > max_sum) {
			max_sum = current_sum;
		}
		if (positive) {
			return max_sum;
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { -1, -2, -3, -4, -5, -6 };
		int sum = solution(arr);
		System.out.println("Max sum " + sum);

		arr = new int[] { 1, 2, 3, 4, 5, 6 };
		sum = solution(arr);
		System.out.println("Max sum " + sum);

		arr = new int[] { 1, -2, 3, -4, 5, -6 };
		sum = solution(arr);
		System.out.println("Max sum " + sum);

		arr = new int[] { -1, 2, -3, 4, -5, 6 };
		sum = solution(arr);
		System.out.println("Max sum " + sum);

		arr = new int[] { -1, -2, -3, 4, 5, 6 };
		sum = solution(arr);
		System.out.println("Max sum " + sum);
		
		arr = new int[] { 0 };
		sum = solution(arr);
		System.out.println("Max sum " + sum);
		
		arr = new int[] {  };
		sum = solution(arr);
		System.out.println("Max sum " + sum);
	}
}
