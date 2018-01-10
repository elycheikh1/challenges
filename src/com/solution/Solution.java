package com.solution;

public class Solution {

	public static String reverse(String word) {
		StringBuilder result = new StringBuilder();
		for (int i = word.length() - 1; i >= 0; i--) {
			result.append(word.charAt(i));
		}
		return result.toString();
	}

	public static boolean isPalindrome(String word) {
		for (int i = word.length() / 2; i < word.length(); i++) {
			if (word.charAt(i) != word.charAt(word.length() - 1 - i))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
// example
		System.out.println(reverse("elycheikh"));
		System.out.println(isPalindrome("aba"));

	}

}
