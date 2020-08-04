package annotation.test;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class LoadIniFileTest
{
	static ClassLoader classLoader = LoadIniFileTest.class.getClassLoader();
	
	public static void main(String[] args) throws Exception
	{
		loadIni();
		loadIni2();
		loadApplication();
		loadYaml();
	}
	
	static void loadIni()throws Exception
	{
		InputStream is = classLoader.getResourceAsStream("config.ini");

		Properties properties = new Properties();
		properties.load(is);

		String value = properties.getProperty("KEY1");
		System.out.println(value);
	}
	
	static void loadIni2()throws Exception
	{
		InputStream is = classLoader.getResourceAsStream("system/service.ini");

		Properties properties = new Properties();
		properties.load(is);

		String value = properties.getProperty("KEY1");
		System.out.println(value);
	}

	static void loadApplication()throws Exception
	{
		InputStream is = classLoader.getResourceAsStream("base.application");

		Properties properties = new Properties();
		properties.load(is);

		Enumeration<?> propertyNames = properties.propertyNames();
		Object o = propertyNames.nextElement();
		System.out.println(o.toString());
	}
	
	static void loadYaml()throws Exception
	{
		InputStream is = classLoader.getResourceAsStream("bits.yaml");

		Properties properties = new Properties();
		properties.load(is);

		Enumeration<?> propertyNames = properties.propertyNames();
		Object o = propertyNames.nextElement();
		System.out.println(o.toString());
	}
}
