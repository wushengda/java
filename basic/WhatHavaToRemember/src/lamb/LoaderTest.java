package lamb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class LoaderTest
{
	public static void main(String[] args) throws Exception
	{
		run(() -> {
			System.out.println("I AM LEARNING LAMDA...");
			Map param = new HashMap<>();
			param.put("NAME", "WUSHENGDA");
			return param;
		});
		
		
		List words = Arrays.asList("HELLO", "WORD" , "LAMDA", "WUSHENGDA");
		words.forEach(num -> System.out.println(num));

		Stream stream = words.stream();
		long count = stream.count();
		Stream distinct = stream.distinct();
	}

	static void run(Loader loader) throws Exception
	{
		Map<String, String> map = loader.create();
		map.forEach((key, value) -> {
			
		});

		Set<String> keySet = map.keySet();
		keySet.parallelStream();
		
		String aaa = "";
	}
	
	interface Loader
	{
		Map create()throws Exception;
	}
	
}
