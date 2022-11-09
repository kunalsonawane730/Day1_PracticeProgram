package com.demo.demo;

public class DemoVariablesMethodsBlocks {
	static int a = 20;     // VARIABLE

    static void display()   // METHOD
    {
        System.out.println("This is my static method");
    }

    static {
        System.out.println("This is my static block");   // BLOCK
    }


	public static void main(String[] args) {
		System.out.println("This is my static variable " + DemoVariablesMethodsBlocks.a);
        DemoVariablesMethodsBlocks.display();

	
	}
}
