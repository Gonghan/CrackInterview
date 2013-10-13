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
	private String singleSpace = " ";
	private String Rod = "@";
	private int step_counter;

	public Q4(int n) {
		this.NumofDisks = n;
		this.step_counter = 1;
		this.first = new HanoiStack(n, "first");
		this.second = new HanoiStack(n, "second");
		this.third = new HanoiStack(n, "third");
		for (int i = n; i > 0; i--) {
			this.first.push(i);
		}
	}

	public void start() {
		this.showLine();
		this.move(first, second, third, this.NumofDisks);
	}

	// recursive
	public void move(HanoiStack start, HanoiStack mid, HanoiStack dest, int rob) {
		// Ending condition, start has no nodes,
		// n=number of robs in start
		// Step 1. Move (n-1)robs in start to mid.
		// Step 2. Move the last rob in start to dest

		if (rob == 0) {
			// Ending condition, start has no nodes
			return;
		}

		// Step 1.
		this.move(start, dest, mid, rob - 1);
		int nth = start.pop();
		dest.push(nth);

		// show step counter
		String results = "Step " + this.step_counter + "\n";
		this.step_counter++;
		results += String.format("Move %d from Stack %s to Stack %s\n", nth,
				start.name, dest.name);

		// ****, start line
		System.out.println(this.showLine());
		System.out.println(results);
		this.display();
		this.move(mid, start, dest, rob - 1);
	}

	// display three stacks, just for tests
	public void display() {
		String results = "";

		for (int i = 1; i <= this.NumofDisks; i++) {
			// add three stacks
			results += this.showRods(first, i);
			results += this.showRods(second, i);
			results += this.showRods(third, i);
			results += "\n";
		}

		System.out.print(results);
	}

	private String showLine() {
		String results = this.longDuplicateString(30, "*");
		return results;
	}

	private String showRods(HanoiStack stack, int line) {
		String results = "";
		int size = stack.getSize();
		int rods = line + size - this.NumofDisks;
		if (rods <= 0) {
			results += this.longDuplicateString(this.NumofDisks,
					this.singleSpace);
		} else {
			int number = stack.peekAt(line + size - this.NumofDisks);
			results += this.longDuplicateString(number, this.Rod);
			results += this.longDuplicateString(this.NumofDisks - number,
					this.singleSpace);
		}
		results += "|";
		return results;

	}

	private String longDuplicateString(int num, String s) {
		String result = "";
		for (int i = 0; i < num; i++) {
			result += s;
		}
		return result;
	}
}

class HanoiStack {
	private int index;
	private int array[];
	public String name;

	public HanoiStack(int size, String name) {
		this.array = new int[size];
		this.index = 0;
		this.name = name;
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

	public int peekAt(int p) {
		return this.array[index - p];
	}

	private boolean checkValid() {
		return false;
	}

	public int getSize() {
		return index;
	}
}
