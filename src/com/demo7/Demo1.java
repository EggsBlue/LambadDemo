package com.demo7;
/**
 * lambda里引用外部变量
 * 作者: 王庆华
 * 时间:2017年10月5日 上午8:28:41
 */
public class Demo1 {
	 int a = 1;
	public static void main(String[] args) {
		int num = 10;
		
		MyFunc mf = (n) -> {
			int result = num + n;
//			num = 1;	//错误,引用外部方法内的变量默认视为final,不可修改!
			return result;
		};
		
		System.out.println(mf.func(20));
	}
}
