package com.core.controlstmt;

public class Question2 {
	
	private static String inputStr = "Hello My Name is Rakesh, I am from India";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int wordCount = countOfWords(inputStr);
System.out.println(wordCount);
	}
	
	private static int countOfWords(String str) {
		// String ResultStr;
		
		int count =0;
		String wordString[] = str.split("\\s");
		
		for(String countWord: wordString) {
			//count =0;
			if(countWord.length()>3) {
			 count++;
			}
		}
		return count;
		
		
		
	}
	// return ResultStr;

}
