package com.study.basic.string;

public class StringDemo
{
	public static void main(String[] args) throws Exception
	{
		/** ����2������ **/
		String s1 = new String("hello");

		/** ����1������ **/
		String s2 = "hello";

		//�Ƚ��������͡��Ƚϵ�ֵַ�Ƿ���ͬ
		System.out.println(s1 == s2); //false
		//�Ƚ��������͡��Ƚϵ�ֵַ�Ƿ���ͬ����String����д��equals()�������Ƚϵ��������Ƿ���ͬ��
		System.out.println(s1.equals(s2)); //true

		String s3 = new String("hello");
		System.out.println(s1 == s3); //false
		String s4 = "hello";
		System.out.println(s2 == s4); //true

		String s5 = "hello";
		String s6 = "world";
		String s7 = "helloworld";
		System.out.println(s7 == s5 + s6); //false
		System.out.println(s7 == "hello" + "world"); //true
		System.out.println(s7.equals(s5 + s6)); //true
		System.out.println(s7.equals("hello" + "world")); //true

		// �����
		String maxString = "avavava4234aaaavaa";
		// ����С��
		String minString = "ava";

		// д����ʵ��
		int count = getTimesShortInLong(maxString, minString);
		System.out.println("Java�ڴ��г����ˣ�" + count + "��");

	}

	// ���Ҷ��ַ����ڳ��ַ����г��ֵĴ���
	public static int getTimesShortInLong(String longstr, String shortstr)
	{
		// ����һ��ͳ�Ʊ�������ʼ��ֵ��0
		int count = 0;
		int index;
		int start = 0;
		//�Ȳ飬��ֵ���ж�
		while ((index = longstr.indexOf(shortstr)) != -1)
		{
			count++;
			start++;
			//longstr = longstr.substring(index - shortstr.length() -1);
			longstr = longstr.substring(start);
			System.out.println(longstr);
		}

		return count;
	}
	
	// �ַ�����ת
	public static String reverse(String s)
	{
		// ����һ�����ַ���
		String result = "";

		// ���ַ���ת���ַ�����
		char[] chs = s.toCharArray();

		// ���ű����ַ������õ�ÿһ���ַ�
		for (int x = chs.length - 1; x >= 0; x--)
		{
			// �����ַ�����ÿһ���ַ�ƴ������
			result += chs[x];
		}
		return result;
	}
}
