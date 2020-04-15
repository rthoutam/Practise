package com.core.controlstmt;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates2 {
	
	private static int inputNumber [] = {0,0,0,2,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5};

	public static void main(String[] args) {
		Set<Integer> atualElement = removeDuplicate(inputNumber);
		System.out.println(atualElement);

	}
	
private static Set<Integer> removeDuplicate(int inputNumber[]){
	Set<Integer> noDuplicateElement = new HashSet<Integer>();
	
	for(int duplicateElement: inputNumber) {
		noDuplicateElement.add(duplicateElement);
	}
	return noDuplicateElement;
}

}
// Declararion of Array[]
//creation of object to interface is not possible.
//Set is example of Interface.
//Using implmentation class we will be creating a object.
//for each Syntax for an Array.  dataType var: collection
//In generic no primitive data types can be used.

//