package annotation.driver;

import java.io.File;
import java.net.URL;
import java.util.Enumeration;

public class ServiceDriver
{
	public ServiceDriver() throws Exception
	{
	}

	public static void main(String[] args) throws Exception
	{
		new ServiceDriver().load("com.jishudui");
	}

	private void load(String packageName) throws Exception
	{
		Enumeration<URL> urls = getCustomClassLoader().getResources(packageName.replaceAll("\\.", "/"));
		while (urls.hasMoreElements())
		{
			URL url = urls.nextElement();
			if ("file".equals(url.getProtocol()))
			{
				String path = url.getPath();
				File[] classFiles = new File(path).listFiles((File f) -> f.isDirectory() || (f.isFile() && f.getName().endsWith(".class")));
				for(File file : classFiles) {
					String className = packageName + "." + file.getName() + ".class";
					System.out.println(className);
				}
			}
			else if ("jar".equals(url.getProtocol()))
			{

			}
		}
	}

	private static ClassLoader getCustomClassLoader()
	{
		return ServiceDriver.class.getClassLoader();
	}
}
