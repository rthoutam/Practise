package com.core.controlstmt;

public class Division {

	public static void main(String[] args) {
		int begin =3;
		int end = 30;
		int remainder=0;
		
		for (int i = begin; i<end; i++) {
			
			if(i%3==remainder && i%5==remainder) {
				System.out.println("i is divisible by 3 and 5 "+ remainder);
			}
		}
	}

}
