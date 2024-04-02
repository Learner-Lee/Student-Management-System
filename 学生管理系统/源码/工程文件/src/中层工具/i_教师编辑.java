package 中层工具;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import 底层工具.Lianjie;

public class i_教师编辑 {
	public void  stucbj(String name,String nameID,String classname,String classID,String institute,String achievement) {
		PreparedStatement ps = null;// ps用于发送动态sql语句
		String insertsql = "INSERT INTO student01(name,nameID,classname,classID,institute,achievement) VALUES(?,?,?,?,?,?);";  
		Connection conn = new Lianjie().getConnection();// 建立与lianjie的关系
		try {
			ps = conn.prepareStatement(insertsql);
			ps.setString(1, name);
			ps.setString(2, nameID);
			ps.setString(3, classID);
			ps.setString(4, classname);
			ps.setString(5, institute);
			ps.setString(6, achievement);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "成功插入");

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "插入失败");
			e.printStackTrace();
			
		} finally {
			try {
				if (ps != null)
					ps.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
