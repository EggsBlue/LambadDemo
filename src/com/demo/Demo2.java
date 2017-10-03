package com.demo;

import java.util.Random;

/**
 * Lambad±í´ïÊ½Á·Ï°
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		
		MyNumber nm;
		nm = () -> 123;
		System.out.println("1:"+nm.getValue());
		
		nm =() -> new Random().nextInt();
		System.out.println("2:"+nm.getValue());	
		nm =() -> new Random().nextInt();
		System.out.println("3:"+nm.getValue());	
//		nm = () -> "123";
	}
}
