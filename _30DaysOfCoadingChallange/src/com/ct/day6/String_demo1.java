package com.ct.day6;

import java.util.Base64;
import java.util.regex.Pattern;

public class String_demo1 {

	public static void main(String[] args) {
		String username = " Chetan There ";
		System.out.println("Manipulated username: " + manipulate(username));

		String password = "Pass123!";
		System.out.println("Password valid? " + passwordValid(password));

		System.out.println("Masked password: " + maskPassword(password));

		String email = "chetan@gmail.com";
		System.out.println("Email valid? " + emailValid(email));

		System.out.println("Generated token: " + generateToken(username));
	}

	// 1. Trim + normalize username
	public static String manipulate(String str) {
		return str.toLowerCase().trim();
	}

	// 2. Password validation
	public static boolean passwordValid(String str) {
		// At least 8 chars, one uppercase, one lowercase, one digit, one special char
		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";
		return Pattern.matches(regex, str);
	}

	// 3. Mask password except first and last char
	public static String maskPassword(String str) {
		if (str.length() <= 2)
			return str; // too short, return as is
		String middle = "*".repeat(str.length() - 2);
		return str.charAt(0) + middle + str.charAt(str.length() - 1);
	}

	// 4. Email format check
	public static boolean emailValid(String str) {
		String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
		return Pattern.matches(regex, str);
	}

	// 5. Token generation (username + timestamp → Base64)
	public static String generateToken(String username) {
		String data = manipulate(username) + ":" + System.currentTimeMillis();
		return Base64.getEncoder().encodeToString(data.getBytes());
	}
}