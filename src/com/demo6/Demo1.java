package com.demo6;

import java.util.Arrays;

/**
 * 演示Lambda中异常的处理
 * 作者: 王庆华
 * 时间:2017年10月4日 上午11:43:09
 */
public class Demo1 {
	public static void main(String[] args) {
		double[] dd = {2.5,3.5,4.6,4.4};
		
		DoubleNumericArrayFunc func = (d) -> {
			if(d.length == 0) {
				throw new EmptyArrayException();
			}
			Arrays.sort(d);
			return d;
		};
		try {
			double[] func2 = func.func(dd);
			for(double d : func2) {
				System.out.print(d+",");
			}
			System.out.println();
			double[] d3 =func.func(new double[0]);
			for(double d : d3) {
				System.out.print(d+",");
			}
		} catch (EmptyArrayException e) {
			e.printStackTrace();
		}
	}
}
