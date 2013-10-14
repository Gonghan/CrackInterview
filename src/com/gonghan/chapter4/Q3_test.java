package com.gonghan.chapter4;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q3_test {

	@Test
	public void test() {
		int array[]=new int[]{1,2,3,4,5,6,7,8};
		Q3 q3=new Q3();
		Tree tree=q3.createTree(array);
		System.out.println();
	}

}
