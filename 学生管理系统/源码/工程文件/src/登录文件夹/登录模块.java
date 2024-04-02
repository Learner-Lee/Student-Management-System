package 登录文件夹;

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

import i_工程文件夹.i_选项;
import 底层工具.Lianjie;

public class 登录模块 extends JFrame implements ActionListener{
	private JPanel p ;
	private JLabel lblwen;
	private JButton signin;
	private 工程文件测试版 sidow;
	
	public 登录模块() {
		super("登录模块");
		p = new JPanel(null);
		lblwen = new JLabel("欢迎进入学生成绩管理系统！");
		signin = new JButton("请点击进入");
		
		signin.addActionListener(this);
		
		lblwen.setBounds(50, 30, 600, 50);
		signin.setBounds(65, 75, 120, 25);
		
		p.add(lblwen);
		p.add(signin);
		// 将面板添加到窗体中
		this.add(p);

		// 设定窗口大小
		this.setSize(280, 220);
		// 设定窗口左上角坐标（X轴200像素，Y轴100像素）
		this.setLocation(200, 100);
		// 设定窗口默认关闭方式为退出应用程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口可视（显示）
		this.setVisible(true);	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == signin) {
			sidow = new 工程文件测试版();
			int x = this.getBounds().x;
			int y = this.getBounds().y;
			sidow.setLocation(x, y);
			sidow.setVisible(true);
			this.setVisible(false);
		}
	}
	
	public static void main(String[] args) {
		new 登录模块();
	}
}



class 工程文件测试版 extends JFrame implements ActionListener {

	// 声明组件
	private JPanel p;
	private JLabel lblName, lblPwd;
	// 声明一个文本框
	private JTextField txtName;
	private JPasswordField txtPwd;
	// 声明两个密码框
	private JButton btnzc, btndl;

	public 工程文件测试版() {
		super("用户注册登录");
		// 创建面板，面板的布局为NULL
		p = new JPanel(null);
		// 实例化5个标签
		lblName = new JLabel("学      号");
		lblPwd = new JLabel("密      码");
		// 创建一个长度为20的文本框
		txtName = new JTextField(20);
		// 创建两个密码框，长度20
		txtPwd = new JPasswordField(20);

		// 创建两个按钮
		btnzc = new JButton("注册");
		btndl = new JButton("登录");

		// 注册按钮的事件处理
		btnzc.addActionListener(this);

		// 取消按钮的事件处理
		btndl.addActionListener(this);

		// 定位所有组件
		lblName.setBounds(30, 30, 60, 25);
		txtName.setBounds(95, 30, 120, 25);
		lblPwd.setBounds(30, 60, 60, 25);
		txtPwd.setBounds(95, 60, 120, 25);
		btnzc.setBounds(30, 100, 60, 25);
		btndl.setBounds(150, 100, 60, 25);

		// 将组件添加到面中
		p.add(lblName);
		p.add(txtName);
		p.add(lblPwd);
		p.add(txtPwd);

		p.add(btnzc);
		p.add(btndl);

		// 将面板添加到窗体中
		this.add(p);

		// 设定窗口大小
		this.setSize(280, 220);
		// 设定窗口左上角坐标（X轴200像素，Y轴100像素）
		this.setLocation(200, 100);
		// 设定窗口默认关闭方式为退出应用程序
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
			Connection conn = new Lianjie().getConnection();// 建立与Lianjie的连接
			stmt = conn.createStatement();// 3
			String name = txtName.getText();
			String psw = txtPwd.getText();

			if (e.getSource() == btnzc) {
				String cxsql = "select ID from user";

				rSet = stmt.executeQuery("select ID,PASSWORD from user where ID='" + name + "'");
				if (rSet.next()) {
					JOptionPane.showMessageDialog(p, "该用户已存在");
				} else if (psw.equals("")) {
					JOptionPane.showMessageDialog(p, "密码不能为空");
				}else {
					String crsql = "insert into user(ID,PASSWORD) values('" + name + "','" + psw + "')";
					stmt.executeUpdate(crsql);
					JOptionPane.showMessageDialog(p, "注册成功，用户信息已保存");
					txtName.setText("");
					txtPwd.setText("");
				}
			}
			if (e.getSource() == btndl) {
				rSet = stmt.executeQuery("select ID,PASSWORD from user where ID='" + name + "'");
				if (rSet.next()) {
					if ((rSet.getString("PASSWORD")).equals(psw)) {
						JOptionPane.showMessageDialog(p, "登陆成功");
						i_选项 singin = new i_选项();
						this.setVisible(false);						
					} else {
						JOptionPane.showMessageDialog(p, "登录失败，请核对用户密码");
					}
				} else {
					JOptionPane.showMessageDialog(p, "该用户不存在");
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


