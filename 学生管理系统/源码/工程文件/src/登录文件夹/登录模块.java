package ��¼�ļ���;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import i_�����ļ���.i_ѡ��;
import �ײ㹤��.Lianjie;

public class ��¼ģ�� extends JFrame implements ActionListener{
	private JPanel p ;
	private JLabel lblwen;
	private JButton signin;
	private �����ļ����԰� sidow;
	
	public ��¼ģ��() {
		super("��¼ģ��");
		p = new JPanel(null);
		lblwen = new JLabel("��ӭ����ѧ���ɼ�����ϵͳ��");
		signin = new JButton("��������");
		
		signin.addActionListener(this);
		
		lblwen.setBounds(50, 30, 600, 50);
		signin.setBounds(65, 75, 120, 25);
		
		p.add(lblwen);
		p.add(signin);
		// �������ӵ�������
		this.add(p);

		// �趨���ڴ�С
		this.setSize(280, 220);
		// �趨�������Ͻ����꣨X��200���أ�Y��100���أ�
		this.setLocation(200, 100);
		// �趨����Ĭ�Ϲرշ�ʽΪ�˳�Ӧ�ó���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô��ڿ��ӣ���ʾ��
		this.setVisible(true);	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == signin) {
			sidow = new �����ļ����԰�();
			int x = this.getBounds().x;
			int y = this.getBounds().y;
			sidow.setLocation(x, y);
			sidow.setVisible(true);
			this.setVisible(false);
		}
	}
	
	public static void main(String[] args) {
		new ��¼ģ��();
	}
}



class �����ļ����԰� extends JFrame implements ActionListener {

	// �������
	private JPanel p;
	private JLabel lblName, lblPwd;
	// ����һ���ı���
	private JTextField txtName;
	private JPasswordField txtPwd;
	// �������������
	private JButton btnzc, btndl;

	public �����ļ����԰�() {
		super("�û�ע���¼");
		// ������壬���Ĳ���ΪNULL
		p = new JPanel(null);
		// ʵ����5����ǩ
		lblName = new JLabel("ѧ      ��");
		lblPwd = new JLabel("��      ��");
		// ����һ������Ϊ20���ı���
		txtName = new JTextField(20);
		// ������������򣬳���20
		txtPwd = new JPasswordField(20);

		// ����������ť
		btnzc = new JButton("ע��");
		btndl = new JButton("��¼");

		// ע�ᰴť���¼�����
		btnzc.addActionListener(this);

		// ȡ����ť���¼�����
		btndl.addActionListener(this);

		// ��λ�������
		lblName.setBounds(30, 30, 60, 25);
		txtName.setBounds(95, 30, 120, 25);
		lblPwd.setBounds(30, 60, 60, 25);
		txtPwd.setBounds(95, 60, 120, 25);
		btnzc.setBounds(30, 100, 60, 25);
		btndl.setBounds(150, 100, 60, 25);

		// �������ӵ�����
		p.add(lblName);
		p.add(txtName);
		p.add(lblPwd);
		p.add(txtPwd);

		p.add(btnzc);
		p.add(btndl);

		// �������ӵ�������
		this.add(p);

		// �趨���ڴ�С
		this.setSize(280, 220);
		// �趨�������Ͻ����꣨X��200���أ�Y��100���أ�
		this.setLocation(200, 100);
		// �趨����Ĭ�Ϲرշ�ʽΪ�˳�Ӧ�ó���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		String driver = "com.mysql.jdbc.Driver";
//		String url = "jdbc:mysql://localhost:3306/tongxun";
//		String user = "root";
//		String password = "123456";
//		Connection conn = null;
		Statement stmt = null;
		ResultSet rSet = null;

		try {
//			Class.forName(driver);// 1
//			conn = DriverManager.getConnection(url, user, password);// 2
			Connection conn = new Lianjie().getConnection();// ������Lianjie������
			stmt = conn.createStatement();// 3
			String name = txtName.getText();
			String psw = txtPwd.getText();

			if (e.getSource() == btnzc) {
				String cxsql = "select ID from user";

				rSet = stmt.executeQuery("select ID,PASSWORD from user where ID='" + name + "'");
				if (rSet.next()) {
					JOptionPane.showMessageDialog(p, "���û��Ѵ���");
				} else if (psw.equals("")) {
					JOptionPane.showMessageDialog(p, "���벻��Ϊ��");
				}else {
					String crsql = "insert into user(ID,PASSWORD) values('" + name + "','" + psw + "')";
					stmt.executeUpdate(crsql);
					JOptionPane.showMessageDialog(p, "ע��ɹ����û���Ϣ�ѱ���");
					txtName.setText("");
					txtPwd.setText("");
				}
			}
			if (e.getSource() == btndl) {
				rSet = stmt.executeQuery("select ID,PASSWORD from user where ID='" + name + "'");
				if (rSet.next()) {
					if ((rSet.getString("PASSWORD")).equals(psw)) {
						JOptionPane.showMessageDialog(p, "��½�ɹ�");
						i_ѡ�� singin = new i_ѡ��();
						this.setVisible(false);						
					} else {
						JOptionPane.showMessageDialog(p, "��¼ʧ�ܣ���˶��û�����");
					}
				} else {
					JOptionPane.showMessageDialog(p, "���û�������");
				}
			}
			rSet.close();
			stmt.close();
			conn.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}


