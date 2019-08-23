package jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DAO
{
	//static{
	//	try {
	//		Class.forName("com.mysql.jdbc.Driver");
	//	} catch (ClassNotFoundException e) {
	//		e.printStackTrace();
	//	}
	//}
	
	static Connection getConnection()throws Exception
	{
		return DriverManager.getConnection("jdbc:mysql://192.168.23.130:3306/mysql", "root", "315787");
	}
	
	public static void main(String[] args) throws Exception {

		List list = getList("SELECT * FROM `plugin`;");
		for (Object o : list)
		{
			Map rs = (Map) o;
			System.out.println(rs.toString());
		}
	}
	
	public static List getList(String sql)throws Exception
	{
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		List list = new ArrayList();
		
		try
		{
			conn = getConnection();
			st = conn.createStatement();
			rs = st.executeQuery(sql);

			ResultSetMetaData md = rs.getMetaData();
			int columnCount = md.getColumnCount();//字段总数

			while (rs.next())
			{
				Map<String,String> row = new HashMap<String, String>();
				for (int i = 1; i <= columnCount; i++)
				{
					row.put(md.getColumnName(i), rs.getString(i));
				}
				list.add(row);
			}
		}
		catch (Exception e)
		{
			throw new Exception(e);
		}
		finally
		{
			close(conn, st, rs);			
		}
		
		return list;
	}

	private static void close(Connection conn, Statement st, ResultSet rs)
	{
		if(null != rs)
			try{rs.close();}catch (Exception e){rs = null;}
		if(null != st)
			try{st.close();}catch (Exception e){st = null;}
		if(null != conn)
			try{conn.close();}catch (Exception e){conn = null;}
	}
	
	
}
