package com.gonghan.chapter4;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q1_test {

	
	@Test
	public void test(){
		Tree tree=new Tree("A");
		TreeNode root=tree.root;
		TreeNode B=new TreeNode("B");
		TreeNode C=new TreeNode("C");
		TreeNode D=new TreeNode("D");
		TreeNode E=new TreeNode("E");
		TreeNode F=new TreeNode("F");
		TreeNode G=new TreeNode("G");
		root.left=B;
		root.right=C;
		B.left=D;
		B.right=E;
		C.left=F;
		C.right=G;
		
		Q1 q1=new Q1(tree);
		assertTrue("should be balanced",q1.isBalanced());
		
	}
}
