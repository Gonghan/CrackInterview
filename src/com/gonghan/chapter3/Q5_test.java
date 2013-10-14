package com.gonghan.chapter3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q5_test {

	@Test
	public void test() {
		Q5 q5=new Q5();
		q5.add(1);
		q5.add(2);
		assertEquals("pop 1",1,q5.pop());
		q5.add(3);
		q5.add(4);
		assertEquals("pop 2",2,q5.pop());
		q5.add(5);
		assertEquals("pop 3",3,q5.pop());
		assertEquals("pop 4",4,q5.pop());
		assertEquals("pop 5",5,q5.pop());
		
	}

}
