package com.core.controlstmt;

public class AmazonQ1 {

	public static void main(String[] args) {
		


int intArray[]= {2,4,6,8,9};
int inputSum = 25;
int count =0;
for(int i=0; i<intArray.length; i++) {
	for(int j= i+1; j<intArray.length; j++) {
		if(intArray[i]+intArray[j]<inputSum) {
			System.out.println(intArray[i]+ " "+ intArray[j]);
			count++;
		}
	}
}
System.out.println("Count of total pairs : "+count);
}}

