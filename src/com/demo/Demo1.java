package com.demo;
/**
 * 
 * �������lambda���ʽ
 * @author Administrator
 */
public class Demo1 {
	public static void main(String[] args) {
		//��ͨ�Ļ�����Ӧ����ô��
		MyNumber mb = new MyNumber() {
			@Override
			public int getValue() {
				return 123;
			}
		};
		System.out.println(mb.getValue());
		
		//lambad���ʽ��
		MyNumber mb1 = () -> 123;
		System.out.println(mb1.getValue());
	}
}
