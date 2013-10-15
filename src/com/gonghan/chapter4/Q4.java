package com.gonghan.chapter4;

import java.util.ArrayList;
import java.util.LinkedList;

/*
 * Given a binary search tree, design an algorithm which creates a linked list of all the
 nodes at each depth (i.e., if you have a tree with depth D, you’ll have D linked lists).

 */
public class Q4 {

	private Tree tree;

	public Q4(Tree tree) {
		this.tree = tree;
	}

	public ArrayList<LinkedList<TreeNode>> createLinkedList() {
		ArrayList<LinkedList<TreeNode>> ll_array = new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> list = new LinkedList<TreeNode>();
		int current_depth = 0;
		// add depth=0
		list.add(this.tree.root);
		ll_array.add(list);

		while (true) {
			// create a new linkedlist(depth=current_depth) based on the
			// previous one
			LinkedList<TreeNode> newList=null;
			for (int i = 0; i < ll_array.get(current_depth).size(); i++) {
				TreeNode node = ll_array.get(current_depth).get(i);
				 newList= new LinkedList<TreeNode>();
				if (node != null) {
					if (node.left != null) {
						newList.add(node.left);
					}
					if (node.right != null) {
						newList.add(node.right);
					}
				}
			}
			if(newList.size()==0){
				break;
			}else{
				ll_array.add(newList);
				current_depth++;
			}
		}

		return ll_array;

	}
}
