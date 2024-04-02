package �в㹤��;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import �ײ㹤��.Lianjie;
import �������߰�.stu;

public class i_��ѯѧ���б� {
	public ArrayList<stu> stucx(String uID) {
		ArrayList<stu> arrays = new ArrayList<stu>();
		PreparedStatement ps = null;// ps���ڷ��Ͷ�̬sql���
		ResultSet rs = null;// rs���ڴ洢��ѯ���
		String selectsql = "SELECT * FROM Student01 where nameID = ?";
		Connection conn = new Lianjie().getConnection();// ������lianjie�Ĺ�ϵ
		try {
			ps = conn.prepareStatement(selectsql);
			ps.setString(1, uID);
			rs = ps.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				String nameID = rs.getString("nameID");
				String classname = rs.getString("classname");
				int classID = rs.getInt("classID");
				String institute = rs.getString("institute");
				int achievement = rs.getInt("achievement");
//				System.out.println(name + "   " + nameID + "   " + classname + "   " + classID + "   " + institute
//						+ "   " + achievement + "   ");
				stu stu2 = new stu();
				stu2.setStuID(nameID);
				stu2.setStuname(name);
				stu2.setClassname(classname);
				stu2.setClassID(classID);
				stu2.setInstitute(institute);
				stu2.setAchievement(achievement);
				
				arrays.add(stu2);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
