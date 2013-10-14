package com.gonghan.chapter3;

import java.util.Stack;

/*
 * Write a program to sort a stack in ascending order. You should not make any assump-
 tions about how the stack is implemented. The following are the only functions that
 should be used to write this program: push | pop | peek | isEmpty

 */
public class Q6{
	private java.util.Stack<Integer> stack;
	
	public Q6(java.util.Stack<Integer> stack){
		this.stack=stack;
	}
	
	//As no assumptions about how the stack is implememted. Just use java default stack.
	
	//sort this a stack in ascending order
	public void sort(){
		java.util.Stack<Integer> spare_stack=new java.util.Stack<Integer>();
		while(!this.stack.empty()){
			int current=this.stack.pop();
			while(!spare_stack.empty() && spare_stack.peek()>current){
				this.stack.push(spare_stack.pop());
			}
			spare_stack.push(current);
		}
		while(!spare_stack.empty()){
			this.stack.push(spare_stack.pop());
		}
	}
	
	public void display(){
		System.out.println("=====Display this stack=====");
		java.util.Stack<Integer> tmpstack=(java.util.Stack<Integer>) this.stack.clone();
		while(!tmpstack.empty()){
			int value=tmpstack.pop();
			System.out.print(value+"\n");
		}
		System.out.println();
	}
}
