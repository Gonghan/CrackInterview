package com.gonghan.chapter19;


/*
 * Write a function to swap a number in place without temporary variables.
 */
public class Q1 {
	private int a,b;
	public Q1(int a,int b){
		this.a=a;
		this.b=b;
	}
	public void swap(){
		a=a+b;
		b=a-b;
		a=a-b;
	}
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
}
