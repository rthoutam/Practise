package com.core.controlstmt;

public class AmazonQ2 {

	public static void main(String[] args) {
		int start=7;
		int end =1244541;

		for(Integer i=start+1; i<end; i++) {
		String strNumber= i.toString();
			if(strNumber.length()==1) {
				
				System.out.println(strNumber);
				
			}else {
				if(strNumber.substring(0, 1).equals(strNumber.substring(strNumber.length()-1,strNumber.length()) )){
					System.out.println(strNumber);
				}
			}
			
		}

		
	}
	
	

}


//PSUDO-315646547