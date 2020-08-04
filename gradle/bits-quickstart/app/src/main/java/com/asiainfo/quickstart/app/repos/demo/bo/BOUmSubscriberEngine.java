package com.asiainfo.quickstart.app.repos.demo.bo;

import com.ai.appframe2.bo.DataContainerFactory;
import com.ai.appframe2.common.AIException;
import com.ai.appframe2.common.DataContainerInterface;
import com.ai.appframe2.common.ServiceManager;
import com.ai.appframe2.util.criteria.Criteria;
import com.asiainfo.quickstart.app.repos.demo.ivalues.IBOUmSubscriberValue;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

public class BOUmSubscriberEngine
{

    public static BOUmSubscriberBean[] getBeans(DataContainerInterface dc) throws Exception
    {
        Map ps = dc.getProperties();
        StringBuilder builder = new StringBuilder();
        Map pList = new HashMap();
        for (java.util.Iterator cc = ps.entrySet().iterator(); cc.hasNext();)
        {
            Map.Entry e = (Map.Entry) cc.next();
            if (builder.length() > 0)
            {
                builder.append(" and ");
            }
            builder.append(e.getKey().toString() + " = :p_" + e.getKey().toString());
            pList.put("p_" + e.getKey().toString(), e.getValue());
        }
        Connection conn = ServiceManager.getSession().getConnection();
        try
        {
            return getBeans(builder.toString(), pList);
        }
        finally
        {
            if (conn != null)
            {
                conn.close();
            }
        }
    }

    public static BOUmSubscriberBean getBean(long _SubscriberInsId) throws Exception
    {
        /** new create */
        String condition = "SUBSCRIBER_INS_ID = :S_SUBSCRIBER_INS_ID";
        Map map = new HashMap();
        map.put("S_SUBSCRIBER_INS_ID", new Long(_SubscriberInsId));

        BOUmSubscriberBean[] beans = getBeans(condition, map);
        if (beans != null && beans.length == 1)
        {
            return beans[0];
        }
        else if (beans != null && beans.length > 1)
        {
            // [错误]根据主键查询出现一条以上记录
            throw new Exception("[ERROR]More datas than one queryed by PK");
        }
        else
        {
            return null;
        }
    }

    public static BOUmSubscriberBean[] getBeans(Criteria sql) throws Exception
    {
        return getBeans(sql, -1, -1, false);
    }

    public static BOUmSubscriberBean[] getBeans(Criteria sql, int startNum, int endNum, boolean isShowFK) throws Exception
    {
        String[] cols = null;
        String condition = "";
        Map param = null;
        if (sql != null)
        {
            cols = (String[]) sql.getSelectColumns().toArray(new String[0]);
            condition = sql.toString();
            param = sql.getParameters();
        }
        return getBeans(cols, condition, param, startNum, endNum, isShowFK);
    }

    public static BOUmSubscriberBean[] getBeans(String condition, Map parameter) throws Exception
    {
        return getBeans(null, condition, parameter, -1, -1, false);
    }

    public static BOUmSubscriberBean[] getBeans(String[] cols, String condition, Map parameter, int startNum, int endNum, boolean isShowFK) throws Exception
    {
        Connection conn = null;
        try
        {
            conn = ServiceManager.getSession().getConnection();
            return (BOUmSubscriberBean[]) ServiceManager.getDataStore().retrieve(conn, BOUmSubscriberBean.class, BOUmSubscriberBean.getObjectTypeStatic(), cols, condition, parameter, startNum, endNum, isShowFK, false, null);
        }
        catch (Exception e)
        {
            throw e;
        }
        finally
        {
            if (conn != null)
            {
                conn.close();
            }
        }
    }

    public static BOUmSubscriberBean[] getBeans(String[] cols, String condition, Map parameter, int startNum, int endNum, boolean isShowFK, String[] extendBOAttrs) throws Exception
    {
        Connection conn = null;
        try
        {
            conn = ServiceManager.getSession().getConnection();
            return (BOUmSubscriberBean[]) ServiceManager.getDataStore().retrieve(conn, BOUmSubscriberBean.class, BOUmSubscriberBean.getObjectTypeStatic(), cols, condition, parameter, startNum, endNum, isShowFK, false, extendBOAttrs);
        }
        catch (Exception e)
        {
            throw e;
        }
        finally
        {
            if (conn != null)
            {
                conn.close();
            }
        }
    }

    public static int getBeansCount(String condition, Map parameter) throws Exception
    {
        Connection conn = null;
        try
        {
            conn = ServiceManager.getSession().getConnection();
            return ServiceManager.getDataStore().retrieveCount(conn, BOUmSubscriberBean.getObjectTypeStatic(), condition, parameter, null);
        }
        catch (Exception e)
        {
            throw e;
        }
        finally
        {
            if (conn != null)
            {
                conn.close();
            }
        }
    }

    public static int getBeansCount(String condition, Map parameter, String[] extendBOAttrs) throws Exception
    {
        Connection conn = null;
        try
        {
            conn = ServiceManager.getSession().getConnection();
            return ServiceManager.getDataStore().retrieveCount(conn, BOUmSubscriberBean.getObjectTypeStatic(), condition, parameter, extendBOAttrs);
        }
        catch (Exception e)
        {
            throw e;
        }
        finally
        {
            if (conn != null)
            {
                conn.close();
            }
        }
    }

    public static void save(BOUmSubscriberBean aBean) throws Exception
    {
        Connection conn = null;
        try
        {
            conn = ServiceManager.getSession().getConnection();
            ServiceManager.getDataStore().save(conn, aBean);
        }
        catch (Exception e)
        {
            throw e;
        }
        finally
        {
            if (conn != null)
            {
                conn.close();
            }
        }
    }

