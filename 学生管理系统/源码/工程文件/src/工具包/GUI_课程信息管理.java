package 工具包;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import i_工程文件夹.i_选项;
import 中层工具.i_全局课程查询;
import 中层工具.i_查询课程信息;
import 辅助工具包.sclass;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class GUI_课程信息管理 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	String classID1 ;
	String classname ;
	String teaname ;
	String institute;
	JButton btnNewButton_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_课程信息管理 frame = new GUI_课程信息管理();
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
	public GUI_课程信息管理() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 688, 628);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8BFE\u7A0B\u4FE1\u606F\u67E5\u8BE2");
		lblNewLabel.setBounds(223, 21, 153, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u8BFE\u7A0B\u53F7");
		lblNewLabel_1.setBounds(21, 87, 108, 29);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(150, 84, 253, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("\u8BF7\u70B9\u51FB\u67E5\u8BE2");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i_查询课程信息 kc = new i_查询课程信息();
				ArrayList<sclass> classList = kc.stukc(textField.getText());
				for (sclass sclass : classList) {
					classID1 = sclass.getClassID();
					classname = sclass.getClassname();
					teaname = sclass.getTeaname();
					institute = sclass.getInstitute();
				}
				textField_1.setText(classname);
				textField_2.setText(teaname);
				textField_3.setText(classID1);
				textField_4.setText(institute);
			}
		});
		btnNewButton.setBounds(424, 83, 153, 37);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("\u67E5\u8BE2\u7ED3\u679C\uFF1A");
		lblNewLabel_2.setBounds(21, 181, 160, 29);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\u8BFE\u7A0B\u540D");
		lblNewLabel_3.setBounds(21, 242, 108, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("\u4EFB\u8BFE\u8001\u5E08");
		lblNewLabel_4.setBounds(21, 307, 108, 29);
		contentPane.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(144, 239, 160, 35);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(144, 304, 160, 35);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(469, 239, 160, 35);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\u8BFE\u7A0BID");
		lblNewLabel_5.setBounds(340, 242, 108, 29);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("\u6240\u5C5E\u5B66\u9662");
		lblNewLabel_6.setBounds(340, 307, 108, 29);
		contentPane.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(469, 304, 160, 35);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		btnNewButton_1 = new JButton("\u8FD4\u56DE");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(554, 0, 108, 50);
		contentPane.add(btnNewButton_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(21, 409, 608, 127);
		contentPane.add(textArea);
		
		JButton btnNewButton_2 = new JButton("\u67E5\u8BE2\u6240\u6709\u8BFE\u7A0B");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				i_全局课程查询 qkc = new i_全局课程查询();
				ArrayList<sclass> allclassList = qkc.stuqkc();	
				for (sclass sclass : allclassList) {
					classID1 = sclass.getClassID();
					classname = sclass.getClassname();
					teaname = sclass.getTeaname();
					institute = sclass.getInstitute();
					textArea.append(classID1+"   "+classname+"   "+teaname+"   "+institute+"\n");
				}
				
			}
		});
		btnNewButton_2.setBounds(424, 360, 177, 37);
		contentPane.add(btnNewButton_2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_1 ) {
			i_选项 xx = new i_选项();
			this.setVisible(false);
			
		}
		
	}
	
}
