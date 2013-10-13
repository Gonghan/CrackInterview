package com.gonghan.chapter3;

/*
 * In the classic problem of the Towers of Hanoi, you have 3 rods and N disks of different
 sizes which can slide onto any tower. The puzzle starts with disks sorted in ascending
 order of size from top to bottom (e.g., each disk sits on top of an even larger one). You
 have the following constraints:	
 (A) Only one disk can be moved at a time.
 (B) A disk is slid off the top of one rod onto the next rod.
 (C) A disk can only be placed on top of a larger disk.
 Write a program to move the disks from the first rod to the last using Stacks.

 */
public class Q4 {

	private int NumofDisks;

	public Q4(int n) {
		this.NumofDisks = n;
	}

	// recursive
	public void move(HanoiStack start, HanoiStack mid, HanoiStack dest) {

	}

	// display three stacks, just for tests
	public void display() {

	}
}

class HanoiStack {
	private int index;
	
	
	public void push(int value){
		
	}
	
	public int pop(){
		return 0;
	}
}
