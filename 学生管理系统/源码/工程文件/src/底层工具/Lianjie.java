package µ×²ã¹¤¾ß;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Lianjie {
    private static String driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/student_management_system?useUnicode=true&characterEncoding=utf-8";
    private static String user = "root";
    private static String password = "123456";
    Connection conn = null;//
	public Connection getConnection(){
	    
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url,user,password);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	return conn;
	}
}
