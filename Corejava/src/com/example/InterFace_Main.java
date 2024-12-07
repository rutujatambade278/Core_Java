package com.example;

public class InterFace_Main {

	 public static void main(String[] args) {
	     // Create instances
	     Employee manager = new Manager();
	     Employee developer = new Developer();

	     // Call methods
	     manager.work();
	     manager.attendMeeting();

	     developer.work();
	     developer.attendMeeting();
	 }
	}
