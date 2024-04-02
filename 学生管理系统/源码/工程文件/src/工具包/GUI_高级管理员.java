package 工具包;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import i_工程文件夹.i_选项;
import 中层工具.i_超管登录;
import 底层工具.Lianjie;
import 辅助工具包.su;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class GUI_高级管理员 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	JButton btnNewButton;
	JButton btnNewButton_1;
	String pwdsj ;
	String namesj;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_高级管理员 frame = new GUI_高级管理员();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI_高级管理员() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("\u8FD4\u56DE");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(343, 0, 81, 37);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u8D85\u7EA7\u7BA1\u7406\u5458\u767B\u5F55\u7A97\u53E3");
		lblNewLabel.setBounds(103, 10, 219, 46);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u7528   \u6237");
		lblNewLabel_1.setBounds(43, 78, 108, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u5BC6   \u7801");
		lblNewLabel_2.setBounds(43, 134, 108, 29);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(158, 75, 202, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnNewButton_1 = new JButton("\u767B\u5F55");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(132, 184, 153, 37);
		contentPane.add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(158, 131, 202, 35);
		contentPane.add(passwordField);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton) {
			i_选项 xx = new i_选项();
			this.setVisible(false);
		}
		if (e.getSource() == btnNewButton_1) {
			String strName = textField.getText();
			String strPwd = new String(passwordField.getPassword());
			
			if (strName == null || strName.equals("")) {
				JOptionPane.showMessageDialog(contentPane,"用户名不能为空！","注意",JOptionPane.ERROR_MESSAGE);
				return;
			}
			// 获取用户输入的密码
			
			
			if (strPwd == null || strPwd.equals("")) {
				JOptionPane.showMessageDialog(contentPane,"密码不能为空！","注意",JOptionPane.ERROR_MESSAGE);
				return;
			}
			
			 
			 i_超管登录 sd= new i_超管登录();
			 su s= sd.sudo(strName, strPwd);
//			 for (su su : arrayList) {
//				String namesj = su.getName();
//				String pwdsj = su.getPwd();
//			System.out.println(s.getName());
//			System.out.println(s.getPwd());
			
			 if (strName.equals(s.getName())) {
				 if (strPwd.equals(s.getPwd()) ){
					 JOptionPane.showMessageDialog(contentPane, "登陆成功");
					 JOptionPane.showMessageDialog(contentPane,"1>尊重他人的隐私"+"\n2>三思而后行"+"\n3>能力越大，责任越大","注意",JOptionPane.INFORMATION_MESSAGE);
					 GUI_校方课程信息编辑 xiaofang = new GUI_校方课程信息编辑();
					 this.setVisible(false);	
					 xiaofang.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(contentPane, "登录失败，请核对用户密码");
				}				
			}else {
				JOptionPane.showMessageDialog(contentPane, "该用户不存在");
			}
			 }
//			 rSet = stmt.executeQuery("select ID,PASSWORD from user where ID='" + name + "'");
//				if (rSet.next()) {
//					if ((rSet.getString("PASSWORD")).equals(psw)) {
//						JOptionPane.showMessageDialog(contentPane, "登陆成功");
//						i_选项 singin = new i_选项();
//						this.setVisible(false);						
//					} else {
//						JOptionPane.showMessageDialog(contentPane, "登录失败，请核对用户密码");
//					}
//				} else {
//					JOptionPane.showMessageDialog(contentPane, "该用户不存在");
//				}
		}
	//}
}
