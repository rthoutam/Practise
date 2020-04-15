package com.core.controlstmt;

public class BooleanExmaple {

	public static void main(String[] args) {
		boolean y = isEven(10);
		System.out.println(y);

	}
	
	private static boolean isEven(int x) {
		if(x%2==0) {
			return true;
		}else {
		
		return false;
		}
		
	}

}


