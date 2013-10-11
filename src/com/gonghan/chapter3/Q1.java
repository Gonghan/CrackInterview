package com.gonghan.chapter3;

import java.util.Stack;

// implement three stacks using one array
// the IDs of three stacks are 0,1,2
public class Q1 {
	private int array[];
	// counter[] stores all three tops of the stacks
	private int counter[];
	public final static int FIRST = 0;
	public final static int SECOND = 1;
	public final static int THIRD = 2;
	private final int LENGTH = 100;

	public Q1() {
		array = new int[LENGTH];
		counter = new int[] { 0, 0, 0 };
	}

	public void push(int stackID, int value) {
		if (getRealPosition(stackID) >= LENGTH) {
			// wrong
		} else {
			array[getRealPosition(stackID)] = value;
			counter[stackID]++;
		}
	}

	public int pop(int stackID) {
		int position = getTop(stackID);
		// none element, nothing to pop
		if (counter[stackID] <= 0)
			return -1;
		else {
			counter[stackID]--;
			return array[position];
		}
	}

	public int peek(int stackID) {
		int position = getTop(stackID);
		if (counter[stackID] <= 0) {
			return -1;
		}
		return array[position];
	}

	// get the real position of an
	private int getRealPosition(int stackID) {
		return 3 * counter[stackID] + stackID;
	}

	private int getTop(int stackID) {
		if (counter[stackID] <= 0) {
			// wrong
			return -1;
		}
		return (counter[stackID] - 1) * 3 + stackID;
	}
}