    public static void save(BOUmSubscriberBean[] aBeans) throws Exception
    {
        Connection conn = null;
        try
        {
            conn = ServiceManager.getSession().getConnection();
            ServiceManager.getDataStore().save(conn, aBeans);
        }
        catch (Exception e)
        {
            throw e;
        }
        finally
        {
            if (conn != null)
            {
                conn.close();
            }
        }
    }

    public static void saveBatch(BOUmSubscriberBean[] aBeans) throws Exception
    {
        Connection conn = null;
        try
        {
            conn = ServiceManager.getSession().getConnection();
            ServiceManager.getDataStore().saveBatch(conn, aBeans);
        }
        catch (Exception e)
        {
            throw e;
        }
        finally
        {
            if (conn != null)
            {
                conn.close();
            }
        }
    }

    public static BOUmSubscriberBean[] getBeansFromQueryBO(String soureBO, Map parameter) throws Exception
    {
        Connection conn = null;
        ResultSet resultset = null;
        try
        {
            conn = ServiceManager.getSession().getConnection();
            String sql = ServiceManager.getObjectTypeFactory().getInstance(soureBO).getMapingEnty();
            resultset = ServiceManager.getDataStore().retrieve(conn, sql, parameter);
            return (BOUmSubscriberBean[]) ServiceManager.getDataStore().crateDtaContainerFromResultSet(BOUmSubscriberBean.class, BOUmSubscriberBean.getObjectTypeStatic(), resultset, null, true);
        }
        catch (Exception e)
        {
            throw e;
        }
        finally
        {
            if (resultset != null)
            {
                resultset.close();
            }
            if (conn != null)
            {
                conn.close();
            }
        }
    }

    public static BOUmSubscriberBean[] getBeansFromSql(String sql, Map parameter) throws Exception
    {
        Connection conn = null;
        ResultSet resultset = null;
        try
        {
            conn = ServiceManager.getSession().getConnection();
            resultset = ServiceManager.getDataStore().retrieve(conn, sql, parameter);
            return (BOUmSubscriberBean[]) ServiceManager.getDataStore().crateDtaContainerFromResultSet(BOUmSubscriberBean.class, BOUmSubscriberBean.getObjectTypeStatic(), resultset, null, true);
        }
        catch (Exception e)
        {
            throw e;
        }
        finally
        {
            if (resultset != null)
            {
                resultset.close();
            }
            if (conn != null)
            {
                conn.close();
            }
        }
    }

    public static java.math.BigDecimal getNewId() throws Exception
    {
        return ServiceManager.getIdGenerator().getNewId(BOUmSubscriberBean.getObjectTypeStatic());
    }

    public static Timestamp getSysDate() throws Exception
    {
        return ServiceManager.getIdGenerator().getSysDate(BOUmSubscriberBean.getObjectTypeStatic());
    }

    public static BOUmSubscriberBean wrap(DataContainerInterface source, Map colMatch, boolean canModify)
    {
        try
        {
            return (BOUmSubscriberBean) DataContainerFactory.wrap(source, BOUmSubscriberBean.class, colMatch, canModify);
        }
        catch (Exception e)
        {
            if (e.getCause() != null)
            {
                throw new RuntimeException(e.getCause());
            }
            else
            {
                throw new RuntimeException(e);
            }
        }
    }

    public static BOUmSubscriberBean copy(DataContainerInterface source, Map colMatch, boolean canModify)
    {
        try
        {
            BOUmSubscriberBean result = new BOUmSubscriberBean();
            DataContainerFactory.copy(source, result, colMatch);
            return result;
        }
        catch (AIException ex)
        {
            if (ex.getCause() != null)
            {
                throw new RuntimeException(ex.getCause());
            }
            else
            {
                throw new RuntimeException(ex);
            }
        }
    }

    public static BOUmSubscriberBean transfer(IBOUmSubscriberValue value)
    {
        if (value == null)
        {
            return null;
        }
        try
        {
            if (value instanceof BOUmSubscriberBean)
            {
                return (BOUmSubscriberBean) value;
            }
            BOUmSubscriberBean newBean = new BOUmSubscriberBean();

            DataContainerFactory.transfer(value, newBean);
            return newBean;
        }
        catch (Exception ex)
        {
            if (ex.getCause() != null)
            {
                throw new RuntimeException(ex.getCause());
            }
            else
            {
                throw new RuntimeException(ex);
            }
        }
    }

    public static BOUmSubscriberBean[] transfer(IBOUmSubscriberValue[] value)
    {
        if (value == null || value.length == 0)
        {
            return null;
        }

        try
        {
            if (value instanceof BOUmSubscriberBean[])
            {
                return (BOUmSubscriberBean[]) value;
            }
            BOUmSubscriberBean[] newBeans = new BOUmSubscriberBean[value.length];
            for (int i = 0; i < newBeans.length; i++)
            {
                newBeans[i] = new BOUmSubscriberBean();
                DataContainerFactory.transfer(value[i], newBeans[i]);
            }
            return newBeans;
        }
        catch (Exception ex)
        {
            if (ex.getCause() != null)
            {
                throw new RuntimeException(ex.getCause());
            }
            else
            {
                throw new RuntimeException(ex);
            }
        }
    }

    public static void save(IBOUmSubscriberValue aValue) throws Exception
    {
        save(transfer(aValue));
    }

    public static void save(IBOUmSubscriberValue[] aValues) throws Exception
    {
        save(transfer(aValues));
    }

    public static void saveBatch(IBOUmSubscriberValue[] aValues) throws Exception
    {
        saveBatch(transfer(aValues));
    }
}
