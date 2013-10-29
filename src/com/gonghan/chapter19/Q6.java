package com.gonghan.chapter19;

/*
 * Given an integer between 0 and 999,999, print an English phrase that describes the integer 
 * (eg, “One Thousand, Two Hundred and Thirty Four”).
 */
public class Q6 {
	private String[] digits = { "Zero", "One", "Two", "Three", "Four", "Five",
			"Six", "Seven", "Eight", "Nine" };
	private String[] digits2 = { "And", "", "Twenty", "Thirty", "Fourty",
			"Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
	private String[] digits3 = { "Ten", "Eleven", "Twelve", "Thirteen",
			"Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };

	public String getPhrase(int n) {
		if(n==0){
			return "Zero";
		}
		// convert into two xxx
		int first = n % 1000;
		int second = (n - n % 1000) / 1000;
		String result="";
		if (second!=0){
			result = convertXXX(second)+ " Thousand";
			if(first!=0){
				result+=" ";
			}
		}
		 result+=convertXXX(first);
		return result;
	}

	// n is from 0 to 999
	private String convertXXX(int n) {
		if(n==0)
			return "";
		int first = n % 10;
		int second = ((n - first) /10)%10;
		int third = ((n - 10 * second - first) / 100)%10;
		String result = "";
		if (third != 0) {
			result += getWord1(third);
			result += " Hundred and ";
		}
		if (second != 0) {
			if (second > 1) {
				result += getWord2(second);
			}

			if (second == 1) {
				result += getWord3(first);
				return result;
			}
		}
		if (first != 0) {
			if(second!=0){
				result+="-";
			}
			result+=getWord1(first);
		}

		return result;
	}

	// i is from 0 to 9
	private String getWord1(int i) {
		return digits[i];
	}

	// i=20,30,...90
	private String getWord2(int i) {
		return digits2[i];
	}

	// i=10,11,12,13,..,19
	private String getWord3(int i) {
		return digits3[i];
	}
}
