package com.cg;

import java.util.*;
import java.util.regex.*;

public class UserRegistration {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("User Registration Program with regex validation");
		String firstName;
		String lastName;
		String email;
		String namePattern = "^[A-Z]{1}[A-Za-z]{2,}";
		String emailPattern = "^[a-zA-Z0-9+_-]+([.][a-zA-Z0-9]+)*@([a-zA-Z0-9]+)([.][a-z]+)?[.][a-z]{2,}$";

		boolean match = false;
		System.out.println("Enter the first name:");
		while (!match) {
			firstName = sc.nextLine();
			match = Pattern.matches(namePattern, firstName);
			if (!match)
				System.out.println("Invalid First Name, Please enter again (First letter capital, minimum 3 letters)");
		}
		System.out.println("First Name is added successfully\n");

		match = false;
		System.out.println("Enter the last name:");
		while (!match) {
			lastName = sc.nextLine();
			match = Pattern.matches(namePattern, lastName);
			if (!match)
				System.out.println("Invalid Last Name, Please enter again (First letter capital, minimum 3 letters)");
		}
		System.out.println("Last Name is added successfully\n");
		
		match = false;
		System.out.println("Enter the email:");
		while (!match) {
			email = sc.nextLine();
			match = Pattern.matches(emailPattern, email);
			if (!match)
				System.out.println("Invalid email, Please enter again (First letter capital, minimum 3 letters)");
		}
		System.out.println("Email is added successfully\n");
	}
}
