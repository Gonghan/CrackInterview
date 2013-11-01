package com.gonghan.chapter20;

/*
 * Write a function that adds two numbers. You should not use + or any arithmetic operators.
 */
public class Q1 {
	int add_no_arithm(int a, int b) {
		if (b == 0)
			return a;
		int sum = a ^ b; // add without carrying
		int carry = (a & b) << 1; // carry, but don’t add
		return add_no_arithm(sum, carry); // recurse
	}
}
