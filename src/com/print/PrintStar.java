package com.print;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "welcome to Home Vishal.";
		String addFirst;
		Set<String> set = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		List<String> Comaparearray = new ArrayList<String>();
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
		HashMap<String, Integer> duplicateMap = new HashMap<String, Integer>();

		int count = 1;

		for (int i = 0; i < test.length(); i++) {

			Comaparearray.add(String.valueOf(test.charAt(i)));
		}

		for (int i = 0; i < test.length(); i++) {
			addFirst = String.valueOf(test.charAt(i));
			boolean check = set.contains(addFirst);
			Matcher matcher = pattern.matcher(addFirst);
			count = 1;
			if (check == false && matcher.matches()) {
				for (int j = i + 1; j < test.length(); j++) {
					if (addFirst.equalsIgnoreCase(Comaparearray.get(j))) {
						count = count + 1;
						set.add(addFirst);
					}
				}
				duplicateMap.put(addFirst, count);
			}
		}

		System.out.println(duplicateMap);
		System.out.println(set);
	}

}
