package com.study.basic.integer;

public class IntegerDemo
{
	public static void main(String[] args) throws Exception
	{
		/** 进制转换 **/
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println(Integer.toHexString(100));

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		/** Integer的构造方法 **/
		Integer integer1 = new Integer(100);
		System.out.println(integer1);
		Integer integer2 = new Integer("1000");
		System.out.println(integer2);
		
		
		/** Integer转换成String **/
		String str1 = new Integer(1).toString();
		System.out.println(str1);
		String str2 = String.valueOf(2);
		System.out.println(str2);
		String str3 = 3 + "";
		System.out.println(str3);
		String str4 = Integer.toString(4);
		System.out.println(str4);

		/** String转换成int **/
		Integer integer3 = new Integer("100");
		int int1 = integer3.intValue();
		System.out.println("int1:" + int1);
		int int2 = Integer.parseInt("100");
		System.out.println("int2:" + int2);

		// 十进制到二进制，八进制，十六进制
		System.out.println("-------------------------");
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println(Integer.toHexString(100));
		System.out.println("-------------------------");

		// 十进制到其他进制
		System.out.println("-------------------------");
		System.out.println(Integer.toString(100, 10));
		System.out.println(Integer.toString(100, 2));
		System.out.println(Integer.toString(100, 8));
		System.out.println(Integer.toString(100, 16));
		System.out.println(Integer.toString(100, 5));
		System.out.println(Integer.toString(100, 7));
		System.out.println(Integer.toString(100, -7));
		System.out.println(Integer.toString(100, 70));
		System.out.println(Integer.toString(100, 1));
		System.out.println(Integer.toString(100, 17));
		System.out.println(Integer.toString(100, 32));
		System.out.println(Integer.toString(100, 37));
		System.out.println(Integer.toString(100, 36));
		System.out.println("-------------------------");

		//其他进制到十进制
		System.out.println("-------------------------");
		System.out.println(Integer.parseInt("100", 10));
		System.out.println(Integer.parseInt("100", 2));
		System.out.println(Integer.parseInt("100", 8));
		System.out.println(Integer.parseInt("100", 16));
		System.out.println(Integer.parseInt("100", 23));
		System.out.println("-------------------------");

		/*
		 * 看程序写结果
		 *
		 * 注意：Integer的数据直接赋值，如果在-128到127之间，会直接从缓冲池里获取数据
		 */
		Integer i1 = new Integer(127);
		Integer i2 = new Integer(127);
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		System.out.println("-----------");

		Integer i3 = new Integer(128);
		Integer i4 = new Integer(128);
		System.out.println(i3 == i4);
		System.out.println(i3.equals(i4));
		System.out.println("-----------");

		Integer i5 = 128;
		Integer i6 = 128;
		System.out.println(i5 == i6);
		System.out.println(i5.equals(i6));
		System.out.println("-----------");

		Integer i7 = 127;
		Integer i8 = 127;
		System.out.println(i7 == i8);
		System.out.println(i7.equals(i8));

		// 通过查看源码，我们就知道了，针对-128到127之间的数据，做了一个数据缓冲池，如果数据是该范围内的，每次并不创建新的空间
		// Integer ii = Integer.valueOf(127);
	}
}
