package 中层工具;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import 底层工具.Lianjie;
import 辅助工具包.sclass;

public class i_全局课程查询 {
	public ArrayList<sclass> stuqkc() {
		ArrayList<sclass> arrays = new ArrayList<sclass>();
		PreparedStatement ps = null;// ps用于发送动态sql语句
		ResultSet rs = null;// rs用于存储查询结果
		String selectsql = "SELECT * FROM class ";
		Connection conn = new Lianjie().getConnection();// 建立与lianjie的关系
		try {
			ps = conn.prepareStatement(selectsql);
			rs = ps.executeQuery();
			while (rs.next()) {
				String classID1 = rs.getString("classID");
				String classname = rs.getString("classname");
				String teaname = rs.getString("teaname");
				String institute = rs.getString("institute");
				
				
				sclass sclass = new sclass();
				sclass.setClassID(classID1);
				sclass.setClassname(classname);
				sclass.setTeaname(teaname);
				sclass.setInstitute(institute);
				arrays.add(sclass);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (ps != null)
					ps.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return arrays;

	}

}
