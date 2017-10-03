package com.demo2;
/**
 * 传参使用lambad表达式
 * @author Administrator
 *
 */
public class Demo1 {
	public static void main(String[] args) {
		
		NumberTest isEven =  a -> (a % 2) == 0;
		if(isEven.test(10)) {
			System.out.println("10 is even");
		}
		
		if(isEven.test(9)) {
			System.out.println("0 is even");
		}
		
		NumberTest isNonNeg = (n) -> n >= 0;
		if(isNonNeg.test(1))
			System.out.println("1大于0");
		if(isNonNeg.test(-1))
			System.out.println("-1大于0");
		
		
	}
}
