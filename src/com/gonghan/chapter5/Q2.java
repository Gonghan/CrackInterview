package com.gonghan.chapter5;

public class Q2 {
	/*
	 * Given a (decimal - e.g. 3.72) number that is passed in as a string, print
	 * the binary rep- resentation. If the number can not be represented
	 * accurately in binary, print “ERROR”
	 */
	public String run(String input) {
		String[] parts = input.split("\\.");
		String integer_part = parts[0];
		String decimal_part = parts[1];
		String integer_part_bin = Integer.toBinaryString(Integer
				.parseInt(integer_part));
		String decimal_part_bin = getDecimalPart(decimal_part);
		if (decimal_part_bin == "ERROR")
			return "ERROR";
		return integer_part_bin + "." + decimal_part_bin;
	}

	private String getDecimalPart(String decimal_part) {
		String dec_part_bin = "";
		double dec_part = Double.parseDouble("0." + decimal_part);
		while (dec_part > 0) {
			if(dec_part_bin.length()>32)
				return "ERROR";
			if (dec_part == 1) {
				//dec_part_bin += "1";
				break;
			}
			double tmp = dec_part * 2;
			if (tmp < 1) {
				dec_part_bin += "0";
				
			} else {
				dec_part_bin+="1";
				tmp=tmp-1;
			}
			dec_part = tmp;

		}

		return dec_part_bin;
	}

}
