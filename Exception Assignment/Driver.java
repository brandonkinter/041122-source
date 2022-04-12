package com.revature.ex;

import java.util.Scanner;

public class Driver {
	

	public static void main(String[] args) throws WrongTypeException{
		Scanner input = new Scanner(System.in);

		try {
			favNum(input);
		} catch(Exception e) {
			throw new WrongTypeException("Not an int: ", e);
		}
		
		input.close();
	}
	
	public static void favNum(Scanner in) throws WrongTypeException {
		System.out.print("Enter your favorite number: ");
		int num = in.nextInt();
		System.out.println(num);
	}

}
