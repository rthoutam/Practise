package com.core.controlstmt;

public class IfElseLadder2 {

	public static void main(String[] args) {
		int marks = 40;
		if(marks< 40) {
			System.out.println("Fail");
		}else if (marks >= 40 && marks< 50) {
			System.out.println("D grade");
		}else if (marks >=50 && marks< 60) {
			System.out.println("C grade");
		}else {
			System.out.println("ado okati chusuko bey");
		}

	}

}
