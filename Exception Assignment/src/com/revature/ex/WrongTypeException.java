package com.revature.ex;

public class WrongTypeException extends Exception {
	public WrongTypeException(String s, Throwable cause) {
		super(s);
		System.out.println("hello");
	}
}
