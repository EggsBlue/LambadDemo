package com.demo2;
/**
 * 带两个参数的lambad表达式
 * @author Administrator
 */
public class Demo2 {
	public static void main(String[] args) {
		
//		NumberTest2 isEqual =  (int n,int x) -> n == x;//Success
//		NumberTest2 isEqual =  (int n, x) -> n == x;//Error!
		NumberTest2 isEqual =  ( n, x) -> n == x;//Success    
		System.out.println(isEqual.test(2,2));
		System.out.println(isEqual.test(2,3));
	}
}
