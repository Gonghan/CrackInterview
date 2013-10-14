package com.gonghan.chapter3;

/*
 * Implement a MyQueue class which implements a queue using two stacks
 */
public class Q5 {

	private Qstack firstStack;
	private Qstack secondStack;

	public Q5() {
		this.firstStack = new Qstack();
		this.secondStack = new Qstack();
	}

	// add a value at the end of the queue
	public void add(int value) {
		this.firstStack.push(value);
	}

	// pop the first node of the queue
	public int pop() {
		if (!this.secondStack.isEmpty())
			return this.secondStack.pop();
		else {
			while(!this.firstStack.isEmpty()){
				this.secondStack.push(this.firstStack.pop());
			}
			return this.secondStack.pop();
		}
	}
}

class Qstack {
	private int[] array;
	private int SIZE = 100;
	private int index;

	public Qstack() {
		this.array = new int[SIZE];
		this.index = 0;
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
		if (index <= 0) {
			return true;
		}
		return false;
	}
}
