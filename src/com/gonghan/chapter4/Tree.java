package com.gonghan.chapter4;

public class Tree {
	public TreeNode root;
	public Tree(String root){
		this.root=new TreeNode(root);
	}
	public Tree(TreeNode root){
		this.root=root;
	}
}

class TreeNode{
	public String name;
	public int value;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(String name){
		this.name=name;
		this.left=null;
		this.right=null;
	}
	
	public TreeNode(int value){
		this.value=value;
		this.left=null;
		this.right=null;
	}
}
