package com.gonghan.chapter3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q1_test {

	@Test
	public void test() {
		Q1 q=new Q1();
		q.push(Q1.FIRST, 1);
		q.push(Q1.SECOND, 11);
		assertEquals("pop",1,q.pop(Q1.FIRST));
		q.push(Q1.FIRST, 2);
		q.push(Q1.THIRD, 111);
		q.push(Q1.FIRST, 3);
		q.push(Q1.SECOND, 22);
		assertEquals("pop",3,q.pop(Q1.FIRST));
		assertEquals("peek",22,q.peek(Q1.SECOND));
		assertEquals("pop",2,q.pop(Q1.FIRST));
		assertEquals("pop",111,q.pop(Q1.THIRD));
		assertEquals("peek",22,q.peek(Q1.SECOND));
		assertEquals("peek",22,q.peek(Q1.SECOND));
		
		
	}

}
