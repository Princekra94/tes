package com.Interview.test;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementsArray {

	public static void main(String[] args) {

		String names[] = {"Java", "c", "c++", "c", "Java"};
		
	//Using for loop
		
		
		
		  for (int i = 0; i < names.length; i++) {
		  
		  for (int j = i+1; j < names.length; j++) { if (names[i].equals(names[j])) {
		  
		  System.out.println("Duplicate Elements is : "+names[i]);
		  
		  }
		  
		  }
		  
		  }
		 
		 
		
		
 //Using set
		
//		Set< String > store = new HashSet<String>() ;
//		for(String name : names) {
//			if (store.add(name)==false) {
//				System.out.println("Duplicate Elements is : "+name);
//			}
//		}
		
	}

}
