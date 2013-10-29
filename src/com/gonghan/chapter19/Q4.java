package com.gonghan.chapter19;

/*
 * Write a method which finds the maximum of two numbers. You should not use if-else or any other comparison operator.
 EXAMPLE
 Input: 5, 10
 Output: 10
 */

public class Q4 {
	public int findMax(int a, int b) {
		// NO if-else, >, <, =
		// if |a-b|>Integer.Maximum, cause an exception
		int c = ((a - b) >> 31) & 0x1;
		return a*(1-c)+b*c;
	}
}
