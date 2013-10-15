package com.gonghan.chapter4;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;

public class Q4_test {

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
		root.left=B;
		root.right=C;
		B.left=D;
		B.right=E;
		C.left=F;
		C.right=G;
		Q4 q4=new Q4(tree);
		ArrayList<LinkedList<TreeNode>> array=q4.createLinkedList();
		System.out.println();
	}

}
