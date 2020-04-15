package com.core.controlstmt;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	private static int Array[] = {1,2,3,3,3,3,4,4,4,4,4,5,5,5,5}; 

	public static void main(String[] args) {
		
		Set<Integer> b = duplicates(Array);
		
		System.out.println(b);

	}
	
	private static Set<Integer> duplicates(int Array[]){
		Set<Integer> noDuplicate = new HashSet<Integer>();//Set
		
		for(Integer forDuplicate :  Array) {// datatype var: collection/array
			noDuplicate.add(forDuplicate);
		}
		
		return noDuplicate;
	}

}
