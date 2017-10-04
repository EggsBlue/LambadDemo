package com.demo4;
/**
 * 演示泛型函数式接口
 * 作者: 王庆华
 * 时间:2017年10月4日 上午10:19:19
 */
public class GenericFunctionalInterfaceDemo {
	public static void main(String[] args) {
		SomeFunc<String> s = (str) -> {
			String result = "";
			for(int i= str.length() - 1; i>=0; i--)
				result += str.charAt(i);
			return result;
		};
		System.out.println("我爱你的反转形式为:"+s.func("我爱你"));
		
		SomeFunc<Integer> inter = (in) -> {
			int result=1;
			
			for(int i=1; i<=in;i++)
				result = result* i;
			
			return result;
		};
		System.out.println("3的阶乘为:"+inter.func(3));
	}
}
