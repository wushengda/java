package jdbc.oracle;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleUtil {
	static
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	static Connection getConnection() throws Exception{
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:dbName", "username", "password");
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(OracleUtil.getConnection());
	}
}
