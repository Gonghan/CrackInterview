package com.gonghan.chapter19;

import java.util.HashMap;
import java.util.Map;

/*
 * Design a method to find the frequency of occurrences of any given word in a book.
 */
public class Q8 {

	// any given word, use a map
	// word=>occurrence
	private Map <String,Integer>  map;

	public Q8() {
		map = new HashMap<String,Integer>();
	}
	
	public void run(String givenWord,String[] book){
		for(String word:book){
			word=word.toLowerCase();
			if(word.trim()!=""){
				if(!map.containsKey(word)){
					map.put(word, 1);
				}else{
					map.put(word, map.get(word)+1);
				}
			}
		}
	}
	public int getOccurrence(String word){
		if(map==null || word==null || !map.containsKey(word))
			return 0;
		return map.get(word);
	}
}
