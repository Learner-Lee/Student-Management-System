package i_�����ļ���;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import ���߰�.GUI_ѧ����Ϣ¼��;
import ���߰�.GUI_ѧ����Ϣ��ѯ;
import ���߰�.GUI_�γ���Ϣ����;
import ���߰�.GUI_�߼�����Ա;

public class i_ѡ�� extends JFrame implements ActionListener{
	private JPanel p ;
	private JLabel lblwen1,lblwen2,lblwen3,lblwen4;
	private JButton butnxs , butnkc ,butnxq ,butncj;
	public i_ѡ��() {
		super("ѡ��ģ��");
		p = new JPanel(new GridLayout(4, 2,20,10));
		lblwen1 = new JLabel("��ѯѧ����Ϣ");
		butnxs = new JButton("��������");
		lblwen2 = new JLabel("��ѯ�γ���Ϣ");
		butnkc = new JButton("��������");
		lblwen3 = new JLabel("У���γ���Ϣ�༭");
		butnxq = new JButton("��������");
		lblwen4 = new JLabel("ѧ����Ϣ¼��");
		butncj = new JButton("��������");
				

		
		p.add(lblwen1);
		p.add(lblwen2);
		p.add(butnxs);
		p.add(butnkc);
		p.add(lblwen3);
		p.add(lblwen4);
		p.add(butnxq);
		p.add(butncj);
		// �������ӵ�������
		this.add(p);

		// �趨���ڴ�С
		this.setSize(300, 220);
		// �趨�������Ͻ����꣨X��200���أ�Y��100���أ�
		this.setLocation(200, 100);
		// �趨����Ĭ�Ϲرշ�ʽΪ�˳�Ӧ�ó���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ���ô��ڿ��ӣ���ʾ��
		this.setVisible(true);	

		butnxs.addActionListener(this);
		butnkc.addActionListener(this);
		butnxq.addActionListener(this);
		butncj.addActionListener(this);
		
		//butnxs.addActionListener(new ActionListener() {
		
			
//			public void actionPerformed(ActionEvent e) {
//				if (e.getSource() == butnxs) {
//					GUI_ѧ����Ϣ���� stuxs = new GUI_ѧ����Ϣ����();
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
			GUI_ѧ����Ϣ��ѯ stuxs = new GUI_ѧ����Ϣ��ѯ();
			stuxs.setVisible(true);
			this.setVisible(false);
		}
		
		if (e.getSource() == butnkc) {
			GUI_�γ���Ϣ���� stukc = new GUI_�γ���Ϣ����();
			stukc.setVisible(true);
			this.setVisible(false);
		}
		
		if (e.getSource() == butnxq) {
			GUI_�߼�����Ա guanli = new GUI_�߼�����Ա();
			guanli.setVisible(true);
			this.setVisible(false);
		}
		
		if (e.getSource() == butncj) {
			GUI_ѧ����Ϣ¼�� luru = new GUI_ѧ����Ϣ¼��();
			luru.setVisible(true);
			this.setVisible(false);
		}	
	}
	
	
	public static void main(String[] args) {
		new i_ѡ��();
	}




}


