package annotation.clazz;

import annotation.Clazz;
import annotation.Field;
import annotation.Method;
import annotation.Parameter;

@Clazz(name = "ExtendClass", busiCode = "BUSI_CODE")
public class ExtendClass extends BaseClass
{
	@Field(value = "SUBSCRIBER_INS_ID")
	private String subscriberInsId;
	
	@Field(value = "CUST_ID")
	private String custId;
	
	@Field(value = "ACCT_ID")
	public String acctId;

	@Method(value = "GET_CUST_NAME")
	public String getCustName(@Parameter(value = "PARAM") String custId)throws Exception
	{
		return custId;
	}
	
	public String getSubscriberInsId()
	{
		return subscriberInsId;
	}

	public String getCustId()
	{
		return custId;
	}

	public String getAcctId()
	{
		return acctId;
	}

}
