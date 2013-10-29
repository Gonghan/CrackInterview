package com.gonghan.chapter19;

/*
 * Write an algorithm which computes the number of trailing zeros in n factorial.
 * 
 */

public class Q3 {
	public int getNumOfZeros(int n){
		int counter=0;
		for(int i=1;i<=n;i++){
			counter+=get5s(i);
		}
		return counter;
	}
	
	//return the number of 5s n has
	//for example, 100=2*2*5*5, so 100 has two 5s.
	private int get5s(int n){
		if(n%5!=0)
			return 0;
		else
			return 1+get5s(n/5);
	}
}
