package com.example;

//Define an interface
public interface Employee {
	
	
 void work(); 
 
 void attendMeeting();
 
 
}

//Implement the interface in a Manager class
 class Manager implements Employee {

	  @Override
 public void work() {
     System.out.println("Manager is planning and supervising tasks.");
 }

 @Override
 public void attendMeeting() {
     System.out.println("Manager is attending a strategic meeting.");
 }
}
	 
	 

//Implement the interface in a Developer class
 class Developer implements Employee {
 @Override
 public void work() {
     System.out.println("Developer is writing and debugging code.");
 }

 @Override
 public void attendMeeting() {
     System.out.println("Developer is attending a sprint planning meeting.");
 }
}

