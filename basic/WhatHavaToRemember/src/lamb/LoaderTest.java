package lamb;

import java.util.HashMap;

public class LoaderTest
{
	public static void main(String[] args) throws Exception
	{
		int a = 0;
		run(() -> new HashMap());
	}

	static void run(Loader loader) throws Exception
	{
		loader.create();
	}
}
