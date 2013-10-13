package com.gonghan.chapter3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q3_test {

	@Test
	public void testStack() {
		Q3 q3 = new Q3();
		int stack_size = 5;
		Stack s = new Stack(5);
		assertEquals("pop should return integer max, error", Integer.MAX_VALUE,
				s.pop());
		assertTrue("empty", s.isEmpty());
		s.push(1);// 1
		assertFalse("empty", s.isEmpty());
		s.push(2);// 1,2
		assertEquals("pop should return 2", 2, s.pop());// 1
		s.push(3);// 1,3
		s.push(4);// 1,3,4
		s.push(5);// 1,3,4,5
		s.push(6);// 1,3,4,5,6
		s.push(7);// 1,3,4,5,6,do nothing because size is only 5
		assertEquals("pop shoud return the fifth node", 6, s.pop());
	}

	@Test
	public void testSetOfStack() {
		Q3 q3 = new Q3();
		assertEquals("no nodes should return error", Integer.MAX_VALUE,
				q3.pop());
		q3.push(1);// {1}
		assertEquals("pop should return 1", 1, q3.pop());// {}
		assertEquals("no nodes should return error", Integer.MAX_VALUE,
				q3.pop());// {}
		q3.push(2);// {2}
		q3.push(3);// {2,3}
		q3.push(4);// {2,3,4}
		q3.push(5);// {2,3,4,5}
		assertEquals("pop should return 5", 5, q3.pop());// {2,3,4}
		q3.push(6);// {2,3,4,6}
		q3.push(7);// {2,3,4,6}
		q3.push(8);// {2,3,4,6,8}
		q3.push(9);// {2,3,4,6,8},{9}
		q3.push(10);// {2,3,4,6,8},{9,10}
		assertEquals("pop should return 10", 10, q3.pop());//{2,3,4,6,8},{9}
		assertEquals("pop should return 9", 9, q3.pop());//{2,3,4,6,8}
		q3.push(11);//{2,3,4,6,8},{11}
		assertEquals("pop should return 11", 11, q3.pop());//{2,3,4,6,8}
	}
}
