package annotation.test;

import annotation.clazz.ExtendClass;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MethodTest
{
	public static void main(String[] args) throws Exception
	{
		classTest1();
		classDeclaredTest2();
		
	}
	
	static void classTest1() throws Exception
	{
		System.out.println("=======================================================================================");
		
		Class clazz = ExtendClass.class;
		System.out.println("classLoader.getName() = " + clazz.getName());
		
		Field[] fields = clazz.getFields();
		for (Field field : fields)
		{
			System.out.println("field.getName() = " + field.getName());
		}

		Method[] methods = clazz.getMethods();
		for (Method method : methods)
		{
			System.out.println("method.getName() = " + method.getName());
		}

		System.out.println("classLoader.newInstance() = " + clazz.newInstance());
		System.out.println("classLoader.newInstance().toString() = " + clazz.newInstance().toString());
		System.out.println("classLoader.newInstance().toString() = " + clazz.newInstance().toString());
		System.out.println("classLoader.getDeclaredMethod(\"getCustName\", String.class).getBaseName() = " + clazz.getDeclaredMethod("getCustName", String.class).getName());

		System.out.println("=======================================================================================");
	}
	
	static void classDeclaredTest2()throws Exception
	{
		Class clazz = ExtendClass.class;
		System.out.println("classLoader.getName() = " + clazz.getName());

		Field[] dFields = clazz.getDeclaredFields();
		for (Field dField : dFields)
		{
			System.out.println("field.getName() = " + dField.getName());
		}

		Method[] dMethods = clazz.getDeclaredMethods();
		for (Method dMethod : dMethods)
		{
			System.out.println("method.getName() = " + dMethod.getName());
		}

	}
	
}
