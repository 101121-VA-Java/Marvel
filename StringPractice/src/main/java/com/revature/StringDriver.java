package com.revature;

import java.util.Scanner;

public class StringDriver {
	
	public static void main(String[] args) {
		Scanner newObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter a string");
		String s = newObj.nextLine();
		
		removeEveryOtherLetter(s);
	}
	
	/*
	 * Using StringBuilder and its associated methods (if needed), 
	 * create a method that removes every other letter of a String passed in 
	 * and return that newly created string.
	 */
	public static StringBuilder removeEveryOtherLetter(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s.length(); i+=2) {
		 sb.append(s.charAt(i));		
		 }
		System.out.println(sb);
		
		return sb;
	}

	/*
	 * Given the string of a url of the format localhost:3500/[controller]/[resource]
	 * where "localhost:3500" is a constant
	 * controller and resource can be any 1 word
	 * return the value of controller as a string
	 */
	public String getControllerValue(String url) {
		return null;
	}

	
}