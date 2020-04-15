package com.core.controlstmt;

public class IfElseLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int marks = 50;

if(marks<40) {
	System.out.println("Fail");
}
else if(marks>= 55 && marks<60){
	System.out.println("D grade");
}
else if (marks>=60 && marks< 70) {
	System.out.println("C grade");
}
else if (marks>= 70 && marks<80) {
	System.out.println("B grade");
}
else{
	System.out.println("A Grade");
}
	}

}
