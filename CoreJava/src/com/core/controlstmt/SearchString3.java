package com.core.controlstmt;

import java.util.Arrays;
import java.util.List;

public class SearchString3 {
	
	private static List<String> dictornary = (List<String>) Arrays.asList("India", "Rakesh", "Naresh");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean n = keyWords("a");
		System.out.println(n);

	}
	
	private static boolean keyWords(String Paragraphs) {
		
		for(String elements: dictornary) {
			if(elements.toLowerCase().contains(Paragraphs.toLowerCase())) {
				return true;
			}
		}
		return false;
	}

}
//removeDuplicate() should accept array and it sould return array/collection without duplicates
//Remove duplicate elements from array Most of interview writtern programs string/array/collection