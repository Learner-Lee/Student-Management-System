package �в㹤��;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import �ײ㹤��.Lianjie;
import �������߰�.stu;
import �������߰�.su;

//public class i_���ܵ�¼ {
//	public ArrayList<su> sudo(String name , String pwd){
//		ArrayList<su> arraysList = new ArrayList<su>();
//		PreparedStatement ps = null;// ps���ڷ��Ͷ�̬sql���
//		ResultSet rs = null;// rs���ڴ洢��ѯ���
//		String selectsql = "SELECT * FROM su where name = ? and pwd = ?";
//		Connection conn = new Lianjie().getConnection();// ������lianjie�Ĺ�ϵ
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

public class i_���ܵ�¼ {
	public su sudo(String name , String pwd){
		//ArrayList<su> arraysList = new ArrayList<su>();
		PreparedStatement ps = null;// ps���ڷ��Ͷ�̬sql���
		ResultSet rs = null;// rs���ڴ洢��ѯ���
		String selectsql = "SELECT * FROM su where name = ? and pwd = ?";
		Connection conn = new Lianjie().getConnection();// ������lianjie�Ĺ�ϵ
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
