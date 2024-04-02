package 工具包;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import i_工程文件夹.i_选项;
import 中层工具.i_查询学生列表;
import 辅助工具包.stu;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.security.interfaces.RSAKey;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class GUI_学生信息查询 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	String stuid;
	String stuname;
	String classname;
	int classid;
	String classstrid;
	String institute;
	int achievement;
	String achievementstr;
	JButton btnNewButton_1;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_学生信息查询 frame = new GUI_学生信息查询();
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
	public GUI_学生信息查询() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 752, 488);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("\u8BF7\u8F93\u5165\u5B66\u53F7\uFF1A");
		lblNewLabel.setBounds(21, 83, 152, 40);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("\u8BF7\u70B9\u51FB\u67E5\u8BE2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				i_查询学生列表 cx = new i_查询学生列表();
				ArrayList<stu> allstuList = cx.stucx(textField.getText());
				for (stu stu : allstuList) {
					stuid = stu.getStuID();
					stuname = stu.getStuname();
					classname = stu.getClassname();
					classid = stu.getClassID();
					classstrid = Integer.toString(classid);
					institute = stu.getInstitute();
					achievement = stu.getAchievement();
					achievementstr = Integer.toString(achievement);
				}
				textField_1.setText(stuname);
				textField_2.setText(classname);
				textField_3.setText(stuid);
				textField_4.setText(classstrid);
				textField_5.setText(achievementstr);
				textField_6.setText(institute);
			}
		});
		btnNewButton.setBounds(493, 85, 153, 37);
		contentPane.add(btnNewButton);

		textField = new JTextField();
		textField.setBounds(195, 86, 260, 35);
		contentPane.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("\u67E5\u8BE2\u7ED3\u679C\u4E3A\uFF1A");
		lblNewLabel_1.setBounds(21, 142, 221, 29);
		contentPane.add(lblNewLabel_1);

		textField_1 = new JTextField();
		textField_1.setBounds(134, 192, 126, 35);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("\u59D3\u540D");
		lblNewLabel_2.setBounds(21, 195, 108, 29);
		contentPane.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("\u4E0A\u8BFE\u73ED\u7EA7");
		lblNewLabel_3.setBounds(21, 260, 108, 29);
		contentPane.add(lblNewLabel_3);

		textField_2 = new JTextField();
		textField_2.setBounds(134, 257, 126, 35);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("\u5B66\u53F7");
		lblNewLabel_4.setBounds(281, 195, 108, 29);
		contentPane.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("\u4E0A\u8BFE\u7F16\u53F7");
		lblNewLabel_5.setBounds(281, 260, 108, 29);
		contentPane.add(lblNewLabel_5);

		textField_3 = new JTextField();
		textField_3.setBounds(400, 192, 126, 35);
		contentPane.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBounds(400, 257, 126, 35);
		contentPane.add(textField_4);
		textField_4.setColumns(10);

		JLabel lblNewLabel_6 = new JLabel("\u8BFE\u7A0B\u6210\u7EE9");
		lblNewLabel_6.setBounds(21, 323, 108, 29);
		contentPane.add(lblNewLabel_6);

		textField_5 = new JTextField();
		textField_5.setBounds(134, 320, 126, 35);
		contentPane.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblNewLabel_7 = new JLabel("\u6240\u5728\u5B66\u9662");
		lblNewLabel_7.setBounds(281, 323, 108, 29);
		contentPane.add(lblNewLabel_7);

		textField_6 = new JTextField();
		textField_6.setBounds(400, 320, 126, 35);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("\u5B66\u751F\u6210\u7EE9\u67E5\u8BE2");
		lblNewLabel_8.setBounds(249, 21, 152, 44);
		contentPane.add(lblNewLabel_8);
		
		btnNewButton_1 = new JButton("\u8FD4\u56DE");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(645, 0, 81, 54);
		contentPane.add(btnNewButton_1);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1) {
			i_选项 stu = new i_选项();
			this.setVisible(false);
		}
	}
}
