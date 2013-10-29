package com.gonghan.chapter19;

/*
 * 
 * You are given an array of integers (both positive and negative). Find the continuous sequence with the largest sum. Return the sum.
 EXAMPLE
 Input: {2, -8, 3, -2, 4, -10}
 Output: 5 (i.e., {3, -2, 4} )
 */
public class Q7 {

	private int[] output;
	private int sum;

	public int getLargestSequence(int[] input) {
		int sum = 0;
		int maxSum = 0;
		for (int i = 0; i < input.length; i++) {
			sum += input[i];
			if (maxSum < sum) {
				maxSum = sum;
			}
			if (sum < 0) {
				sum = 0;
			}

		}
		return maxSum;
	}

}
