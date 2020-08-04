package com.study.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapDemo
{
	public static void main(String[] args)
	{
		Map input = null;
		List<Map> orders = getList(input, "ORDERS");
		
	}

	public static List getList(Map map, String key)
	{
		if (null == map || map.isEmpty())
		{
			return new ArrayList();
		}
		else
		{
			return (List) map.get(key);
		}
	}
}
