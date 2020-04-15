package com.core.controlstmt;

public class AmazonQ4 {

	public static void main(String[] args) {
		String input ="100110011";
		
		for(int i =0; i<input.length()-1;i++) {
			if(input.charAt(i) == '1' && input.charAt(i+1) == '1') {
				System.out.println("successive ones exist");
			}
				
	

}
}
}


//PSUDO-loop each index of the given string
//compare index value with next index value when index value is one