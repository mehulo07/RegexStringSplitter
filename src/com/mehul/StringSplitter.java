package com.mehul;

import java.util.LinkedHashSet;

public class StringSplitter {

	public static void main(String[] args) {

		String issue = "\"Makwana\", Mohanbhai MM Surti and Johan pujari ; okSemicolon / test";
		LinkedHashSet<String> allPossibleBreakuot = new LinkedHashSet();
		String[] brek = issue.split("[\"]|,|and|;|/");
		for (int i = 0; i < brek.length; i++) {
			if (!brek[i].equals("")) {
				allPossibleBreakuot.add(brek[i].trim());
			}
		}

		allPossibleBreakuot.forEach(finalString -> {
			System.out.println(finalString);
		});

	}

}
