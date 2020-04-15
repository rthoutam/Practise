package com.core.controlstmt;

import java.util.Scanner;

public class whileTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*int i =0, small =0, large=0;
		
		System.out.print("Num 1:");
		
		int a = sc.nextInt();
		small = a; 
		large = a;
		
		while(i<10) {
			System.out.println("num" +i+ ":");
			int b= sc.nextInt();
			if(b < small) {
				small =b;
			}
			if(b > large ) {
				large = b;
			}
			i++;
		}
		System.out.println("Large"+ large + "Small"+small);*/
		
		/*System.out.print("Base: ");
		int b = sc.nextInt();
		System.out.print("Exp: ");
		int e = sc.nextInt();
		int result =1, i=1;
		
		do {
			result = result*b;
			i++;
			
		}while(i<e);
		System.out.print(result);*/
		
		/*int even=0, odd=1;
		
		for(int i =1; i<=20; i++) {
			if(i%2>0) {
			odd =odd*i;
			}
		}
        for(int i=2; i<=100; i+=2) {
	       even = even+i;
}
        System.out.println("Even" +" " +even+" "+"odd"+" "+odd);*/
		
		for(int i=6; i>=1; i--) {
			for(int j=1; j<i; j++) {
			
			System.out.print(" ");
			}
			for(int k =6; k>=i; k--) {
				System.out.print("$");
			}
			for(int k =6; k>=i; k--) {
				System.out.print("$");
			}
			System.out.println();
		}

	}

}
