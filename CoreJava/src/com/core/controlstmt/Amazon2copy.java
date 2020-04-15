package com.core.controlstmt;

public class Amazon2copy {

	public static void main(String[] args) {
		int begin = 5;
		int end = 78690;
		
		for(Integer i =begin+1; i<end; i++) {
			String strNum = i.toString();
			if(strNum.length()==1) {
				System.out.println(strNum);
			}else {
				if(strNum.substring(0,1).equals(strNum.substring(strNum.length()-1, strNum.length()))){
					System.out.println(strNum);
				}
			}
		}

	}

}
