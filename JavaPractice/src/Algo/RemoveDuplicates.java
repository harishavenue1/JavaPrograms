package Algo;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int[] arr = { 0, 0, 1, 2, 4, 5, 6, 6 };

		int slow = 0, fast = 1;
		while (fast < arr.length) {
			if (arr[slow] != arr[fast]) {
				slow++;
				arr[slow] = arr[fast];
			}fast=fast+1;
		}
		
		// final array
		for (int i=0; i<slow+1;i++) {
			System.out.println(arr[i]);
		}
	}
}
