package com.demo5;
/**
 * 演示通过lambda将函数作为参数传递
 * 作者: 王庆华
 * 时间:2017年10月4日 上午11:18:42
 */
public class Demo1 {
	/**
	 * 间接执行lambda表达式
	 * @param func 一个函数式接口类型,可以传兼容的lambda表达式
	 * @param s 参数
	 * @return 
	 */
	static String Strop(StringFunc func,String s) {
		return func.func(s);
	}
	
	
	public static void main(String[] args) {
		String inStr = "I love yoU!";
		//按照原始来做
		StringFunc c = (in) -> in.toUpperCase();
		
		
		System.out.println(c.func(inStr));
		
		//按照参数传递来做
		//只有一个表达式的传递
		System.out.println(Strop((str) -> str.toUpperCase(), inStr));
		
		//传递块lambda表达式
		System.out.println(Strop((str)->{
			return str.toLowerCase();
		},inStr));
	}
	
	
}
