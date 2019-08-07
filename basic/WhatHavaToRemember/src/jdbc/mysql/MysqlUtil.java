package jdbc.mysql;

import java.sql.Connection;
import java.sql.DriverManager;



public class MysqlUtil {
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	static Connection getConnection()throws Exception{
		//wusd是数据库名  数据库用户名 密码
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/wusd", "wusd", "wusd");
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(MysqlUtil.getConnection());
	}
}
