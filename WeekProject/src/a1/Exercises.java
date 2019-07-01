package a1;

// TO SUBMIT: cmd shift .    zip the .git file, then u good


import java.util.Arrays;

public class Exercises {
	
	//String and Array Exercises
	/** Returns true if s is the same backwards and forwards */
	public static boolean isPalindrome(String s) {
		assert s != null;
		
		//Recursive method, but ends if there is one character left OR if there are two characters that are the same
		if (s.length() == 1 || (s.length() == 2 && (s.charAt(0) == s.charAt(1)))) {
			return true;
		}
		
		else if (s.charAt(0) != s.charAt(s.length()-1)) {
			return false;
		}
		//Recursive return statement
		return isPalindrome(s.substring(1, s.length()-1));
	}
	
	/** Removes all whitespace and punctuation from a string */
	public static String normalize(String s) {
		assert s != null;
		return s.replaceAll("[\\s\\p{Punct}]","");
	}

	/** Returns the median of the values, if the array is of even length, it returns the higher of the two medians */
	public static int median(int[] values) {
		assert values != null;
		int[] sorted = values;
		Arrays.sort(sorted);
		return sorted[(sorted.length)/ 2];
	}

	/** Returns the number of 0's in values */
	public static int numZeros(int[] values) {
		
		assert values != null;
		int sum = 0;
		for(int r: values) {
			if (r == 0) {
				sum +=1;
			}
		}
		return sum;
	}

	/** Returns the mean of the values */
	public static double mean(int[] values) {
		assert values != null;
		double sum = 0;
		for (int t : values) {
			sum += t;
		}
		double mean = sum / values.length;
		return mean;
	}

	/** Returns true if s is the same backwards and forwards */
	public static boolean hasConstDiagonal(int[][] values) {
		
		assert values != null;
		int len = values.length;
		int ref = values[0][0];
		for (int k = 0; k < values.length; k++) {
			assert values[k].length == len;
			if (values[k][k] != ref) {
				return false;
			}
		}
		return true;

	}

}