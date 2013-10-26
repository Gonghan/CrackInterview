package com.gonghan.chapter1;

public class Q1 {

	// Implement an algorithm to determine if a string has all unique
	// characters.
	// What if you can not use additional data structures?

	public boolean isUnique(String s) {
		for (int i = 0; i < s.length(); i++) {
			char tmp = s.charAt(i);
			for (int j = i + 1; j < s.length(); j++) {
				if (tmp == s.charAt(j)) {
					return false;
				}
			}
		}

		return true;
	}

	public boolean isUnique2(String str) {
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (char_set[ch])
				return false;
		}
		return true;
	}

	// Write code to reverse a C-Style String. (C-String means)

	// Remove duplicate characters;
	// Return new String without duplicate characters
	public char[] removeDuplicateCharacters(char[] str) {
		//
		return str;
	}

	// check whether two strings are anagrams
	public boolean isAnagrams(String a, String b) {

		if (a == null || b == null) {
			return false;
		}
		if (a.isEmpty() || b.isEmpty()) {
			if (a.isEmpty() && b.isEmpty()) {
				return true;
			} else {
				return false;
			}
		}
		if (a.length()!=b.length()){
			return false;
		}
		int l=a.length();
		for(int i=0;i<l;i++){
			if(a.charAt(i)!=b.charAt(l-i-1)){
				return false;
			}
		}
		return true;

	}
}
