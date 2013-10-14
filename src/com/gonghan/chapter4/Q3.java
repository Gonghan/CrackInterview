package com.gonghan.chapter4;

/*
 * Given a sorted (increasing order) array, write an algorithm to create a binary tree with
 minimal height

 */
//A. divide into two subarrays and recurse
//B. insert like breath first search
public class Q3 {

	public Tree createTree(int[] array) {
		return new Tree(createNode(array, 0, array.length - 1));
	}

	private TreeNode createNode(int[] array, int start, int end) {
		if(start>end)
			return null;
		TreeNode tmp;
		int mid=(start+end)/2;
		tmp=new TreeNode(array[mid]);
		tmp.left=createNode(array,start,mid-1);
		tmp.right=createNode(array,mid+1,end);
		return tmp;
	}
}
