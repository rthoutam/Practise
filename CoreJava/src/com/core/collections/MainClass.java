package com.core.collections;

import java.util.HashMap;
import java.util.Map;

public class MainClass {

	public static void main(String[] args) {
		
		Student s1 =  new Student(10, "Rakesh", "Hyd");
		
		Student s2 =  new Student(10, "Rakesh", "Hyd");
		
		Student s3 =  new Student(10, "Rakesh", "Hyd");
		Map stdMap = new HashMap<Student, Integer>();
		stdMap.put(s1,1);
		stdMap.put(s2, 2);
		stdMap.put(s3, 3);
		if(stdMap.get(s1)!=null) {
			throw runtime
		}else {
			
		}
		stdMap.put(s1, 1);
System.out.println(stdMap.size());
	
			}

}
