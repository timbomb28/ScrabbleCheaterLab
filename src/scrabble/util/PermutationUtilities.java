package scrabble.util;

import java.util.Arrays;
import java.util.Set;

public class PermutationUtilities {

	public static String normalize(String word) {
		byte[] b = word.getBytes();
		Arrays.sort(b);
		return new String(b);
	}

	/**
	 * creates a set with all subsets of the input string
	 * 
	 * @param str
	 * @return
	 */
	public static Set<String> getSubSets(String str) {
		return null;
	}

	public static String createPermutation(int length) {
		return null;
	}

	public static String createPermutation(String p) {
		return null;
	}
}
