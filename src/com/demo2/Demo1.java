package com.demo2;
/**
 * ����ʹ��lambad���ʽ
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
			System.out.println("1����0");
		if(isNonNeg.test(-1))
			System.out.println("-1����0");
		
		
	}
}
