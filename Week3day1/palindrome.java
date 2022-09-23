package Week3day1;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		String original = "madam";
	String reverse = "";
	int length=original.length();
	for (int i= length-1;i>=0;i--) {
		reverse=reverse + original.charAt(i);}
		if (original.equals(reverse)) {
			System.out.println(" is palindrome");}
	else {
		System.out.println("not palindrome");}
			
		
	}
		
		
	}

