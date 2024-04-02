package �в㹤��;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import �ײ㹤��.Lianjie;
import �������߰�.sclass;
import �������߰�.stu;

public class i_��ѯ�γ���Ϣ {
	public ArrayList<sclass> stukc(String classID) {
		ArrayList<sclass> arrays = new ArrayList<sclass>();
		PreparedStatement ps = null;// ps���ڷ��Ͷ�̬sql���
		ResultSet rs = null;// rs���ڴ洢��ѯ���
		String selectsql = "SELECT * FROM class where classID = ?";
		Connection conn = new Lianjie().getConnection();// ������lianjie�Ĺ�ϵ
		try {
			ps = conn.prepareStatement(selectsql);
			ps.setString(1, classID);
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



