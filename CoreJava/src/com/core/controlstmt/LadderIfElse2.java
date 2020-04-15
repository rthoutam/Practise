package com.core.controlstmt;

public class LadderIfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int time = 7;
if (time> 12) {
	System.out.println("Just over midnight");
}else if (time >= 1 && time <3) {
	System.out.println("midnignt 2am");
}else if (time>3 && time<5) {
	System.out.println("Early morning");
}else if(time>= 5 && time< 9) {
	System.out.println("Morning");
}else {
	System.out.println("time chusko bey");
}
	
	}

}
