package Algo;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int[] arr = { 0, 0, 1, 2, 4, 5, 6, 6 };

		int slow = 0, fast = 1;
		while (fast < arr.length) {
			if (arr[slow] != arr[fast]) { // check for match only when indexes dont match, so then only slow will get fast index value
				slow++; // to replace increment slow counter
				arr[slow] = arr[fast]; 
			}fast=fast+1; // when things match, then increment fast
		}
		
		// final array // final array is till slow counter, as fast counter might have next duplicate value
		for (int i=0; i<slow+1;i++) {
			System.out.println(arr[i]);
		}
	}
}
