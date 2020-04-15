package com.core.controlstmt;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		// 5 student objects add them collection
		Student s1= new Student("Rakesh", 1);
		Student s2= new Student("Naresh", 2);
		Student s3= new Student("Ramesh", 1);
		Student s4= new Student("Rajesh", 4);
		Student s5= new Student("Ram", 5);
		
		ArrayList<Student> studentList = new ArrayList();
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		studentList.add(s4);
		studentList.add(s5);
		
		//System.out.println(studentList);
		//ArrayList sortStudent = new ArrayList();
		int i=0;
       for(Student sortStudent : studentList) {
    	  i++;
    	  if(i>2) {
    		  break;
    	  }else {
    		  System.out.println(sortStudent);
    	  }
    		  
    	   
       }
		
		
		//Print first two elements of list which contains 5 elements
	}
	
	

}
