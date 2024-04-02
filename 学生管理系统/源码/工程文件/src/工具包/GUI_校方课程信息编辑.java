package 工具包;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import i_工程文件夹.i_选项;
import 中层工具.i_校方编辑;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI_校方课程信息编辑 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	JButton btnNewButton;
	JButton btnNewButton_1;
	JButton btnNewButton_2;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_校方课程信息编辑 frame = new GUI_校方课程信息编辑();
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
	public GUI_校方课程信息编辑() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 814, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8BFE\u8868\u7F16\u8F91");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 30));
		lblNewLabel.setBounds(316, 34, 184, 56);
		contentPane.add(lblNewLabel);
		
		btnNewButton = new JButton("\u8FD4\u56DE");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(699, 0, 89, 56);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("\u8BFE\u7A0B\u540D");
		lblNewLabel_1.setBounds(34, 118, 108, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u4EFB\u8BFE\u8001\u5E08");
		lblNewLabel_2.setBounds(34, 202, 108, 29);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(163, 115, 184, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(163, 199, 184, 35);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\u8BFE\u7A0B\u53F7");
		lblNewLabel_3.setBounds(391, 118, 108, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u6240\u5C5E\u5B66\u9662");
		lblNewLabel_4.setBounds(391, 202, 108, 29);
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(520, 118, 184, 35);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(520, 199, 184, 35);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		btnNewButton_1 = new JButton("\u5F55\u5165");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(533, 309, 153, 37);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("\u5220\u9664");
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setBounds(533, 383, 153, 37);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_6 = new JLabel("\u5220\u9664\uFF1A  \u8BF7\u8F93\u5165\u8BFE\u7A0B\u53F7");
		lblNewLabel_6.setBounds(34, 275, 247, 29);
		contentPane.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(288, 272, 169, 35);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String classID = textField_2.getText();
		String classID2 = textField_4.getText();
		String classname = textField.getText();
		String teaname = textField_1.getText();
		String institute =  textField_3.getText();
		if (e.getSource() == btnNewButton) {
			i_选项 stu = new i_选项();
			this.setVisible(false);
		}
		if (e.getSource() == btnNewButton_1) {
			i_校方编辑 bianji = new i_校方编辑();
			bianji.stucbj(classID, classname,teaname ,institute);			
		}
		if (e.getSource() == btnNewButton_2) {
			i_校方编辑 bianji = new i_校方编辑();
			bianji.stucsc(classID2);
		}
	}
}
