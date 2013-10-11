package com.gonghan.chapter3;

/*
 * How would you design a stack which, in addition to push and pop, also has a function
 min which returns the minimum element? Push, pop and min should all operate in
 O(1) time

 */
public class Q2 {
	private final int LENGTH = 1000;
	private Node[] array;
	private int index;

	public Q2() {
		array = new Node[LENGTH];
		index = 0;
	}

	public void push(int value) {
		
		if (index == 0) {
			array[index] = new Node(value, value);
		} else {
			
			Node previous=array[index-1];
			if(previous.current_min<value)
				array[index]=new Node(previous.current_min,value);
			else
				array[index]=new Node(value,value);
		}
		index++;
	}

	public int pop() {
		if(index==0){
			//max_value==error
			return Integer.MAX_VALUE;
		}
		else{
			index--;
			return array[index].value;
		}
	}

	public int minimum() {
		if(index==0){
			//max_value==error
			return Integer.MAX_VALUE;
		}
		else{
			return array[index-1].current_min;
		}
	}

}

class Node {
	public Node(int current_min, int value) {
		this.current_min = current_min;
		this.value = value;
	}

	public int current_min;
	public int value;
}
