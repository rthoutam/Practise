package com.core.controlstmt;

public class CopyOfQuestion1 {
	
	private static String inputStr = "i am rakEsh, i am fROm india";

	public static void main(String[] args) {
		
      String lastWord = convertStatement(inputStr);
      
      System.out.println(lastWord);
	}
	
	private static String convertStatement(String word) {
		String resultStr="";
		String methodStr[] = word.split("\\s");
		for(String readWord: methodStr) {
		  String firstLetter = readWord.substring(0, 1).toUpperCase();
		  String resultWord = firstLetter+readWord.substring(1).toLowerCase();
		  resultStr = resultStr+" "+resultWord;
		}
		
		
		return resultStr;
	}

}


//