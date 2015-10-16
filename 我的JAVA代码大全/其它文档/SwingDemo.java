package swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

public class SwingDemo extends JFrame {
	JButton button=new JButton("�ύ������Ϣ");
	JTextField name=new JTextField(12);//���������ı���
	JPasswordField password=new JPasswordField();
	//�����Ա�ѡ��
	JRadioButton rabSexM=new JRadioButton("��",true);
	JRadioButton rabSexF=new JRadioButton("Ů");
	//�������ø�ѡ��
	JCheckBox c1=new JCheckBox("���",true);
	JCheckBox c2=new JCheckBox("����");
	JCheckBox c3=new JCheckBox("�˶�");
	JCheckBox c4=new JCheckBox("����");
	JCheckBox c5=new JCheckBox("����");
	//����ѧ���б��
	String [] s1={"��ʿ","˶ʿ","����","ר��","����","����"};
	JList list1=new JList(s1);
	
	//���ó��������Ͽ�
	JComboBox cobyear =new JComboBox();
	//���ó����·���Ͽ�
	JComboBox cobmonth=new JComboBox();
	
	//���������ı���
	JTextArea txtResume=new JTextArea("���������");
	
	public SwingDemo(){	
		this.setTitle("��Ա��Ϣ�ɼ�");
		this.setSize(350, 300);//���ÿ�ܴ�С
		this.setVisible(true);//��ܿɼ���Ϊ��
		this.add(button,BorderLayout.SOUTH);//�Ѱ�ť��ӵ����
		name.setText("����������");
		name.setBackground(Color.cyan);
		password.setBackground(Color.cyan);
		password.setText("����������");
		
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();//��ȡ��Ļ�ߴ�
		int w=dim.width;//��Ļ�Ŀ�
		int h=dim.height;//��Ļ�ĸ�
		this.setLocation((w-350)/2, (h-300)/2);//�������ƶ�����Ļ�м�
		
		ButtonGroup group=new ButtonGroup();//Ϊ��ѡ��ť�����飬ʵ�ֵ�ѡ
		group.add(rabSexM);//����ť��ӵ�����
		group.add(rabSexF);//����ť��ӵ�����
		JPanel sex=new JPanel();//�������sex�����ڷ��õ�ѡ��ť
		sex.add(rabSexM);
		sex.add(rabSexF);
		rabSexF.setHorizontalAlignment(SwingConstants.RIGHT);//ˮƽ�Ҷ���
		
		JPanel hobby=new JPanel();//����hobby���ڷ��ø�ѡ��ť
		hobby.add(c1);
		hobby.add(c2);
		hobby.add(c3);
		hobby.add(c4);
		hobby.add(c5);
		
		//����ѧ���б��ʵ�ֹ���
		list1.setSelectedIndex(2);
		list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list1.setBackground(Color.cyan);
		list1.setSelectionBackground(Color.yellow);
		list1.setBorder(BorderFactory.createLineBorder(Color.black));//���ñ߽�����ɫ
		JScrollPane lp=new JScrollPane(list1);
		lp.setPreferredSize(new Dimension(80,80));//���ù������Ĵ�С
		
		//���ó��������Ͽ򣬼������
		for(int j=1960;j<2000;j++)
			cobyear.addItem(Integer.toString(j));
		cobyear.setSelectedIndex(20);//����Ĭ�����
		cobyear.setBackground(Color.cyan);
		//���ó����·���Ͽ򣬼����·�
		for(int j=1;j<13;j++)
			cobmonth.addItem(Integer.toString(j));
		cobmonth.setSelectedIndex(0);//����Ĭ���·�
		cobmonth.setBackground(Color.cyan);
		//������������Ͽ����birth���
		JPanel birth =new JPanel();
		birth.add(cobyear);
		birth.add(new JLabel("��"));
		birth.add(cobmonth);
		birth.add(new JLabel("��"));
		
		//���ü����ı�������ɫ
		txtResume.setBackground(Color.cyan);
		txtResume.setLineWrap(true);
		//Ϊ�ı������ӹ�������ͨ�������������ʵ��
		JScrollPane jp=new JScrollPane(txtResume,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jp.setPreferredSize(new Dimension(150,80));
		
		String title[]={"����","����","�Ա�","��������","����","����","ѧ��"};
		JLabel jb[]=new JLabel[7];
		for(int i=0;i<7;i++){
			jb[i]=new JLabel(title[i]);
		}
		JPanel jNorth=new JPanel();
		jNorth.add(jb[0]); jNorth.add(name);
		jNorth.add(jb[1]); jNorth.add(password);
		JPanel jCenter=new JPanel();
		jCenter.add(jb[2]); jCenter.add(sex);
		jCenter.add(jb[3]); jCenter.add(birth);
		jCenter.add(jb[4]); jCenter.add(hobby);
		jCenter.add(jb[5]); jCenter.add(jp);
		jCenter.add(jb[6]); jCenter.add(lp);
		this.add(jNorth,BorderLayout.NORTH);
		this.add(jCenter,BorderLayout.CENTER);
	}
	public static void main(String[] args){
		//ʹ�����µ�SWING���
		JFrame.setDefaultLookAndFeelDecorated(true);
		new SwingDemo();
	}

}
