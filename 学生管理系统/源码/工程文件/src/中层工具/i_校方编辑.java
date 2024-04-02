package 中层工具;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import 底层工具.Lianjie;
import 辅助工具包.sclass;

public class i_校方编辑 {
	public void  stucbj(String classID,String classname,String teaname,String institute) {
		PreparedStatement ps = null;// ps用于发送动态sql语句
		String insertsql = "INSERT INTO class(classID,classname,teaname,institute)  VALUES(?,?,?,?);";  
		Connection conn = new Lianjie().getConnection();// 建立与lianjie的关系
		try {
			ps = conn.prepareStatement(insertsql);
			ps.setString(1, classID);
			ps.setString(2, classname);
			ps.setString(3, teaname);
			ps.setString(4, insertsql);
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
	
	public void stucsc(String classID) {
		PreparedStatement ps = null;// ps用于发送动态sql语句 
		ResultSet rSet = null;
		String deletesql = "DELETE FROM class WHERE classID = ?";
		Connection conn = new Lianjie().getConnection();// 建立与lianjie的关系
		try {
			ps = conn.prepareStatement(deletesql);	
			ps.setString(1, classID);
			int i=ps.executeUpdate();
			if(i>0)
				JOptionPane.showMessageDialog(null, "成功删除");		
			else {
				JOptionPane.showMessageDialog(null, "删除失败");
			}
//			rSet = ps.executeQuery("select classID from class where ID='" + classID + "'");
//			if (rSet.next()) {
//										
//			}else {
//				JOptionPane.showMessageDialog(null, "成功删除");
//			}
			
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "删除失败");
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
