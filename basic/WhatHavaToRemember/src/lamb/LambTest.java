package lamb;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambTest
{
	public static void main(String[] args)
	{
		List numList = Arrays.asList(1, 2, 3, 4, 5, 6);
		numList.forEach(System.out::println);
		numList.forEach(num -> System.out.println(num));

		List<String> strList = Arrays.asList("Hello", "Haier", "Fuck", "World", "Number", "Tool");
		filter(strList, str -> true);
	}

	public static void filter(List names, Predicate pre) {
		names.stream().filter((name) -> (pre.test(name)))
				.forEach((name) -> System.out.println(name + " aaaa"));
	}
	
	
}
