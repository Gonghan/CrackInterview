package com.gonghan.chapter3;

import java.util.ArrayList;

/*
 * Imagine a (literal) stack of plates. If the stack gets too high, it might topple. There-
 fore, in real life, we would likely start a new stack when the previous stack exceeds
 some threshold. Implement a data structure SetOfStacks that mimics this. SetOf-
 Stacks should be composed of several stacks, and should create a new stack once
 the previous one exceeds capacity. SetOfStacks.push() and SetOfStacks.pop() should
 behave identically to a single stack (that is, pop() should return the same values as it
 would if there were just a single stack).
 FOLLOW UP
 Implement a function popAt(int index) which performs a pop operation on a specific
 sub-stack

 */

//This is the SetofStacks class
//Q3=SetofStacks
public class Q3 {
	// the size of each stack
	private final int SIZE = 5;
	// array of stacks
	private ArrayList<Stack> setOfStacks;
	// index of the current substack
	private int substack_index;

	public Q3() {
		this.setOfStacks = new ArrayList<Stack>();
		this.substack_index = 0;
	}

	// pop a specific value int a sub-stack
	public int popAt(int index) {
		return 0;
	}

	// push a value into the set of stacks
	// A. a substack has a space
	// B. a substack is full, create a new substack in the setOfStacks
	// C. the setofStacks is empty, create a new substack
	public void push(int value) {

		if (this.setOfStacks.isEmpty()) {
			// Condition C
			Stack s = new Stack(this.SIZE);
			s.push(value);
			this.setOfStacks.add(s);
			return;
		}
		Stack current_substack = this.setOfStacks.get(this.substack_index);

		if (current_substack.isFull()) {
			// Condition B
			Stack s = new Stack(this.SIZE);
			s.push(value);
			this.setOfStacks.add(s);
			this.substack_index++;
			return;
		} else {
			current_substack.push(value);
		}
	}

	// works like in a real single stack
	// A. empty setofstack, return Integer.MAX or throw an exception
	// B. the current substack has at least one node, return do like in a single
	// stack
	// C. the current substack has no node, return substack_index-1 and get the last one of the previous substack
	// to the last node of the previous stack
	// D. only one node in the whole setofstack
	public int pop() {
		if (this.setOfStacks.isEmpty()) {
			// Condition A
			return Integer.MAX_VALUE;
		}
		Stack current_substack = this.setOfStacks.get(this.substack_index);
		int value =0;
		if (current_substack.isEmpty()) {
			if(this.substack_index==0){
				//Condition D
				return Integer.MAX_VALUE;
			}
			this.substack_index--;
			current_substack=this.setOfStacks.get(this.substack_index);
			return current_substack.pop();
			
		} else {
			//Condition B
			return current_substack.pop();
		}
	}

}

class Stack {
	private int size;
	private int[] array;
	private int index;

	public Stack(int size) {
		// init
		this.size = size;
		this.array = new int[this.size];
		this.index = 0;
	}

	public void push(int value) {
		if (isFull()) {
			// full and do nothing
			return;
		}
		array[index] = value;
		index++;
	}

	public int popAt(int index){
		if(index<=0)
			//error
			return Integer.MAX_VALUE;
		return array[index];
	}
	
	public int pop() {
		if (index == 0) {
			// error, the stack is empty
			return Integer.MAX_VALUE;
		}
		int value = array[index - 1];
		index--;
		return value;
	}

	public boolean isEmpty() {
		if (index <= 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		if (index >= size) {
			return true;
		} else
			return false;
	}
}
