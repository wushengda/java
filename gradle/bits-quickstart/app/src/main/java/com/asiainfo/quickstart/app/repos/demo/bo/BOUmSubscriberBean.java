package com.asiainfo.quickstart.app.repos.demo.bo;

import com.ai.appframe2.bo.DataContainer;
import com.ai.appframe2.common.*;
import com.asiainfo.quickstart.app.repos.demo.ivalues.IBOUmSubscriberValue;

import java.sql.Timestamp;

public class BOUmSubscriberBean extends DataContainer implements DataContainerInterface, IBOUmSubscriberValue
{
    private static String m_boName = "com.asiainfo.order.app.repository.bo.BOUmSubscriber";

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

    public static ObjectType S_TYPE = null;

    static
    {
        try
        {
            S_TYPE = ServiceManager.getObjectTypeFactory().getInstance(m_boName);
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    public BOUmSubscriberBean() throws AIException
    {
        super(S_TYPE);
    }

    public static ObjectType getObjectTypeStatic() throws AIException
    {
        return S_TYPE;
    }

    @Override
    public void setObjectType(ObjectType value) throws AIException
    {
        //
        throw new AIException("Cannot reset ObjectType");
    }

    public void initSubscriberInsId(long value)
    {
        this.initProperty(S_SubscriberInsId, new Long(value));
    }

    public void setSubscriberInsId(long value)
    {
        this.set(S_SubscriberInsId, new Long(value));
    }

    public void setSubscriberInsIdNull()
    {
        this.set(S_SubscriberInsId, null);
    }

    public long getSubscriberInsId()
    {
        return DataType.getAsLong(this.get(S_SubscriberInsId));
    }

    public long getSubscriberInsIdInitialValue()
    {
        return DataType.getAsLong(this.getOldObj(S_SubscriberInsId));
    }

    public void initCustId(long value)
    {
        this.initProperty(S_CustId, new Long(value));
    }

    public void setCustId(long value)
    {
        this.set(S_CustId, new Long(value));
    }

    public void setCustIdNull()
    {
        this.set(S_CustId, null);
    }

    public long getCustId()
    {
        return DataType.getAsLong(this.get(S_CustId));
    }

    public long getCustIdInitialValue()
    {
        return DataType.getAsLong(this.getOldObj(S_CustId));
    }

    public void initProdInsId(long value)
    {
        this.initProperty(S_ProdInsId, new Long(value));
    }

    public void setProdInsId(long value)
    {
        this.set(S_ProdInsId, new Long(value));
    }

    public void setProdInsIdNull()
    {
        this.set(S_ProdInsId, null);
    }

    public long getProdInsId()
    {
        return DataType.getAsLong(this.get(S_ProdInsId));
    }

    public long getProdInsIdInitialValue()
    {
        return DataType.getAsLong(this.getOldObj(S_ProdInsId));
    }

    public void initProdLineId(long value)
    {
        this.initProperty(S_ProdLineId, new Long(value));
    }

    public void setProdLineId(long value)
    {
        this.set(S_ProdLineId, new Long(value));
    }

    public void setProdLineIdNull()
    {
        this.set(S_ProdLineId, null);
    }

    public long getProdLineId()
    {
        return DataType.getAsLong(this.get(S_ProdLineId));
    }

    public long getProdLineIdInitialValue()
    {
        return DataType.getAsLong(this.getOldObj(S_ProdLineId));
    }

    public void initProdLineName(String value)
    {
        this.initProperty(S_ProdLineName, value);
    }

    public void setProdLineName(String value)
    {
        this.set(S_ProdLineName, value);
    }

    public void setProdLineNameNull()
    {
        this.set(S_ProdLineName, null);
    }

    public String getProdLineName()
    {
        return DataType.getAsString(this.get(S_ProdLineName));
    }

    public String getProdLineNameInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_ProdLineName));
    }

    public void initSubscriberType(String value)
    {
        this.initProperty(S_SubscriberType, value);
    }

    public void setSubscriberType(String value)
    {
        this.set(S_SubscriberType, value);
    }

    public void setSubscriberTypeNull()
    {
        this.set(S_SubscriberType, null);
    }

    public String getSubscriberType()
    {
        return DataType.getAsString(this.get(S_SubscriberType));
    }

    public String getSubscriberTypeInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_SubscriberType));
    }

    public void initSubscriberLevel(String value)
    {
        this.initProperty(S_SubscriberLevel, value);
    }

    public void setSubscriberLevel(String value)
    {
        this.set(S_SubscriberLevel, value);
    }

    public void setSubscriberLevelNull()
    {
        this.set(S_SubscriberLevel, null);
    }

    public String getSubscriberLevel()
    {
        return DataType.getAsString(this.get(S_SubscriberLevel));
    }

    public String getSubscriberLevelInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_SubscriberLevel));
    }

    public void initIsUsim(String value)
    {
        this.initProperty(S_IsUsim, value);
    }

    public void setIsUsim(String value)
    {
        this.set(S_IsUsim, value);
    }

    public void setIsUsimNull()
    {
        this.set(S_IsUsim, null);
    }

    public String getIsUsim()
    {
        return DataType.getAsString(this.get(S_IsUsim));
    }

    public String getIsUsimInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_IsUsim));
    }

    public void initAccessNum(String value)
    {
        this.initProperty(S_AccessNum, value);
    }

    public void setAccessNum(String value)
    {
        this.set(S_AccessNum, value);
    }

    public void setAccessNumNull()
    {
        this.set(S_AccessNum, null);
    }

    public String getAccessNum()
    {
        return DataType.getAsString(this.get(S_AccessNum));
    }

    public String getAccessNumInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_AccessNum));
    }

    public void initPasswordType(int value)
    {
        this.initProperty(S_PasswordType, new Integer(value));
    }

    public void setPasswordType(int value)
    {
        this.set(S_PasswordType, new Integer(value));
    }

    public void setPasswordTypeNull()
    {
        this.set(S_PasswordType, null);
    }

    public int getPasswordType()
    {
        return DataType.getAsInt(this.get(S_PasswordType));
    }

    public int getPasswordTypeInitialValue()
    {
        return DataType.getAsInt(this.getOldObj(S_PasswordType));
    }

    public void initPassword(String value)
    {
        this.initProperty(S_Password, value);
    }

    public void setPassword(String value)
    {
        this.set(S_Password, value);
    }

    public void setPasswordNull()
    {
        this.set(S_Password, null);
    }

    public String getPassword()
    {
        return DataType.getAsString(this.get(S_Password));
    }

    public String getPasswordInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_Password));
    }

    public void initSubBillId(String value)
    {
        this.initProperty(S_SubBillId, value);
    }

    public void setSubBillId(String value)
    {
        this.set(S_SubBillId, value);
    }

    public void setSubBillIdNull()
    {
        this.set(S_SubBillId, null);
    }

    public String getSubBillId()
    {
        return DataType.getAsString(this.get(S_SubBillId));
    }

    public String getSubBillIdInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_SubBillId));
    }

    public void initAcctTag(String value)
    {
        this.initProperty(S_AcctTag, value);
    }

    public void setAcctTag(String value)
    {
        this.set(S_AcctTag, value);
    }

    public void setAcctTagNull()
    {
        this.set(S_AcctTag, null);
    }

    public String getAcctTag()
    {
        return DataType.getAsString(this.get(S_AcctTag));
    }

    public String getAcctTagInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_AcctTag));
    }

    public void initMputeTag(String value)
    {
        this.initProperty(S_MputeTag, value);
    }

    public void setMputeTag(String value)
    {
        this.set(S_MputeTag, value);
    }

    public void setMputeTagNull()
    {
        this.set(S_MputeTag, null);
    }

    public String getMputeTag()
    {
        return DataType.getAsString(this.get(S_MputeTag));
    }

    public String getMputeTagInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_MputeTag));
    }

    public void initFirstActiveDate(Timestamp value)
    {
        this.initProperty(S_FirstActiveDate, value);
    }

    public void setFirstActiveDate(Timestamp value)
    {
        this.set(S_FirstActiveDate, value);
    }

    public void setFirstActiveDateNull()
    {
        this.set(S_FirstActiveDate, null);
    }

    public Timestamp getFirstActiveDate()
    {
        return DataType.getAsDateTime(this.get(S_FirstActiveDate));
    }

    public Timestamp getFirstActiveDateInitialValue()
    {
        return DataType.getAsDateTime(this.getOldObj(S_FirstActiveDate));
    }

    public void initRemoveReason(String value)
    {
        this.initProperty(S_RemoveReason, value);
    }

    public void setRemoveReason(String value)
    {
        this.set(S_RemoveReason, value);
    }

    public void setRemoveReasonNull()
    {
        this.set(S_RemoveReason, null);
    }

    public String getRemoveReason()
    {
        return DataType.getAsString(this.get(S_RemoveReason));
    }

    public String getRemoveReasonInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_RemoveReason));
    }

    public void initPreDestoryDate(Timestamp value)
    {
        this.initProperty(S_PreDestoryDate, value);
    }

    public void setPreDestoryDate(Timestamp value)
    {
        this.set(S_PreDestoryDate, value);
    }

    public void setPreDestoryDateNull()
    {
        this.set(S_PreDestoryDate, null);
    }

    public Timestamp getPreDestoryDate()
    {
        return DataType.getAsDateTime(this.get(S_PreDestoryDate));
    }

    public Timestamp getPreDestoryDateInitialValue()
    {
        return DataType.getAsDateTime(this.getOldObj(S_PreDestoryDate));
    }

    public void initDestoryDate(Timestamp value)
    {
        this.initProperty(S_DestoryDate, value);
    }

    public void setDestoryDate(Timestamp value)
    {
        this.set(S_DestoryDate, value);
    }

    public void setDestoryDateNull()
    {
        this.set(S_DestoryDate, null);
    }

    public Timestamp getDestoryDate()
    {
        return DataType.getAsDateTime(this.get(S_DestoryDate));
    }

    public Timestamp getDestoryDateInitialValue()
    {
        return DataType.getAsDateTime(this.getOldObj(S_DestoryDate));
    }

    public void initOpenMode(String value)
    {
        this.initProperty(S_OpenMode, value);
    }

    public void setOpenMode(String value)
    {
        this.set(S_OpenMode, value);
    }

    public void setOpenModeNull()
    {
        this.set(S_OpenMode, null);
    }

    public String getOpenMode()
    {
        return DataType.getAsString(this.get(S_OpenMode));
    }

    public String getOpenModeInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_OpenMode));
    }

    public void initOpenDate(Timestamp value)
    {
        this.initProperty(S_OpenDate, value);
    }

    public void setOpenDate(Timestamp value)
    {
        this.set(S_OpenDate, value);
    }

    public void setOpenDateNull()
    {
        this.set(S_OpenDate, null);
    }

    public Timestamp getOpenDate()
    {
        return DataType.getAsDateTime(this.get(S_OpenDate));
    }

    public Timestamp getOpenDateInitialValue()
    {
        return DataType.getAsDateTime(this.getOldObj(S_OpenDate));
    }

    public void initSubscriberStatus(String value)
    {
        this.initProperty(S_SubscriberStatus, value);
    }

    public void setSubscriberStatus(String value)
    {
        this.set(S_SubscriberStatus, value);
    }

    public void setSubscriberStatusNull()
    {
        this.set(S_SubscriberStatus, null);
    }

    public String getSubscriberStatus()
    {
        return DataType.getAsString(this.get(S_SubscriberStatus));
    }

    public String getSubscriberStatusInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_SubscriberStatus));
    }

    public void initAreaCode(String value)
    {
        this.initProperty(S_AreaCode, value);
    }

    public void setAreaCode(String value)
    {
        this.set(S_AreaCode, value);
    }

    public void setAreaCodeNull()
    {
        this.set(S_AreaCode, null);
    }

    public String getAreaCode()
    {
        return DataType.getAsString(this.get(S_AreaCode));
    }

    public String getAreaCodeInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_AreaCode));
    }

    public void initPromptType(String value)
    {
        this.initProperty(S_PromptType, value);
    }

    public void setPromptType(String value)
    {
        this.set(S_PromptType, value);
    }

    public void setPromptTypeNull()
    {
        this.set(S_PromptType, null);
    }

    public String getPromptType()
    {
        return DataType.getAsString(this.get(S_PromptType));
    }

    public String getPromptTypeInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_PromptType));
    }

    public void initPromptNbr(String value)
    {
        this.initProperty(S_PromptNbr, value);
    }

    public void setPromptNbr(String value)
    {
        this.set(S_PromptNbr, value);
    }

    public void setPromptNbrNull()
    {
        this.set(S_PromptNbr, null);
    }

    public String getPromptNbr()
    {
        return DataType.getAsString(this.get(S_PromptNbr));
    }

    public String getPromptNbrInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_PromptNbr));
    }

    public void initPromptLag(String value)
    {
        this.initProperty(S_PromptLag, value);
    }

    public void setPromptLag(String value)
    {
        this.set(S_PromptLag, value);
    }

    public void setPromptLagNull()
    {
        this.set(S_PromptLag, null);
    }

    public String getPromptLag()
    {
        return DataType.getAsString(this.get(S_PromptLag));
    }

    public String getPromptLagInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_PromptLag));
    }

    public void initRemarks(String value)
    {
        this.initProperty(S_Remarks, value);
    }

    public void setRemarks(String value)
    {
        this.set(S_Remarks, value);
    }

    public void setRemarksNull()
    {
        this.set(S_Remarks, null);
    }

    public String getRemarks()
    {
        return DataType.getAsString(this.get(S_Remarks));
    }

    public String getRemarksInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_Remarks));
    }

    public void initDataStatus(String value)
    {
        this.initProperty(S_DataStatus, value);
    }

    public void setDataStatus(String value)
    {
        this.set(S_DataStatus, value);
    }

    public void setDataStatusNull()
    {
        this.set(S_DataStatus, null);
    }

    public String getDataStatus()
    {
        return DataType.getAsString(this.get(S_DataStatus));
    }

    public String getDataStatusInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_DataStatus));
    }

    public void initDoneCode(long value)
    {
        this.initProperty(S_DoneCode, new Long(value));
    }

    public void setDoneCode(long value)
    {
        this.set(S_DoneCode, new Long(value));
    }

    public void setDoneCodeNull()
    {
        this.set(S_DoneCode, null);
    }

    public long getDoneCode()
    {
        return DataType.getAsLong(this.get(S_DoneCode));
    }

    public long getDoneCodeInitialValue()
    {
        return DataType.getAsLong(this.getOldObj(S_DoneCode));
    }

    public void initCreateDate(Timestamp value)
    {
        this.initProperty(S_CreateDate, value);
    }

    public void setCreateDate(Timestamp value)
    {
        this.set(S_CreateDate, value);
    }

    public void setCreateDateNull()
    {
        this.set(S_CreateDate, null);
    }

    public Timestamp getCreateDate()
    {
        return DataType.getAsDateTime(this.get(S_CreateDate));
    }

    public Timestamp getCreateDateInitialValue()
    {
        return DataType.getAsDateTime(this.getOldObj(S_CreateDate));
    }

    public void initCreateOpId(String value)
    {
        this.initProperty(S_CreateOpId, value);
    }

    public void setCreateOpId(String value)
    {
        this.set(S_CreateOpId, value);
    }

    public void setCreateOpIdNull()
    {
        this.set(S_CreateOpId, null);
    }

    public String getCreateOpId()
    {
        return DataType.getAsString(this.get(S_CreateOpId));
    }

    public String getCreateOpIdInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_CreateOpId));
    }

    public void initCreateOrgId(String value)
    {
        this.initProperty(S_CreateOrgId, value);
    }

    public void setCreateOrgId(String value)
    {
        this.set(S_CreateOrgId, value);
    }

    public void setCreateOrgIdNull()
    {
        this.set(S_CreateOrgId, null);
    }

    public String getCreateOrgId()
    {
        return DataType.getAsString(this.get(S_CreateOrgId));
    }

    public String getCreateOrgIdInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_CreateOrgId));
    }

    public void initCreateDistrict(String value)
    {
        this.initProperty(S_CreateDistrict, value);
    }

    public void setCreateDistrict(String value)
    {
        this.set(S_CreateDistrict, value);
    }

    public void setCreateDistrictNull()
    {
        this.set(S_CreateDistrict, null);
    }

    public String getCreateDistrict()
    {
        return DataType.getAsString(this.get(S_CreateDistrict));
    }

    public String getCreateDistrictInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_CreateDistrict));
    }

    public void initDoneDate(Timestamp value)
    {
        this.initProperty(S_DoneDate, value);
    }

    public void setDoneDate(Timestamp value)
    {
        this.set(S_DoneDate, value);
    }

    public void setDoneDateNull()
    {
        this.set(S_DoneDate, null);
    }

    public Timestamp getDoneDate()
    {
        return DataType.getAsDateTime(this.get(S_DoneDate));
    }

    public Timestamp getDoneDateInitialValue()
    {
        return DataType.getAsDateTime(this.getOldObj(S_DoneDate));
    }

    public void initOpId(String value)
    {
        this.initProperty(S_OpId, value);
    }

    public void setOpId(String value)
    {
        this.set(S_OpId, value);
    }

    public void setOpIdNull()
    {
        this.set(S_OpId, null);
    }

    public String getOpId()
    {
        return DataType.getAsString(this.get(S_OpId));
    }

    public String getOpIdInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_OpId));
    }

    public void initOrgId(String value)
    {
        this.initProperty(S_OrgId, value);
    }

    public void setOrgId(String value)
    {
        this.set(S_OrgId, value);
    }

    public void setOrgIdNull()
    {
        this.set(S_OrgId, null);
    }

    public String getOrgId()
    {
        return DataType.getAsString(this.get(S_OrgId));
    }

    public String getOrgIdInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_OrgId));
    }

    public void initMgmtDistrict(String value)
    {
        this.initProperty(S_MgmtDistrict, value);
    }

    public void setMgmtDistrict(String value)
    {
        this.set(S_MgmtDistrict, value);
    }

    public void setMgmtDistrictNull()
    {
        this.set(S_MgmtDistrict, null);
    }

    public String getMgmtDistrict()
    {
        return DataType.getAsString(this.get(S_MgmtDistrict));
    }

    public String getMgmtDistrictInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_MgmtDistrict));
    }

    public void initMgmtCounty(String value)
    {
        this.initProperty(S_MgmtCounty, value);
    }

    public void setMgmtCounty(String value)
    {
        this.set(S_MgmtCounty, value);
    }

    public void setMgmtCountyNull()
    {
        this.set(S_MgmtCounty, null);
    }

    public String getMgmtCounty()
    {
        return DataType.getAsString(this.get(S_MgmtCounty));
    }

    public String getMgmtCountyInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_MgmtCounty));
    }

    public void initRegionId(String value)
    {
        this.initProperty(S_RegionId, value);
    }

    public void setRegionId(String value)
    {
        this.set(S_RegionId, value);
    }

    public void setRegionIdNull()
    {
        this.set(S_RegionId, null);
    }

    public String getRegionId()
    {
        return DataType.getAsString(this.get(S_RegionId));
    }

    public String getRegionIdInitialValue()
    {
        return DataType.getAsString(this.getOldObj(S_RegionId));
    }

}
