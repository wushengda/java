package classloader.impl;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: classloader.impl.MyClassLoader
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/1/7 17:20
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/1/7      wusd          v1.0.0               修改原因
 */
public class MyClassLoader extends ClassLoader
{

	public static void main(String[] args) throws Exception
	{
		System.out.println(System.nanoTime());
		
		ClassLoader loader = ClassLoader.getSystemClassLoader();

		Class<?> aClass = loader.loadClass("classloader.impl.MyClassLoader");

		System.out.println(loader);
		while (null != loader)
		{
			loader = loader.getParent();
			System.out.println(loader);
		}
	}
}
