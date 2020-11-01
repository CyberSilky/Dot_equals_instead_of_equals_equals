package com.company;

public class Main {


//USE THE method.equals() instead of ==


    public static void main(String[] args) {
	// write your code here
        String literal = "hello";
        String obj = new String("hello");
        String otherLiteral = "hello";
        String otherObj = new String("hello");

        // literal references ---> the string "hello"
        // otherLiteral also references ---> the string "hello"
        // obj references ---> a completely separate string named "hello" object is part of the java.util class
        // otherObj is referencing ---> a completely different version of hello

        System.out.println(literal == obj); //this returns false because they are referencing two different hellos
        System.out.println(literal == otherLiteral); //these two are referencing the same thing
        System.out.println(literal.equals(obj)); //
        System.out.println(literal.equals(otherLiteral));

        System.out.println(); //giving some space

        System.out.println(obj == otherObj); // returns false because they are referencing different obj objects
        System.out.println(obj.equals(otherObj)); // returns true because the core values are the same

        //the .equals instance references the true value and not the pointers
    }
}
