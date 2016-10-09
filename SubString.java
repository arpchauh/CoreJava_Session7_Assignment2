package com.acadgild.java.session7;

public class SubString {

	public static void main(String[] args) {
		
		String s = "Welcome to Acadgild";

		//System.out.println("Substring :");
		System.out.println("SubString : "+ s.substring(11));
		System.out.println("Index of substring starts from : "+ s.indexOf(s.substring(11)));
	}

}
