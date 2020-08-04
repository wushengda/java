package annotation.test;

import java.io.InputStream;
import java.util.Properties;

public class LoadYamlTest
{
	static ClassLoader classLoader = LoadYamlTest.class.getClassLoader();
	
	public static void main(String[] args) throws Exception
	{
		loadYaml();
	}
	
	static void loadYaml()throws Exception
	{
		InputStream is = classLoader.getResourceAsStream("bits.yaml");

		Properties properties = new Properties();
		properties.load(is);
		
		properties.getProperty("touchframe.debug");
	}
}
