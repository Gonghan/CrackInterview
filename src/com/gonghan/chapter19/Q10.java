package com.gonghan.chapter19;

/*
 * Write a method to generate a random number between 1 and 7, 
 * given a method that generates a random number between 1 and 5 
 * (i.e., implement rand7() using rand5()).
 */
public class Q10 {

	
	//like binary or decimal, just use 5s
	public int rand7(){
		while(true){
			int num=5*(rand5()-1)+rand5();//0-24
			if(num<=21)
				return num%7+1;
		}
	}
	
	public int rand5(){
		return (int)(Math.random()*5)+1;
	}
	
	
}
