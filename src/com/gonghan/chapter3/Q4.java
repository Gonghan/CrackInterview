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
	private HanoiStack first;
	private HanoiStack second;
	private HanoiStack third;
	
	public Q4(int n) {
		this.NumofDisks = n;
		this.first = new HanoiStack(n,"first");
		this.second = new HanoiStack(n,"second");
		this.third = new HanoiStack(n,"third");
		for (int i = n; i > 0; i--) {
			this.first.push(i);
		}
	}
	
	public void start(){
		this.move(first, second, third,this.NumofDisks);
	}

	// recursive
	public void move(HanoiStack start, HanoiStack mid, HanoiStack dest,int rob) {
		// Ending condition, start has no nodes,
		// n=number of robs in start
		// Step 1. Move (n-1)robs in start to mid.
		// Step 2. Move the last rob in start to dest

		if (rob==0) {
			// Ending condition, start has no nodes
			return;
		}
		
		//Step 1.
		this.move(start, dest, mid,rob-1);
		int nth=start.pop();
		dest.push(nth);
		String message=String.format("Move %d from Stack %s to Stack %s", nth,start.name,dest.name);
		System.out.println(message);
		this.move(mid, start, dest, rob-1);
	}

	// display three stacks, just for tests
	public void display() {
		System.out.println("Show first stack");
		while(!first.isEmpty()){
			System.out.print(first.pop()+", ");
		}
		System.out.println("Show second stack");
		while(!second.isEmpty()){
			System.out.print(second.pop()+", ");
		}
		System.out.println("Show third stack");
		while(!third.isEmpty()){
			System.out.print(third.pop()+", ");
		}

	}
}

class HanoiStack {
	private int index;
	private int array[];
	public String name;

	public HanoiStack(int size,String name) {
		this.array = new int[size];
		this.index = 0;
		this.name=name;
	}

	public void push(int value) {
		this.array[index] = value;
		index++;
	}

	public int pop() {
		if (index <= 0)
			return Integer.MAX_VALUE;
		index--;
		return this.array[index];
	}

	public boolean isEmpty() {
		if (this.index <= 0) {
			return true;
		} else {
			return false;
		}
	}

	private boolean checkValid() {
		return false;
	}
}
