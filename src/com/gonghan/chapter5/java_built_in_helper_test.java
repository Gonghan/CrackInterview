package com.gonghan.chapter5;

public class java_built_in_helper_test {
	
	public void Integer_functions(){
		Integer i=new Integer(6);//bin:101
		System.out.println("Integer i="+i.toString());
		int bit_count=Integer.bitCount(i);
		System.out.println("i bit count="+bit_count);
		int leadingZeros=Integer.numberOfLeadingZeros(i);
		System.out.println("i leading zeros="+leadingZeros);
		int trailingsZeros=Integer.numberOfTrailingZeros(i);
		System.out.println("i trailing zeros="+trailingsZeros);
		int reverse=Integer.reverse(i);
		System.out.println("i reverse="+reverse);
		int anti_reverse=Integer.reverse(-1610612736);
		System.out.println("i anti reverse="+anti_reverse);
		int reverseByte=Integer.reverseBytes(i);
		System.out.println("i reverse bytes="+reverseByte);
		String bin=Integer.toBinaryString(i);
		System.out.println("i binary string="+bin);
		
	}
	public static void main(String args[]){
		java_built_in_helper_test obj=new java_built_in_helper_test();
		obj.Integer_functions();
	}
}
