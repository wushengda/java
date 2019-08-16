package com.study.basic.string;

public class StringDemo
{
	public static void main(String[] args) throws Exception
	{
		/** 创建2个对象 **/
		String s1 = new String("hello");

		/** 创建1个对象 **/
		String s2 = "hello";

		//比较引用类型、比较地址值是否相同
		System.out.println(s1 == s2); //false
		//比较引用类型、比较地址值是否相同，而String类重写了equals()方法，比较的是内容是否相同。
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

		// 定义大串
		String maxString = "avavava4234aaaavaa";
		// 定义小串
		String minString = "ava";

		// 写功能实现
		int count = getTimesShortInLong(maxString, minString);
		System.out.println("Java在大串中出现了：" + count + "次");

	}

	// 查找短字符串在长字符串中出现的次数
	public static int getTimesShortInLong(String longstr, String shortstr)
	{
		// 定义一个统计变量，初始化值是0
		int count = 0;
		int index;
		int start = 0;
		//先查，赋值，判断
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
	
	// 字符串反转
	public static String reverse(String s)
	{
		// 定义一个新字符串
		String result = "";

		// 把字符串转成字符数组
		char[] chs = s.toCharArray();

		// 倒着遍历字符串，得到每一个字符
		for (int x = chs.length - 1; x >= 0; x--)
		{
			// 用新字符串把每一个字符拼接起来
			result += chs[x];
		}
		return result;
	}
}
