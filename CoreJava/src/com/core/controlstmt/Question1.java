
package com.core.controlstmt;

public class Question1 {
	
	private static String inputStr = "hello my name is rakesh, i am from india.";

	public static void main(String[] args) {
		convertChars(inputStr);

	}
	
	private static String convertChars(String word) {// my-> m->M
		String[] convertWord = word.split("\\s");
		for(String replaceWord: convertWord) {
			//String firstLetter = replaceWord.substring(0, 1).toUpperCase();//M
			String str = Character.toString(replaceWord.charAt(0)).toUpperCase();
			String resultWord = str+ replaceWord.substring(1);//M+y
			System.out.println(resultWord);
		}
		
		return word;
		
	}

}


//split ->arr[]

//loop->each word

// substring and get first letter them make it upper

//add above upper letter to remaing string content

