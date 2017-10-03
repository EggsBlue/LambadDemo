package com.demo;
/**
 * 
 * 最基本的lambda表达式
 * @author Administrator
 */
public class Demo1 {
	public static void main(String[] args) {
		//普通的话我们应该这么办
		MyNumber mb = new MyNumber() {
			@Override
			public int getValue() {
				return 123;
			}
		};
		System.out.println(mb.getValue());
		
		//lambad表达式版
		MyNumber mb1 = () -> 123;
		System.out.println(mb1.getValue());
	}
}
