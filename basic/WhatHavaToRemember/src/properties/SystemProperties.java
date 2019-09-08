package properties;

import java.util.Map;
import java.util.Properties;

public class SystemProperties
{
	public static void main(String[] args) throws Exception
	{
		Properties properties = System.getProperties();
		for (String name : properties.stringPropertyNames())
		{
			System.out.println(name + "=" + properties.getProperty(name));
		}
		
		System.setProperty("org.apache.tapestry.disable-caching", "true");

		System.out.println(System.getProperty("user.name"));

		System.out.println(System.getProperty("org.apache.tapestry.disable-caching"));

		System.out.println("------------------------------------------------");

		Map<String, String> envs = System.getenv();
		for (String name : envs.keySet())
		{
			System.out.println(name + "=" + envs.get(name));
		}
		
		System.out.println("------------------------------------------------");

		SecurityManager manager = System.getSecurityManager();
	}
}
