package com.gonghan.chapter19;

import static org.junit.Assert.*;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;

import junit.framework.Assert;

public class Test {

	@org.junit.Test
	public void testQ1() {
		Q1 q = new Q1(5, 9);
		q.swap();
		assertEquals("a should be 9", 9, q.getA());
		assertEquals("b should be 5", 5, q.getB());
	}

	@org.junit.Test
	public void testQ2() {
		Q2 q = new Q2();
		q.check();
	}

	@org.junit.Test
	public void testQ3() throws Exception {
		Q3 q = new Q3();
		Assert.assertEquals(4, q.getNumOfZeros(20));
		Assert.assertEquals(7, q.getNumOfZeros(30));
		Assert.assertEquals(24, q.getNumOfZeros(104));
	}

	@org.junit.Test
	public void testQ4() {
		Q4 q = new Q4();
		Assert.assertEquals(12, q.findMax(5, 12));
		Assert.assertEquals(5, q.findMax(5, -2));
		Assert.assertEquals(12, q.findMax(-12, 12));
		// Assert.assertEquals(12,q.findMax(Integer.MIN_VALUE, 12));
		// Assert.assertEquals(Integer.MAX_VALUE,q.findMax(Integer.MAX_VALUE,
		// 12));
		Assert.assertEquals(12, q.findMax(12, 12));
		Assert.assertEquals(0, q.findMax(0, 0));
	}

	@org.junit.Test
	public void testQ5() {
		Q5 q = new Q5();
		Result r = null;
		r = q.guess("RGGG", "RRRR");
		Assert.assertEquals(1, r.getHits());
		Assert.assertEquals(0, r.getPseudo_hits());

		r = q.guess("RGYG", "RRGR");
		Assert.assertEquals(1, r.getHits());
		Assert.assertEquals(1, r.getPseudo_hits());

		r = q.guess("RYYG", "RGYY");
		Assert.assertEquals(2, r.getHits());
		Assert.assertEquals(2, r.getPseudo_hits());

		r = q.guess("RYYG", "YGRY");
		Assert.assertEquals(0, r.getHits());
		Assert.assertEquals(4, r.getPseudo_hits());
	}

	@org.junit.Test
	public void testQ6() {
		Q6 q = new Q6();
		Assert.assertEquals("Zero", q.getPhrase(0));
		Assert.assertEquals("One", q.getPhrase(1));
		Assert.assertEquals("Twelve", q.getPhrase(12));
		Assert.assertEquals("Ten", q.getPhrase(10));
		Assert.assertEquals("Twenty", q.getPhrase(20));
		Assert.assertEquals("Fifty-Five", q.getPhrase(55));
		Assert.assertEquals("Two Hundred and Fifty", q.getPhrase(250));
		Assert.assertEquals("One Thousand", q.getPhrase(1000));
		Assert.assertEquals(
				"Nine Hundred and Ninety-Nine Thousand Nine Hundred and Ninety-Nine",
				q.getPhrase(999999));
		// Assert.assertEquals("Nine hundred ninety-nine thousand nine and nine hundred and ninty-nine",
		// 999999);
		// Assert.assertEquals("Nine hundred and nine thousand and ninety",
		// 909090);

	}

	@org.junit.Test
	public void testQ7() {
		Q7 q = new Q7();
		Assert.assertEquals(5,
				q.getLargestSequence(new int[] { 1, -2, 3, -4, 5 }));
		Assert.assertEquals(5,
				q.getLargestSequence(new int[] { 2, -8, 3, -2, 4, -10 }));
	}

	@org.junit.Test
	public void testQ10() {
		Q10 q = new Q10();
		int sum=0;
		for(int i=0;i<100000;i++){
			sum+=q.rand7();
			
		}
		System.out.println(sum);

	}

	@org.junit.Test
	public void testQ11() {
		Q11 q=new Q11();
		int []array=new int[20];
		for(int i=0;i<20;i++){
			array[i]=i*3;
		}
		q.findAllPairs(array, 54);
		Map<Integer,Integer> m=q.getResult_map();
		for(int k:m.keySet()){
			int value=m.get(k);
			System.out.println("Pair: "+k+" , "+value);
		}
	}
}
