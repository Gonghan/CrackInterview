package com.gonghan.chapter4;

import java.util.ArrayList;

/*
 * Design an algorithm and write code to find the first common ancestor of two nodes
 in a binary tree. Avoid storing additional nodes in a data structure. NOTE: This is not
 necessarily a binary search tree

 */
public class Q5 {
	private Tree tree;

	public Q5(Tree tree) {
		this.tree = tree;
	}

	public TreeNode searchFirstCommonAncestor(TreeNode a, TreeNode b) {
		ArrayList<TreeNode> pathA = searchReturnPath(tree.root, a,
				new ArrayList<TreeNode>());
		ArrayList<TreeNode> pathB = searchReturnPath(tree.root, b,
				new ArrayList<TreeNode>());
		TreeNode tmp=tree.root;
		int i=0;
		while(true){
			if(i>=pathA.size() || i>=pathB.size())
				return null;
			if(pathA.get(i)==pathB.get(i)){
				tmp=pathA.get(i);
			}
			else{
				break;
			}
			i++;
		}

		return tmp;
	}

	private ArrayList<TreeNode> searchReturnPath(TreeNode now, TreeNode dest,
			ArrayList<TreeNode> path) {
		if (now == null) {
			return null;
		}
		path.add(now);
		if(now==dest){
			return path;
		}
		ArrayList<TreeNode> tmp = new ArrayList<TreeNode>();
		tmp=searchReturnPath(now.left,dest,path);
		if(tmp!=null){
			return tmp;
		}
		tmp=searchReturnPath(now.right,dest,path);
		if(tmp!=null){
			return tmp;
		}
		path.remove(now);
		return null;
	}

}
