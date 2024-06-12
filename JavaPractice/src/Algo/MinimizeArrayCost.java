package Algo;

public class MinimizeArrayCost {
	
	public static void main(String[] args) {
        int[] arr = {1,3,5,2,10}; // Example input array

        int cost = getMinimumCost(arr);
        System.out.println("Minimum Cost: " + cost);
    }

    public static int getMinimumCost(int[] arr) {
        int cost = 0;
        int maxCost = 0;
        int fIndex = 0;
        int sIndex = 0;

        // Find max difference between neighbors
        for (int i = 0; i < arr.length - 1; i++) {
            int first = arr[i];
            int second = arr[i + 1];
            if (Math.abs(second - first) > maxCost) {
                maxCost = Math.abs(second - first);
                fIndex = i;
                sIndex = i + 1;
            }
        }

        // New number between the max diff
        int mid = (arr[fIndex] + arr[sIndex]) / 2;

        // Add the cost
        cost += (arr[fIndex] - mid) * (arr[fIndex] - mid);
        cost += (arr[sIndex] - mid) * (arr[sIndex] - mid);

        // Add the cost
        for (int i = 0; i < arr.length - 1; i++) {
            if (i == fIndex) {
                continue;
            }
            int first = arr[i];
            int second = arr[i + 1];
            cost += (first - second) * (first - second);
        }

        return cost;
    }

}
