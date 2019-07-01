package a1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ExerciseTest {
	
	@Test
	void isPalindromeTest() {
		//Palindrome
		assertTrue(Exercises.isPalindrome("RacecaR"));
		//Non-palindrome
		boolean c = Exercises.isPalindrome("not apalindrome");
		assertEquals(c,false);
		// Check for error if null
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
		// Check for error if null
		try {
			Exercises.normalize(null);
	        fail("Expected an error");
	    } catch (AssertionError anError) {
	    	System.out.println("Error: normalize input null");
	    }
		
		
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
	
	@Test
	void meanTest() {
		//Array with whole number mean
		int[] a = new int[] {1,2,3,4,5};
		assertEquals(3,Exercises.mean(a));
		//Array with mean containing infinite decimal places
		int[] b = new int[] {3,2,5,4,9,6,0};
		double d = 29;
		d /= 7;
		assertEquals(d,Exercises.mean(b));
		//Array with both positive and negative values
		int[] c = new int[] {-1,-2,-3,-4,5,6,7,8,9,10};
		assertEquals(3.5,Exercises.mean(c));
		
		// Check for error if null
		try {
			Exercises.mean(null);
	        fail("Expected an error");
	    } catch (AssertionError anError) {
	    	System.out.println("Error: mean input null");
	    }
	}
	
	@Test
	void hasConstDiagonaltest() {
		//3x3 identity matrix (Constant diagonal)
		int[][] a = new int[][] {{1,0,0},{0,1,0},{0,0,1}};
		assertTrue(Exercises.hasConstDiagonal(a));
		//3x3 matrix (Non-constant diagonal)
		int[][] b = new int[][] {{1,8,-5},{5,10,-2},{11,-2,-8}};
		assertFalse(Exercises.hasConstDiagonal(b));
		
		// Check for error if null
		try {
			Exercises.hasConstDiagonal(null);
	        fail("Expected an error");
	    } catch (AssertionError anError) {
	    	System.out.println("Error: hasConstDiagonal input null");
	    }
	}
}

		
