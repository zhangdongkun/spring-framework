package com.zdk;

public class ClazzLoderTest {

	public static void main(String[] args) throws ClassNotFoundException {
		ClassLoader c  = Test.class.getClassLoader();  //获取Test类的类加载器
		Class<?> cl = c.loadClass("com.zdk.Test");
		//系统默认通过类加载器加载
		Class<?> cl2 = Class.forName("com.zdk.Test");
		System.out.println(cl);
		System.out.println(cl2);
		System.out.println(cl2==cl);
		System.out.println(Integer.toHexString(cl2.hashCode()));
		System.out.println(cl.hashCode());
	}
}
