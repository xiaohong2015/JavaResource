import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class one {
	public static void main( String[] args ){
		new Form();
		System.out.println("haha");
	}
}

class Form{
	public Form(){
		JFrame f = new JFrame("Ð¡ºé");
		f.setSize( 300, 400 );
		f.setLocation( 300, 300 );
		f.setBackground( Color.blue );
		f.setResizable( false );
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener( new Fir() );
		f.add( btn1 );
		
		JTextField ed = new JTextField( 20 );
		ed.setSize( 10, 5 );
		ed.setEnabled( true );
		ed.setText( btn1.getText() );
		f.add( ed );
		
		f.setVisible( true );
	}
}

class Fir implements ActionListener {
	Fir(){
		System.out.println("11");
	}
	public void actionPerformed ( ActionEvent e ){
		System.out.println("555");
	}
}
