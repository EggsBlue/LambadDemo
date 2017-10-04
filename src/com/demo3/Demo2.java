package com.demo3;
/**
 * 演示lambda表达式,将一个字符串颠倒位置
 * 作者: 王庆华
 * 时间:2017年10月4日 上午10:02:42
 */
public class Demo2 {
	public static void main(String[] args) {
		
		StringFunc sf = (s) -> {
			String result = "";
			int i;
			for(i = s.length()-1; i>=0; i--)
				result += s.charAt(i);
			return result;
		};
		System.out.println(sf.func("I love you coder"));
	}
}
