package ���߰�;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import i_�����ļ���.i_ѡ��;
import �в㹤��.i_���ܵ�¼;
import �ײ㹤��.Lianjie;
import �������߰�.su;

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

public class GUI_�߼�����Ա extends JFrame implements ActionListener{

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
					GUI_�߼�����Ա frame = new GUI_�߼�����Ա();
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
	public GUI_�߼�����Ա() {
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
			i_ѡ�� xx = new i_ѡ��();
			this.setVisible(false);
		}
		if (e.getSource() == btnNewButton_1) {
			String strName = textField.getText();
			String strPwd = new String(passwordField.getPassword());
			
			if (strName == null || strName.equals("")) {
				JOptionPane.showMessageDialog(contentPane,"�û�������Ϊ�գ�","ע��",JOptionPane.ERROR_MESSAGE);
				return;
			}
			// ��ȡ�û����������
			
			
			if (strPwd == null || strPwd.equals("")) {
				JOptionPane.showMessageDialog(contentPane,"���벻��Ϊ�գ�","ע��",JOptionPane.ERROR_MESSAGE);
				return;
			}
			
			 
			 i_���ܵ�¼ sd= new i_���ܵ�¼();
			 su s= sd.sudo(strName, strPwd);
//			 for (su su : arrayList) {
//				String namesj = su.getName();
//				String pwdsj = su.getPwd();
//			System.out.println(s.getName());
//			System.out.println(s.getPwd());
			
			 if (strName.equals(s.getName())) {
				 if (strPwd.equals(s.getPwd()) ){
					 JOptionPane.showMessageDialog(contentPane, "��½�ɹ�");
					 JOptionPane.showMessageDialog(contentPane,"1>�������˵���˽"+"\n2>��˼������"+"\n3>����Խ������Խ��","ע��",JOptionPane.INFORMATION_MESSAGE);
					 GUI_У���γ���Ϣ�༭ xiaofang = new GUI_У���γ���Ϣ�༭();
					 this.setVisible(false);	
					 xiaofang.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(contentPane, "��¼ʧ�ܣ���˶��û�����");
				}				
			}else {
				JOptionPane.showMessageDialog(contentPane, "���û�������");
			}
			 }
//			 rSet = stmt.executeQuery("select ID,PASSWORD from user where ID='" + name + "'");
//				if (rSet.next()) {
//					if ((rSet.getString("PASSWORD")).equals(psw)) {
//						JOptionPane.showMessageDialog(contentPane, "��½�ɹ�");
//						i_ѡ�� singin = new i_ѡ��();
//						this.setVisible(false);						
//					} else {
//						JOptionPane.showMessageDialog(contentPane, "��¼ʧ�ܣ���˶��û�����");
//					}
//				} else {
//					JOptionPane.showMessageDialog(contentPane, "���û�������");
//				}
		}
	//}
}
