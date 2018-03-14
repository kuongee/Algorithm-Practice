/* 
 * File name: Palindrome.java
 * Written by: Jeesoo Min
 * Date: Mar 14, 2018
 * Verify the word is palindrome, or not.
 * I implemented in iteration way and recursion way.
 * */

import java.util.Scanner;

public class Palindrome {
	static boolean findPalindrome(String word) {
		int len = word.length();
		if(len == 0 || len == 1)
			return true;
		
		boolean check = findPalindrome(word.substring(1, len-1));
		
		if(word.charAt(0) == word.charAt(len-1))
			return true & check;
		else
			return false & check;
	}
	
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		int len = word.length();
		boolean check = true;
		
		if(len == 1)
			check = true;
		else {
			for(int i=0; i<len/2; i++) {
				if(word.charAt(i) != word.charAt(len - 1 - i)) {
					check = false;
					break;
				}
			}	
		}
		
		System.out.println("For iteration: " + check);
		System.out.println("Recursive :" + findPalindrome(word));
	}
}
