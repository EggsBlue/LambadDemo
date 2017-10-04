package com.demo3;
/**
 * 演示块lambda表达式,求阶乘
 * 作者: 王庆华
 * 时间:2017年10月4日 上午9:59:36
 */
public class Demo1 {
	public static void main(String[] args) {
		NumberFunc func;
		func = (n) -> {
			int result = 1;
			for(int i=1; i<=n; i++)
				result = i * result;
			
			return result;
		};
		
		System.out.println("3的阶乘为:"+func.func(3));
		System.out.println("5的阶乘为:"+func.func(5));
		
	}
}
