package com.gonghan.chapter5;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q2_test {

	@Test
	public void test() {
		Q2 q=new Q2();
		assertEquals("integer part:","1.1",q.run("1.5"));
		assertEquals("integer part:","ERROR",q.run("1.51"));
		assertEquals("integer part:","101.011",q.run("5.375"));
	}

}
