package com.core.controlstmt;

public class AmazonQ3 {

	public static void main(String[] args) {
		int start=7;
		int end =1244541;
  int count=0;
		for(Integer i=end; i>start; i--) {
	count++;
			if(count==20) {
				break;
			}
			System.out.println(i);
		}

		
	}
	
	

}


//PSUDO-loop from start to end 
//exit loop when your count reaches 20 iterations