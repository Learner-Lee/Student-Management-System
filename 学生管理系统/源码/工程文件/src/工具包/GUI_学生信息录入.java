package 工具包;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import i_工程文件夹.i_选项;
import 中层工具.i_教师编辑;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_学生信息录入 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	JButton btnNewButton;
	JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_学生信息录入 frame = new GUI_学生信息录入();
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
	public GUI_学生信息录入() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 824, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("\u8FD4\u56DE");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(717, 0, 81, 48);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u4FE1\u606F\u5F55\u5165\u754C\u9762");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 30));
		lblNewLabel.setBounds(289, 42, 214, 48);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u59D3\u540D");
		lblNewLabel_1.setBounds(7, 128, 108, 29);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(121, 125, 126, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\u5B66\u53F7");
		lblNewLabel_2.setBounds(268, 128, 108, 29);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(382, 125, 126, 35);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u5B66\u9662");
		lblNewLabel_3.setBounds(529, 128, 108, 29);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(651, 125, 126, 35);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\u73ED\u7EA7");
		lblNewLabel_4.setBounds(7, 213, 108, 29);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(121, 210, 126, 35);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\u73ED\u7EA7\u53F7");
		lblNewLabel_5.setBounds(268, 213, 108, 29);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(382, 210, 126, 35);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("\u6210\u7EE9");
		lblNewLabel_6.setBounds(529, 213, 108, 29);
		contentPane.add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(651, 210, 126, 35);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		btnNewButton_1 = new JButton("\u5F55\u5165");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(513, 328, 153, 37);
		contentPane.add(btnNewButton_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = textField.getText();
		String nameID = textField_1.getText();
		String institute = textField_2.getText();
		String classID =  textField_3.getText();
		String classname = textField_4.getText();
		String achievement = textField_5.getText();

		if (e.getSource() == btnNewButton) {
			i_选项 stu = new i_选项();
			this.setVisible(false);
		}
		if (e.getSource() == btnNewButton_1) {
			i_教师编辑 jsbianji = new i_教师编辑();
			jsbianji.stucbj(name, nameID, classname, classID, institute, achievement);
		}
	}

}
