package classloader;

/**
 * Copyright: Copyright (c) 2020 Asiainfo
 *
 * @ClassName: classloader.MyTest6
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: wusd
 * @date: 2020/1/6 17:14
 * Modification History:
 * Date         Author          Version            Description
 * ------------------------------------------------------------
 * 2020/1/6      wusd          v1.0.0               修改原因
 */
public class MyTest6
{
	public static void main(String[] args) throws Exception
	{
		System.out.println(MyChild1.a);
	}
}



//初始化顺序从上到下的
class SingleTon
{
	public static int count1;
	
	private static SingleTon singleTon = new SingleTon();
	
	private SingleTon()
	{
		count1++;
		count2++;
		System.out.println(count1);
		System.out.println(count2);
	}

	public static int count2 = 0;
	
	public static SingleTon getInstance()
	{
		return singleTon;
	}

}


interface MyParent1
{
	int a = 1;
}

interface MyChild1 extends MyParent1
{
	int b = 1;
}
