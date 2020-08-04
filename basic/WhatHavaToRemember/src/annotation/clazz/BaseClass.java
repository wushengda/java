package annotation.clazz;

import annotation.Clazz;

@Clazz(name = "BaseClass", busiCode = "BASE_CLASS_CODE")
public class BaseClass
{
	public String basePublicField;
	private String basePrivateField;
	public static String basePublicStaticField;
	private static String basePrivateStaticField;
	public static final String basePublicStaticFinalField = "basePublicStaticFinalField";
	private static final String basePrivateStaticFinalField = "basePrivateStaticFinalField";

	/** ========================================== **/
	/** PUBLIC **/
	/** ========================================== **/
	public void basePublicMethod()
	{
		
	}
	public String basePublicStringMethod()
	{
		return "basePublicStringMethod";
	}
	
	/** ========================================== **/
	/** PRIVATE **/
	/** ========================================== **/
	private void basePrivateMethod()
	{
		
	}

	private String basePrivateStringMethod()
	{
		return "basePrivateStringMethod";
	}
}
