package com.print;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String test = "welcome to Capgemini India";
		String addFirst;

		Set<String> set = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		List<String> Comaparearray = new ArrayList<String>();

		HashMap<String, Integer> duplicateMap = new HashMap<String, Integer>();

		int count = 1;

		for (int i = 0; i < test.length(); i++) {

			Comaparearray.add(String.valueOf(test.charAt(i)));
		}

		for (int i = 0; i < test.length(); i++) {
			addFirst = String.valueOf(test.charAt(i));
			boolean check = set.contains(addFirst);
			count = 1;
			if (check == false) {
				for (int j = i + 1; j < test.length(); j++) {
					if (addFirst.equalsIgnoreCase(Comaparearray.get(j))) {
						count = count + 1;
						if (!set.contains(addFirst) && !addFirst.trim().equalsIgnoreCase("")) {
							set.add(addFirst);
						}
					}
				}
				if (addFirst.trim().equalsIgnoreCase("")) {

				} else {
					duplicateMap.put(addFirst, count);
				}
			}
		}

		System.out.println(duplicateMap);
		System.out.println(set);
	}

}
