package �в㹤��;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import �ײ㹤��.Lianjie;

public class i_��ʦ�༭ {
	public void  stucbj(String name,String nameID,String classname,String classID,String institute,String achievement) {
		PreparedStatement ps = null;// ps���ڷ��Ͷ�̬sql���
		String insertsql = "INSERT INTO student01(name,nameID,classname,classID,institute,achievement) VALUES(?,?,?,?,?,?);";  
		Connection conn = new Lianjie().getConnection();// ������lianjie�Ĺ�ϵ
		try {
			ps = conn.prepareStatement(insertsql);
			ps.setString(1, name);
			ps.setString(2, nameID);
			ps.setString(3, classID);
			ps.setString(4, classname);
			ps.setString(5, institute);
			ps.setString(6, achievement);
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
}
