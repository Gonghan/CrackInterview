package com.gonghan.chapter5;

public class Q1 {
	
	public String run(String N,String M,int i,int j){
		
		int N_length=N.length();
		char [] N_char_array=N.toCharArray();
		int M_length=M.length();
		char [] M_char_array=M.toCharArray();
		
		for(int index=0;index<=j-i;index++){
			N_char_array[N_length-i-1-index]=M_char_array[M_length-index-1];
		}
		String str=String.valueOf(N_char_array);
		return str;
	}
}
