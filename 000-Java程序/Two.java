import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;

public class Two {	
	private JFrame f = null;
	private JTextField textField = null;
	private JButton[] btn1 = new JButton[10], btn2 = new JButton[4];
	private JButton btn3 = null, btn4 = null;
	private String s1 = new String("0"), s2 = new String("0"), s3 = new String("#");
	private Integer i, j;
//	private Container C = getContentPane();
	private JPanel p1 = new JPanel();
	
	// ���캯��
	Two(){
		madeFrame();
	}
	

	public void madeFrame(){
		
		// ��������
		f = new JFrame();
		f.setTitle("С��");
		f.setBounds( 500,  200, 500,  500 );
	//	f.setLayout( new FlowLayout( FlowLayout.CENTER ) );
		
		// ���� �༭��
		textField = new JTextField( "", 10 );
		textField.setBounds( 25, 5, 200, 30 );
		f.add( textField );
		
		// ���ְ�ť
//		C.add( p1 );
		btn1[7].setBounds( 30,  50,  45,  45 );
		btn1[8].setBounds( 80,  50,  45,  45 );
		btn1[9].setBounds( 130,  50,  45,  45 );
		btn1[4].setBounds( 30,  100,  45,  45 );
		btn1[5].setBounds( 80,  100,  45,  45 );
		btn1[6].setBounds( 130,  100,  45,  45 );
		btn1[1].setBounds( 30,  150,  45,  45 );
		btn1[2].setBounds( 80,  150,  45,  45 );
		btn1[3].setBounds( 130,  150,  45,  45 );
		btn1[0].setBounds( 80,  200,  45,  45 );
		for( i = 0; i < 10; i++ ){
			s1 = String.valueOf( i );
			btn1[i] = new JButton("");
			btn1[i].setText( s1 );
			p1.add( btn1[i] );
		}
		f.add( p1 );
		
		
		// �Ӽ��˳�
		for( i = 0; i < 4; i++ ){
			btn2[i] = new JButton("");
			f.add( btn2[i] );
		}
		btn2[0].setText("+");
		btn2[1].setText("-");
		btn2[2].setText("*");
		btn2[3].setText("/");
		btn1[0].setBounds( 180,  50,  45,  45 );
		btn1[1].setBounds( 180,  100,  45,  45 );
		btn1[2].setBounds( 180,  150,  45,  45 );
		btn1[3].setBounds( 180,  200,  45,  45 );
		
		// �������
		btn3 = new JButton("");
		btn3.setText("���");
		btn3.setBounds( 60,  130,  50,  50 );
		f.add( btn3 );
		
		btn4 = new JButton("");
		btn4.setText("���");
		btn4.setBounds( 80, 130, 30, 30 );
	//	btn4.setPreferredSize( new Dimension( 50, 50 ) );
		f.add( btn4 );
						
		// �򿪴���
		f.setResizable( false );
		f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		f.setVisible( true );
	}
	
	public static void main( String[] args ){
		new Two();
	}
}
