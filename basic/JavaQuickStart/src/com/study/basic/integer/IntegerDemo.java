package com.study.basic.integer;

public class IntegerDemo
{
	public static void main(String[] args) throws Exception
	{
		/** ����ת�� **/
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println(Integer.toHexString(100));

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		/** Integer�Ĺ��췽�� **/
		Integer integer1 = new Integer(100);
		System.out.println(integer1);
		Integer integer2 = new Integer("1000");
		System.out.println(integer2);
		
		
		/** Integerת����String **/
		String str1 = new Integer(1).toString();
		System.out.println(str1);
		String str2 = String.valueOf(2);
		System.out.println(str2);
		String str3 = 3 + "";
		System.out.println(str3);
		String str4 = Integer.toString(4);
		System.out.println(str4);

		/** Stringת����int **/
		Integer integer3 = new Integer("100");
		int int1 = integer3.intValue();
		System.out.println("int1:" + int1);
		int int2 = Integer.parseInt("100");
		System.out.println("int2:" + int2);

		// ʮ���Ƶ������ƣ��˽��ƣ�ʮ������
		System.out.println("-------------------------");
		System.out.println(Integer.toBinaryString(100));
		System.out.println(Integer.toOctalString(100));
		System.out.println(Integer.toHexString(100));
		System.out.println("-------------------------");

		// ʮ���Ƶ���������
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

		//�������Ƶ�ʮ����
		System.out.println("-------------------------");
		System.out.println(Integer.parseInt("100", 10));
		System.out.println(Integer.parseInt("100", 2));
		System.out.println(Integer.parseInt("100", 8));
		System.out.println(Integer.parseInt("100", 16));
		System.out.println(Integer.parseInt("100", 23));
		System.out.println("-------------------------");

		/*
		 * ������д���
		 *
		 * ע�⣺Integer������ֱ�Ӹ�ֵ�������-128��127֮�䣬��ֱ�Ӵӻ�������ȡ����
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

		// ͨ���鿴Դ�룬���Ǿ�֪���ˣ����-128��127֮������ݣ�����һ�����ݻ���أ���������Ǹ÷�Χ�ڵģ�ÿ�β��������µĿռ�
		// Integer ii = Integer.valueOf(127);
	}
}
