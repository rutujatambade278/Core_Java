package com.example;

public class MainclassAnimal {

	   public static void main(String[] args) {
	      
	        Animal myAnimal = new Dog(); // Dog object, reference type is Animal
	        myAnimal.sound(); // Calls Dog's sound method
	        
       Animal anotherAnimal = new Cat(); 
	        anotherAnimal.sound(); 
	    }
	}
