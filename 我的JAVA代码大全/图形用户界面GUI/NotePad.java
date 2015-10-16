package notepad;
/*���ռ��±���GUI��дһ��java ���׵ļ��±�����ֻҪ���ֲ˵������棬ÿ���˵��������ĸ��˵������
 * ���ܳ����˳��������ʵ��
 */
import java.awt.event.*;

import javax.swing.*;

public class NotePad extends JFrame {
	private JMenuBar mnb = new JMenuBar();
	private JMenu mnFile = new JMenu(" �ļ���H��");
	private JMenuItem mniNew = new JMenuItem("�½�");
	private JMenuItem mniOpen = new JMenuItem("��");
	private JMenuItem mniView = new JMenuItem("ҳ������");
	private JMenuItem mniExit = new JMenuItem("�˳�");
	
	private JMenu mnEdit = new JMenu(" �༭");
	private JMenuItem mniZ = new JMenuItem("����");
	private JMenuItem mniC = new JMenuItem("����");
	private JMenuItem mniV = new JMenuItem("ճ��");
	private JMenuItem mniFind = new JMenuItem("����");
	
	private JMenu mnFormat = new JMenu(" ��ʽ");
	private JCheckBoxMenuItem mniLine = new JCheckBoxMenuItem("�Զ�����");
	private JMenuItem mniFont = new JMenuItem("����");
	
	private JMenu mnHelp = new JMenu("����");
	private JMenuItem mniHelp = new JMenuItem("��������");
	private JMenuItem mniAbout= new JMenuItem("���ڼ��±�");
	
	private JPanel pn1 = new JPanel();
	
	private JTextArea txtShow = new JTextArea();
	
	
	public  NotePad(){
		super("�ҵļ��±�");
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