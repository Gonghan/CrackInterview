package testChapter1;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import chapter1.Q1;

public class TestQ1 {

	@Test
	public void test() {
		Q1 test = new Q1();
		assertEquals("abcd should be unique", true, test.isUnique("abcd"));
		assertEquals("abcded should not be unique", false,
				test.isUnique("abcded"));

		assertEquals("abcd should be unique", true, test.isUnique("abcd"));
		assertEquals("abcded should not be unique", false,
				test.isUnique("abcded"));
		assertEquals("In Chinese, 我是好人 should be unique", true,
				test.isUnique("我是好人"));
		assertEquals("In Chinese, 我是好是人 should be unique", false,
				test.isUnique("我是好是人"));
		
		//either is null, return false
		assertFalse("Either string is null, should return false",test.isAnagrams(null, null));
		//both empty, return true
		assertTrue("Both empty, should return true",test.isAnagrams("", ""));
		//one empty, the other not, return false
		assertFalse("One empty and the other not, should return false",test.isAnagrams("", "ABC"));
		//different length, return false
		assertFalse("Different length, should return false",test.isAnagrams("A", "BA"));
		//ABC and CBA
		assertTrue("ABC and CBA, should return true",test.isAnagrams("ABC", "CBA"));
	}

}
