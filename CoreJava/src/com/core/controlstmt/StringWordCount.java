package com.core.controlstmt;

public class StringWordCount {
	
	private static String letter = null;//"My name is Rakesh, I am from India"

	public static void main(String[] args) {
		
		int countWords = countLetters(letter);
		
		System.out.println(countWords);

	}
	
	private static int countLetters(String input) {
		
		if(input!=null) {
		
		String[] character = input.split("\\s");
		
		return character.length;
		}else {
		return 0;
	}
  }
}

//write a method to accept string and return word count

// when call occures you need to look at what it returns then only you can assigne that method call to a variable.