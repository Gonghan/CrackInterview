package com.gonghan.chapter20;

import java.util.ArrayList;

/*
 * Write a method to shuffle a deck of cards. It must be a perfect shuffle - in other words, 
 * each 52! permutations of the deck has to be equally likely. Assume that you are given a random
 *  number generator which is perfect.
 */
public class Q2 {

	private int getRandom(int i) {
		return (int) (Math.random() * i) + 1;
	}

	// create two arrays
	// one for used, the other for the rest, initialized with 1,2,3,...52
	// select the nth from the second array, then n--. insert this value into
	// the first array
	public ArrayList<Integer> shuffle() {
		ArrayList<Integer> rest_array = new ArrayList<Integer>();
		ArrayList<Integer> result_array = new ArrayList<Integer>();

		for (int i = 1; i <= 52; i++) {
			rest_array.add(i);
		}
		for (int i = 0; i < 52; i++) {
			int tmp_position = getRandom(52 - i);
			int tmp_value = rest_array.get(tmp_position-1);
			result_array.add(tmp_value);
			rest_array.remove(tmp_position-1);
		}
		return result_array;
	}

}
