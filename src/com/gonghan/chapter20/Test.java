package com.gonghan.chapter20;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import junit.framework.Assert;

public class Test {

	@org.junit.Test
	public void Q1Test() {
		Q1 q = new Q1();
		Assert.assertEquals(11, q.add_no_arithm(5, 6));
	}

	@org.junit.Test
	public void Q2Test() {
		Q2 q = new Q2();
		ArrayList<Integer> array = q.shuffle();
		for (int i : array) {
			// System.out.println(i);
		}
	}

	@org.junit.Test
	public void Q3Test() {
		Q3 q = new Q3();
		ArrayList<Integer> input = new ArrayList<Integer>();
		Set<Integer> output = new HashSet<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		input.add(6);
		input.add(7);
		input.add(8);
		try {
			output = q.generate(3, input);
			for (int i : output) {
				// System.out.println(i);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@org.junit.Test
	public void Q4Test() {
		Q4 q = new Q4();
		int testNumber[] = { 123,23,199,909,234,89976,989,222222,0 };
		for (int number : testNumber) {
			Assert.assertEquals(q.numOf2s(number),
					q.numOf2S_bad(number));
		}
	}

}
