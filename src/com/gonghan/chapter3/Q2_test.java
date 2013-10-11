package com.gonghan.chapter3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q2_test {

	@Test
	public void test() {
		Q2 q=new Q2();
		assertEquals("None element, should return MAX Integer",Integer.MAX_VALUE,q.pop());
		q.push(1);// 1
		assertEquals("Should pop 1", 1,q.pop());//
		q.push(2);// 2
		q.push(3);// 2, 3
		assertEquals("Min should be 2",2,q.minimum());
		q.push(1);// 2, 3, 1
		assertEquals("Min should be 1",1,q.minimum());
		q.push(3);// 2, 3, 1, 3
		assertEquals("Should pop 3", 3,q.pop());// 2, 3, 1
		assertEquals("Should pop 1", 1,q.pop());// 2, 3
		q.push(3);// 2, 3, 3
		assertEquals("Min should be 2",2,q.minimum());
		
	}

}
