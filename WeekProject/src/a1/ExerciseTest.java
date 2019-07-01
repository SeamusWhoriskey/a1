package a1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ExerciseTest {
	
	@Test
	void isPalindromeTest() {
		//Palindrome with capital letters
		boolean a = Exercises.isPalindrome("STRAWNOTOSTUPIDAFADIPUTSOOTONWARTS");
		assertEquals(a, true);
		//Non-palindrome
		boolean c = Exercises.isPalindrome("vierughnvoeirugvhneoiugvhneron");
		assertEquals(c,false);
		try {
			Exercises.isPalindrome(null);
	        fail("Expected an error");
	    } catch (AssertionError anError) {
	    	System.out.println("Error: isPalindrome input null");
	    }
	}
	
	@Test
	void normalizeTest() {
		
		String s = Exercises.normalize("a sd. f /g");
		assertEquals(s, "asdfg");
		
	}
	
	@Test
	void medianTest() {
		//Already ordered array
		int[] a = new int[] {1,2,3,4,5};
		assertEquals(Exercises.median(a),3);
		//Non-ordered, even length array
		int[] b = new int[] {3,2,5,4,9,6};
		assertEquals(Exercises.median(b),5);
		try {
			Exercises.median(null);
	        fail("Expected an error");
	    } catch (AssertionError anError) {
	    	System.out.println("Error: median input null");
	    }
	}
	
	@Test
	void numZerostest() {
		//Array with no zero's
		int[] a = new int[] {1,2,3,4,5};
		assertEquals(Exercises.numZeros(a),0);
		//Array with exactly one zero
		int[] b = new int[] {3,2,5,4,9,6,0};
		assertEquals(Exercises.numZeros(b),1);
		//Array with multiple zero's
		int[] c = new int[] {-1,0,-3,0,5,0,0,0,0,10};
		assertEquals(Exercises.numZeros(c),6);
		
		// Catch null error
		try {
			Exercises.numZeros(null);
	        fail("Expected an error");
	    } catch (AssertionError anError) {
	    	System.out.println("Error: numZeros input null");
	    }
	}
	
	
//	Unfixed
//	void meantest() {
//		//Array with whole number mean
//		int[] a = new int[] {1,2,3,4,5};
//		//Array with mean containing infinite decimal places
//		int[] b = new int[] {3,2,5,4,9,6,0};
//		//Array with both positive and negative values
//		int[] c = new int[] {-1,-2,-3,-4,5,6,7,8,9,10};
//		
//		assert Exercises.mean(a) == 3 && Exercises.mean(b) == 29/7 && Exercises.mean(c) == 3.5;	
//	}
//	
//	void hasConstDiagonaltest() {
//		//3x3 identity matrix (Constant diagonal)
//		int[][] a = new int[][] {{1,0,0},{0,1,0},{0,0,1}};
//		//1x1 matrix (Constant diagonal)
//		int[][] b = new int[][] {{1}};
//		//3x3 matrix (Non-constant diagonal)
//		int[][] c = new int[][] {{1,8,-5},{5,10,-2},{11,-2,-8}};
//		
//		assert Exercises.hasConstDiagonal(a) == true && Exercises.hasConstDiagonal(b) == true && Exercises.hasConstDiagonal(c) == false;
//	}
}

		
