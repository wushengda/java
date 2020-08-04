package com.asiainfo.quickstart.app.repos.demo.ivalues;

import com.ai.appframe2.common.DataStructInterface;

import java.sql.Timestamp;

public interface IBOUmSubscriberValue extends DataStructInterface
{
    public final static String S_SubscriberInsId = "SUBSCRIBER_INS_ID";

    public final static String S_CustId = "CUST_ID";

    public final static String S_ProdInsId = "PROD_INS_ID";

    public final static String S_ProdLineId = "PROD_LINE_ID";

    public final static String S_ProdLineName = "PROD_LINE_NAME";

    public final static String S_SubscriberType = "SUBSCRIBER_TYPE";

    public final static String S_SubscriberLevel = "SUBSCRIBER_LEVEL";

    public final static String S_IsUsim = "IS_USIM";

    public final static String S_AccessNum = "ACCESS_NUM";

    public final static String S_PasswordType = "PASSWORD_TYPE";

    public final static String S_Password = "PASSWORD";

    public final static String S_SubBillId = "SUB_BILL_ID";

    public final static String S_AcctTag = "ACCT_TAG";

    public final static String S_MputeTag = "MPUTE_TAG";

    public final static String S_FirstActiveDate = "FIRST_ACTIVE_DATE";

    public final static String S_RemoveReason = "REMOVE_REASON";

    public final static String S_PreDestoryDate = "PRE_DESTORY_DATE";

    public final static String S_DestoryDate = "DESTORY_DATE";

    public final static String S_OpenMode = "OPEN_MODE";

    public final static String S_OpenDate = "OPEN_DATE";

    public final static String S_SubscriberStatus = "SUBSCRIBER_STATUS";

    public final static String S_AreaCode = "AREA_CODE";

    public final static String S_PromptType = "PROMPT_TYPE";

    public final static String S_PromptNbr = "PROMPT_NBR";

    public final static String S_PromptLag = "PROMPT_LAG";

    public final static String S_Remarks = "REMARKS";

    public final static String S_DataStatus = "DATA_STATUS";

    public final static String S_DoneCode = "DONE_CODE";

    public final static String S_CreateDate = "CREATE_DATE";

    public final static String S_CreateOpId = "CREATE_OP_ID";

    public final static String S_CreateOrgId = "CREATE_ORG_ID";

    public final static String S_CreateDistrict = "CREATE_DISTRICT";

    public final static String S_DoneDate = "DONE_DATE";

    public final static String S_OpId = "OP_ID";

    public final static String S_OrgId = "ORG_ID";

    public final static String S_MgmtDistrict = "MGMT_DISTRICT";

    public final static String S_MgmtCounty = "MGMT_COUNTY";

    public final static String S_RegionId = "REGION_ID";

    public long getSubscriberInsId();

    public long getCustId();

    public long getProdInsId();

    public long getProdLineId();

    public String getProdLineName();

    public String getSubscriberType();

    public String getSubscriberLevel();

    public String getIsUsim();

    public String getAccessNum();

    public int getPasswordType();

    public String getPassword();

    public String getSubBillId();

    public String getAcctTag();

    public String getMputeTag();

    public Timestamp getFirstActiveDate();

    public String getRemoveReason();

    public Timestamp getPreDestoryDate();

    public Timestamp getDestoryDate();

    public String getOpenMode();

    public Timestamp getOpenDate();

    public String getSubscriberStatus();

    public String getAreaCode();

    public String getPromptType();

    public String getPromptNbr();

    public String getPromptLag();

    public String getRemarks();

    public String getDataStatus();

    public long getDoneCode();

    public Timestamp getCreateDate();

    public String getCreateOpId();

    public String getCreateOrgId();

    public String getCreateDistrict();

    public Timestamp getDoneDate();

    public String getOpId();

    public String getOrgId();

    public String getMgmtDistrict();

    public String getMgmtCounty();

    public String getRegionId();

    public void setSubscriberInsId(long value);

    public void setCustId(long value);

    public void setProdInsId(long value);

    public void setProdLineId(long value);

    public void setProdLineName(String value);

    public void setSubscriberType(String value);

    public void setSubscriberLevel(String value);

    public void setIsUsim(String value);

    public void setAccessNum(String value);

    public void setPasswordType(int value);

    public void setPassword(String value);

    public void setSubBillId(String value);

    public void setAcctTag(String value);

    public void setMputeTag(String value);

    public void setFirstActiveDate(Timestamp value);

    public void setRemoveReason(String value);

    public void setPreDestoryDate(Timestamp value);

    public void setDestoryDate(Timestamp value);

    public void setOpenMode(String value);

    public void setOpenDate(Timestamp value);

    public void setSubscriberStatus(String value);

    public void setAreaCode(String value);

    public void setPromptType(String value);

    public void setPromptNbr(String value);

    public void setPromptLag(String value);

    public void setRemarks(String value);

    public void setDataStatus(String value);

    public void setDoneCode(long value);

    public void setCreateDate(Timestamp value);

    public void setCreateOpId(String value);

    public void setCreateOrgId(String value);

    public void setCreateDistrict(String value);

    public void setDoneDate(Timestamp value);

    public void setOpId(String value);

    public void setOrgId(String value);

    public void setMgmtDistrict(String value);

    public void setMgmtCounty(String value);

    public void setRegionId(String value);

}
