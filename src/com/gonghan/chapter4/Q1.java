package com.gonghan.chapter4;

/*
 * Implement a function to check if a tree is balanced. For the purposes of this question,
 a balanced tree is defined to be a tree such that no two leaf nodes differ in distance
 from the root by more than one

 */
public class Q1 {
	public Tree tree;
	public Q1(Tree tree){
		this.tree=tree;
	}
	
	public boolean isBalanced(){
		int MaxDepth=getMaxDepth(tree.root);
		int MinDepth=getMinDepth(tree.root);
		return MaxDepth==MinDepth;
	}
	
	private int getMaxDepth(TreeNode node){
		if(node==null){
			return 0;
		}
		return 1+Math.max(getMaxDepth(node.left), getMaxDepth(node.right));
	}
	
	private int getMinDepth(TreeNode node){
		if(node==null){
			return 0;
		}
		return 1+Math.min(getMinDepth(node.left), getMinDepth(node.right));
	}
	
}
