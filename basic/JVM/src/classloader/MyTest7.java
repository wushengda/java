package classloader;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: classloader.MyTest7
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/1/7 11:29
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/1/7      wusd          v1.0.0               修改原因
 */
public class MyTest7
{
	public static void main(String[] args) throws Exception
	{
		Class<?> clazz1 = Class.forName("java.lang.String");
		System.out.println(clazz1.getClassLoader());

		Class<?> clazz2 = Class.forName("classloader.MyTest7");
		System.out.println(clazz2.getClassLoader());
	}

}
