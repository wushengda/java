package test;

public class Calculator
{
	public static void main(String[] args) throws Exception
	{
		//0001 & 0011 = 0001
		System.out.println(1&3);
		
		//0011 & 0011 = 0011
		System.out.println(3&3);
		
		//0100 & 0011 = 0000
		System.out.println(4&3);

		//0100 | 0011 = 0111
		System.out.println(4|3);
		
		int a = 1 > 2?
				1:
				2;
		
		
	}
}
