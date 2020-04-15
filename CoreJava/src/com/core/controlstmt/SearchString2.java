package com.core.controlstmt;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SearchString2 {
	
	private static List<String> textBooks = Arrays.asList("IndiA", "Hyderabad", "Securabad");

	public static void main(String[] args) {
		searchingWord("a");

	}
	
	private static void searchingWord(String searchWord) {
		Optional<String> searchToken = Optional.ofNullable(searchWord);
		if(searchToken.isPresent()) {
			for(String findWord: textBooks) {
				if(findWord.toLowerCase().contains(searchWord.trim().toLowerCase())) {
					System.out.println("thw word is "+findWord);
				}
			}
		}else {
			System.out.println("Null should not be passed");
		}
	}

}
// variable name noun
//mehtod name verb
//NPE- should be considered while writing logic