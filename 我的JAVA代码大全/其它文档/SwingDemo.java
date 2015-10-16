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
	JButton button=new JButton("提交个人信息");
	JTextField name=new JTextField(12);//创建姓名文本框
	JPasswordField password=new JPasswordField();
	//建立性别单选框
	JRadioButton rabSexM=new JRadioButton("男",true);
	JRadioButton rabSexF=new JRadioButton("女");
	//建立爱好复选框
	JCheckBox c1=new JCheckBox("逛街",true);
	JCheckBox c2=new JCheckBox("旅游");
	JCheckBox c3=new JCheckBox("运动");
	JCheckBox c4=new JCheckBox("看书");
	JCheckBox c5=new JCheckBox("上网");
	//建立学历列表框
	String [] s1={"博士","硕士","本科","专科","高中","其他"};
	JList list1=new JList(s1);
	
	//设置出生年份组合框
	JComboBox cobyear =new JComboBox();
	//设置出身月份组合框
	JComboBox cobmonth=new JComboBox();
	
	//创建简历文本区
	JTextArea txtResume=new JTextArea("请输入简历");
	
	public SwingDemo(){	
		this.setTitle("会员信息采集");
		this.setSize(350, 300);//设置框架大小
		this.setVisible(true);//框架可见性为真
		this.add(button,BorderLayout.SOUTH);//把按钮添加到框架
		name.setText("请输入姓名");
		name.setBackground(Color.cyan);
		password.setBackground(Color.cyan);
		password.setText("请输入密码");
		
		Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();//获取屏幕尺寸
		int w=dim.width;//屏幕的宽
		int h=dim.height;//屏幕的高
		this.setLocation((w-350)/2, (h-300)/2);//将窗体移动到屏幕中间
		
		ButtonGroup group=new ButtonGroup();//为单选按钮定义组，实现单选
		group.add(rabSexM);//将按钮添加到组中
		group.add(rabSexF);//将按钮添加到组中
		JPanel sex=new JPanel();//简历面板sex，用于放置单选按钮
		sex.add(rabSexM);
		sex.add(rabSexF);
		rabSexF.setHorizontalAlignment(SwingConstants.RIGHT);//水平右对齐
		
		JPanel hobby=new JPanel();//建立hobby用于放置复选按钮
		hobby.add(c1);
		hobby.add(c2);
		hobby.add(c3);
		hobby.add(c4);
		hobby.add(c5);
		
		//设置学历列表框，实现滚动
		list1.setSelectedIndex(2);
		list1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list1.setBackground(Color.cyan);
		list1.setSelectionBackground(Color.yellow);
		list1.setBorder(BorderFactory.createLineBorder(Color.black));//设置边界线颜色
		JScrollPane lp=new JScrollPane(list1);
		lp.setPreferredSize(new Dimension(80,80));//设置滚动面板的大小
		
		//设置出生年份组合框，加入年份
		for(int j=1960;j<2000;j++)
			cobyear.addItem(Integer.toString(j));
		cobyear.setSelectedIndex(20);//设置默认年份
		cobyear.setBackground(Color.cyan);
		//设置出生月份组合框，加入月份
		for(int j=1;j<13;j++)
			cobmonth.addItem(Integer.toString(j));
		cobmonth.setSelectedIndex(0);//设置默认月份
		cobmonth.setBackground(Color.cyan);
		//将出生年月组合框放入birth面板
		JPanel birth =new JPanel();
		birth.add(cobyear);
		birth.add(new JLabel("年"));
		birth.add(cobmonth);
		birth.add(new JLabel("月"));
		
		//设置简历文本区背景色
		txtResume.setBackground(Color.cyan);
		txtResume.setLineWrap(true);
		//为文本区附加滚动条，通过建立滚动面板实现
		JScrollPane jp=new JScrollPane(txtResume,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jp.setPreferredSize(new Dimension(150,80));
		
		String title[]={"姓名","密码","性别","出生年月","爱好","简历","学历"};
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
		//使用最新的SWING外观
		JFrame.setDefaultLookAndFeelDecorated(true);
		new SwingDemo();
	}

}
