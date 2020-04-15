package com.core.controlstmt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchString {
	static List<String> dictonary = Arrays.asList("foo", "bAr", "baz","arjun","a");

	public static void main(String[] args) {
		
      List<String> resultList = contains(" A ");
      System.out.println(resultList);
     
      int a=10; 
      int b = m1();
     
      resultList.size();
	}
	
	private static int m1() {
		return 10;
	}
	
	
	private static List<String> contains(String searchToken) {
		List<String> Pages = new ArrayList<String>();
		for(String word:dictonary) {
			if((word.toLowerCase().contains(searchToken.trim().toLowerCase()))) {
				//System.out.println("the word is " +word);
				Pages.add(word);
			}
			// System.out.println(Pages);
		}return Pages;
		
	}

}
//1-method signature
//2- scope or access specifier
//Naming conventions
//for each syntax
//NPE check
// your method should return words that contains search String

//variable can be initialized with direct value or a method that in return value with same datatype