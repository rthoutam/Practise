package com.core.controlstmt;

public class Loops {

	public static void main(String[] args) {
		for(int i=1; i<=6; i++) {
			for(int j =1; j<i; j++) {
				System.out.print(j);
			}
			for(int k=6; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i= 6; i>=1; i--) {
			for(int j=1; j<i; j++) {
				System.out.print(j);
			}
			for(int k=6; k>=i; k--) {
				System.out.print("&");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("@");
		for(int i = 5; i>=1; i--) {
			System.out.print("@");
			for(int j= 5; j>i; j--) {
				System.out.print(" ");
			}
			System.out.println("@");
		}
		for(int k =5; k>0; k--) {
			System.out.print("@ ");
		}
		System.out.println();
		
		for(int a=1, b=10, c=21, d=30; a<=10; a++, b--, c++, d--) {
			System.out.println(a+ " " + b + " "+ c +" " +d + " " );
		}
	}

}
