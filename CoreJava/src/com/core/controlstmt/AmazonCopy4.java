package com.core.controlstmt;

public class AmazonCopy4 {

	public static void main(String[] args) {
		String input ="100110011";
		
		for(int i = 0; i<input.length(); i++) {
			if(input.charAt(i)=='1' && input.charAt(i+1)=='1') {
				System.out.println("Unai");
			}
		}
	}

}
