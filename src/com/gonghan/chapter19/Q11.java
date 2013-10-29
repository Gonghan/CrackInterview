package com.gonghan.chapter19;

import java.util.HashMap;
import java.util.Map;

/*
 * Design an algorithm to find all pairs of integers within an array which sum to a specified value.
 */

public class Q11 {

	// Create two maps. One for results, another one for temporary use.
	// First, put a value into the map, like '1=>null'
	// Second, when a new value b comes, check whether the map has sum-b
	// Third, if tmp-map has 'sum-b', remove it from tmp-map, and add a new pair
	// into the result_map
	// Constrains: any number in array should be unique
	private Map<Integer,Integer> results_map;
	private Map<Integer,Integer> tmp_map;

	public Q11() {
		this.results_map = new HashMap<Integer,Integer>();
		this.tmp_map = new HashMap<Integer,Integer>();
	}

	public void findAllPairs(int[] array, int sum) {
		for (int i = 0; i < array.length; i++) {
			int tmp = array[i];
			int rest = sum - tmp;
			if (tmp_map.containsKey(rest)) {
				tmp_map.remove(rest);
				if (!results_map.containsKey(tmp)
						&& !results_map.containsKey(tmp))
					results_map.put(tmp, rest);
			}
			else{
				tmp_map.put(tmp, null);
			}
		}
	}
	
	public Map<Integer,Integer> getResult_map(){
		return results_map;
	}

}
