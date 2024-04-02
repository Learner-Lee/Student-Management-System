package 中层工具;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import 底层工具.Lianjie;
import 辅助工具包.stu;
import 辅助工具包.su;

//public class i_超管登录 {
//	public ArrayList<su> sudo(String name , String pwd){
//		ArrayList<su> arraysList = new ArrayList<su>();
//		PreparedStatement ps = null;// ps用于发送动态sql语句
//		ResultSet rs = null;// rs用于存储查询结果
//		String selectsql = "SELECT * FROM su where name = ? and pwd = ?";
//		Connection conn = new Lianjie().getConnection();// 建立与lianjie的关系
//				
//		try {
//			ps = conn.prepareStatement(selectsql);
//			ps.setString(1, name);
//			ps.setString(2, pwd);
//			rs = ps.executeQuery();
//			while (rs.next()) {
//				String namesj = rs.getString("name");
//				String pwdsj = rs.getString("pwd");
//
//				su su = new su();
//				su.setPwd(pwdsj);
//				su.setName(namesj);
//				arraysList.add(su);
//			}
//			
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return arraysList;		
//	}
//	
//}

public class i_超管登录 {
	public su sudo(String name , String pwd){
		//ArrayList<su> arraysList = new ArrayList<su>();
		PreparedStatement ps = null;// ps用于发送动态sql语句
		ResultSet rs = null;// rs用于存储查询结果
		String selectsql = "SELECT * FROM su where name = ? and pwd = ?";
		Connection conn = new Lianjie().getConnection();// 建立与lianjie的关系
		su s = new su();		
		try {
			ps = conn.prepareStatement(selectsql);
			ps.setString(1, name);
			ps.setString(2, pwd);
			rs = ps.executeQuery();
			while (rs.next()) {
				String namesj = rs.getString("name");
				String pwdsj = rs.getString("pwd");

				
				s.setPwd(pwdsj);
				s.setName(namesj);
				//arraysList.add(su);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//return arraysList;	
		return s;
	}
	
}
