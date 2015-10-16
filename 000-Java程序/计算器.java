import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class One {	
	private JFrame f = null;
	private JTextField textField = null;
	private JButton[] btn1 = new JButton[10], btn2 = new JButton[4];
	private JButton btn3 = null, btn4 = null;
	private String s1 = new String("0"), s2 = new String("0"), s3 = new String("#");
	private Integer i, j;
	
	// 构造函数
	One(){
		madeFrame();
	}
	
	// 数字按钮事件
	private class Btn1 implements ActionListener {
		public void actionPerformed( ActionEvent e ){
			textField.setText( textField.getText() + e.getActionCommand() );
		}
	}
	
	private class Btn2 implements ActionListener {
		public void actionPerformed( ActionEvent e ){
			if( textField.getText().trim().equals("") ){
				s1 = "0";
			}
			else{
				s1 = textField.getText();
				s3 = e.getActionCommand();
			}
			textField.setText("");
		}
	}
	
	private class Btn3 implements ActionListener {
		public void actionPerformed( ActionEvent e ){
			
			if( textField.getText().trim().equals("") ){
				s2 = "0";
			}
			else{
				s2 = textField.getText();
			}
			
			i = Integer.parseInt( s1 );
			j = Integer.parseInt( s2 );
						
			if( s3 == "+" ){
				i = i + j;
			}
			else{
				if( s3 == "-" ){
					i = i - j;
				}
				else{
					if( s3 == "*" ){
						i = i * j;
					}
					else
						if( s3 == "/" ){
							i = i / j;
						}
						else{
							System.out.println("What the ……!!");
							i = 0;
						}
				}
			}
			
			s1 = String.valueOf( i );
			s2 = "0";
			s3 = "#";
			textField.setText( s1 );
		}
	}
	
	private class Btn4 implements ActionListener {
		public void actionPerformed( ActionEvent e ){
			s1 = "0";
			s2 = "0";
			textField.setText("");
		}
	}

	public void madeFrame(){
		
		// 建立窗口
		f = new JFrame();
		f.setTitle("小洪");
		f.setBounds( 250,  250,  1000,  100 );
		f.setLayout( new FlowLayout( FlowLayout.CENTER ) );
		
		// 建立 编辑框
		textField = new JTextField( "", 10 );
	//	textField.setBounds(10, 10, 10, 10 );
		f.add( textField );
		
		// 数字按钮
		for( i = 0; i < 10; i++ ){
			s1 = String.valueOf( i );
			btn1[i] = new JButton("");
			btn1[i].setText( s1 );
	//		btn1[i].setBounds(10+i,  10+i,  50,  50);
			btn1[i].addActionListener( new Btn1() );
			f.add( btn1[i] );
		}
		
		
		// 加减乘除
		for( i = 0; i < 4; i++ ){
			btn2[i] = new JButton("");
	//		btn2[i].setBounds( 20*i, 20*i, 50, 50 );
			btn2[i].addActionListener( new Btn2() );
			f.add( btn2[i] );
		}
		btn2[0].setText("+");
		btn2[1].setText("-");
		btn2[2].setText("*");
		btn2[3].setText("/");
		
		// 输入输出
		btn3 = new JButton("");
		btn3.setText("结果");
	//	btn3.setBounds(100,  100,  50,  50 );
		btn3.addActionListener( new Btn3() );
		f.add( btn3 );
		
		btn4 = new JButton("");
		btn4.setText("清空");
	//	btn4.setBounds( 50, 50, 50, 50 );
		btn4.addActionListener( new Btn4() );
		f.add( btn4 );
						
		// 打开窗口
		f.setResizable( false );
		f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		f.setVisible( true );
	}
	
	public static void main( String[] args ){
		new One();
	}
}
