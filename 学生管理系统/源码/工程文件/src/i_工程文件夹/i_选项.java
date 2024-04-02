package i_工程文件夹;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import 工具包.GUI_学生信息录入;
import 工具包.GUI_学生信息查询;
import 工具包.GUI_课程信息管理;
import 工具包.GUI_高级管理员;

public class i_选项 extends JFrame implements ActionListener{
	private JPanel p ;
	private JLabel lblwen1,lblwen2,lblwen3,lblwen4;
	private JButton butnxs , butnkc ,butnxq ,butncj;
	public i_选项() {
		super("选项模块");
		p = new JPanel(new GridLayout(4, 2,20,10));
		lblwen1 = new JLabel("查询学生信息");
		butnxs = new JButton("请点击进入");
		lblwen2 = new JLabel("查询课程信息");
		butnkc = new JButton("请点击进入");
		lblwen3 = new JLabel("校方课程信息编辑");
		butnxq = new JButton("请点击进入");
		lblwen4 = new JLabel("学生信息录入");
		butncj = new JButton("请点击进入");
				

		
		p.add(lblwen1);
		p.add(lblwen2);
		p.add(butnxs);
		p.add(butnkc);
		p.add(lblwen3);
		p.add(lblwen4);
		p.add(butnxq);
		p.add(butncj);
		// 将面板添加到窗体中
		this.add(p);

		// 设定窗口大小
		this.setSize(300, 220);
		// 设定窗口左上角坐标（X轴200像素，Y轴100像素）
		this.setLocation(200, 100);
		// 设定窗口默认关闭方式为退出应用程序
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 设置窗口可视（显示）
		this.setVisible(true);	

		butnxs.addActionListener(this);
		butnkc.addActionListener(this);
		butnxq.addActionListener(this);
		butncj.addActionListener(this);
		
		//butnxs.addActionListener(new ActionListener() {
		
			
//			public void actionPerformed(ActionEvent e) {
//				if (e.getSource() == butnxs) {
//					GUI_学生信息管理 stuxs = new GUI_学生信息管理();
//					stuxs.setVisible(true);
//					this.setVisible(false);
//				}
//				
//			}
		//});
//		butnkc.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
//		butnxq.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
//		butncj.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				
//			}
//		});
	}
	
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == butnxs) {
			GUI_学生信息查询 stuxs = new GUI_学生信息查询();
			stuxs.setVisible(true);
			this.setVisible(false);
		}
		
		if (e.getSource() == butnkc) {
			GUI_课程信息管理 stukc = new GUI_课程信息管理();
			stukc.setVisible(true);
			this.setVisible(false);
		}
		
		if (e.getSource() == butnxq) {
			GUI_高级管理员 guanli = new GUI_高级管理员();
			guanli.setVisible(true);
			this.setVisible(false);
		}
		
		if (e.getSource() == butncj) {
			GUI_学生信息录入 luru = new GUI_学生信息录入();
			luru.setVisible(true);
			this.setVisible(false);
		}	
	}
	
	
	public static void main(String[] args) {
		new i_选项();
	}




}


