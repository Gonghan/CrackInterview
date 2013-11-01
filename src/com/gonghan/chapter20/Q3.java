package com.gonghan.chapter20;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
 * Write a method to randomly generate a set of m integers from an array of size n.
 Each element must have equal probability of being chosen.
 */
public class Q3 {

	public Set<Integer> generate(int m, ArrayList<Integer> n) throws Exception {
		// Create a new arrayList to store all the integers not in n.
		ArrayList<Integer> rest = new ArrayList<Integer>();
		// Create a new set
		Set<Integer> set = new HashSet<Integer>();
		for (int v : n) {
			rest.add(v);
		}
		for (int i = 0; i < m; i++) {
			int size = rest.size();
			if (size <= 0) {
				throw new Exception("M should be smaller than n");
			}
			int randomPosition = getRandom(size);
			int randomValue = rest.get(randomPosition-1);
			rest.remove(randomPosition-1);
			set.add(randomValue);
		}
		return set;
	}

	// input: integer i
	// output: a random integer from 1 to i
	private int getRandom(int i) {
		return (int) (Math.random() * i) + 1;
	}

}
