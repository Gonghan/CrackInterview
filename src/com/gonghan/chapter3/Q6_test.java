package com.gonghan.chapter3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q6_test {

	@Test
	public void test() {
		java.util.Stack<Integer> stack=new java.util.Stack<Integer>();
		stack.push(1);
		stack.push(3);
		stack.push(2);
		stack.push(5);
		stack.push(4);
		
		Q6 q6=new Q6(stack);
		q6.sort();
		q6.display();
	}

}
