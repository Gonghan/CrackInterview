package com.gonghan.chapter4;

import static org.junit.Assert.*;

import org.junit.Test;

public class Q5_test {

	@Test
	public void test() {
		Tree tree=new Tree("A");
		TreeNode root=tree.root;
		TreeNode B=new TreeNode("B");
		TreeNode C=new TreeNode("C");
		TreeNode D=new TreeNode("D");
		TreeNode E=new TreeNode("E");
		TreeNode F=new TreeNode("F");
		TreeNode G=new TreeNode("G");
		TreeNode H=new TreeNode("H");
		TreeNode I=new TreeNode("I");
		root.left=B;
		root.right=C;
		B.left=D;
		B.right=E;
		C.left=F;
		C.right=G;
		D.left=H;
		E.right=I;
		Q5 q5=new Q5(tree);
		TreeNode node=q5.searchFirstCommonAncestor(I, D);
		assertEquals("should be B","B",node.name);
	}

}
