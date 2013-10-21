package com.gonghan.chapter5;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q1_test {

	@Test
	public void test() {
		Q1 q=new Q1();
		String s=q.run("10000000000","10101", 2, 6);
		assertEquals("Should be ","10001010100",s);
		assertEquals("","1000110",q.run("1000000","11",1,2));
	}
}
