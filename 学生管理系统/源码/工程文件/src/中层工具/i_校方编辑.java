package �в㹤��;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import �ײ㹤��.Lianjie;
import �������߰�.sclass;

public class i_У���༭ {
	public void  stucbj(String classID,String classname,String teaname,String institute) {
		PreparedStatement ps = null;// ps���ڷ��Ͷ�̬sql���
		String insertsql = "INSERT INTO class(classID,classname,teaname,institute)  VALUES(?,?,?,?);";  
		Connection conn = new Lianjie().getConnection();// ������lianjie�Ĺ�ϵ
		try {
			ps = conn.prepareStatement(insertsql);
			ps.setString(1, classID);
			ps.setString(2, classname);
			ps.setString(3, teaname);
			ps.setString(4, insertsql);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "�ɹ�����");

		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "����ʧ��");
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
		PreparedStatement ps = null;// ps���ڷ��Ͷ�̬sql��� 
		ResultSet rSet = null;
		String deletesql = "DELETE FROM class WHERE classID = ?";
		Connection conn = new Lianjie().getConnection();// ������lianjie�Ĺ�ϵ
		try {
			ps = conn.prepareStatement(deletesql);	
			ps.setString(1, classID);
			int i=ps.executeUpdate();
			if(i>0)
				JOptionPane.showMessageDialog(null, "�ɹ�ɾ��");		
			else {
				JOptionPane.showMessageDialog(null, "ɾ��ʧ��");
			}
//			rSet = ps.executeQuery("select classID from class where ID='" + classID + "'");
//			if (rSet.next()) {
//										
//			}else {
//				JOptionPane.showMessageDialog(null, "�ɹ�ɾ��");
//			}
			
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "ɾ��ʧ��");
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
