package notepad;
/*仿照记事本的GUI编写一个java 简易的记事本程序。只要部分菜单及界面，每个菜单不超过四个菜单项，具体
 * 功能除“退出”外均不实现
 */
import java.awt.event.*;

import javax.swing.*;

public class NotePad extends JFrame {
	private JMenuBar mnb = new JMenuBar();
	private JMenu mnFile = new JMenu(" 文件（H）");
	private JMenuItem mniNew = new JMenuItem("新建");
	private JMenuItem mniOpen = new JMenuItem("打开");
	private JMenuItem mniView = new JMenuItem("页面设置");
	private JMenuItem mniExit = new JMenuItem("退出");
	
	private JMenu mnEdit = new JMenu(" 编辑");
	private JMenuItem mniZ = new JMenuItem("撤销");
	private JMenuItem mniC = new JMenuItem("复制");
	private JMenuItem mniV = new JMenuItem("粘贴");
	private JMenuItem mniFind = new JMenuItem("查找");
	
	private JMenu mnFormat = new JMenu(" 格式");
	private JCheckBoxMenuItem mniLine = new JCheckBoxMenuItem("自动换行");
	private JMenuItem mniFont = new JMenuItem("字体");
	
	private JMenu mnHelp = new JMenu("帮助");
	private JMenuItem mniHelp = new JMenuItem("帮助主题");
	private JMenuItem mniAbout= new JMenuItem("关于记事本");
	
	private JPanel pn1 = new JPanel();
	
	private JTextArea txtShow = new JTextArea();
	
	
	public  NotePad(){
		super("我的记事本");
		setJMenuBar(mnb);
		add(txtShow);
		
		mnFile.add(mniNew);
		mnFile.add(mniOpen);
		mnFile.addSeparator();
		
		mnFile.add(mniView);
		mnFile.addSeparator();
		
		mnFile.add(mniExit);
		mniExit.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
				
			}
		});
		
		mnb.add(mnFile);
		
		mnEdit.add(mniZ);
		mnEdit.addSeparator();
		
		mnEdit.add(mniC);
		mnEdit.add(mniV);
		mnEdit.addSeparator();
		
		mnEdit.add(mniFind);
		
		mnb.add(mnEdit);
		mnb.add(mniLine);
		mnFormat.add(mniFont);
		
		mnb.add(mniFont);
		mnHelp.add(mniHelp);
		mnHelp.addSeparator();
		
		mnHelp.add(mniAbout);
		mnb.add(mnHelp);
		
	}
	public static void main(String[] args){
		NotePad xx = new NotePad();
		xx.setBounds(30,30,450,360);
		xx.setVisible(true);
		
	}
}