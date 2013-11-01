package com.gonghan.chapter20;

/*
 * Write a method to count the number of 2s between 0 and n.
 */
public class Q4 {

	// Two cases:
	// Top digit is 2; return 10^?+(Top digit -1)*numOf2s(new number)
	// Top digit is not 2; return (Top digit -1)*numOf2s(new number)
	// Here new number is got from the original one with top digit removed.
	// Like 1234=>234
	public int numOf2s(int n) {
		// Ending condition:
		if (n == 0) {
			return 0;
		}
		// get the top digit
		int top = new Integer(n).toString().toCharArray()[0] - '0';
		int numOfDigits = new Integer(n).toString().length();// String.getLength()???
		int next = n - top * (int) Math.pow(10, numOfDigits - 1);
		int nines=(int)Math.pow(10,numOfDigits-1)-1;
		
		//F(X235)=>
		//if x==1, return F(235)+F(999)
		//if x==2, return 235+1+F(999)*2
		//if x==3~9, return F(235)+1000+F(999)*(x-1)
		if(top==1){
			return numOf2s(next)+numOf2s(nines);
		}
		if(top==2){
			return next+1+2*numOf2s(nines);
		}
		else{
			return numOf2s(next)+nines+1+numOf2s(nines)*(top-1);
		}
	}

	// this is only for test,
	// Constrains: i>0;
	private boolean have2(int i) {
		String str = Integer.toString(i);
		if (str.contains("2"))
			return true;
		return false;
	}

	// This is only for test
	public int numOf2S_bad(int n) {
		int number = 0;
		for (int i = 0; i <= n; i++) {
			if (have2(i)) {
				//System.out.println(i);
				number++;
			}
		}
		return number;
	}
}
