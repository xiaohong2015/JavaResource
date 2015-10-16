import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class One implements ActionListener{
	private JFrame f = null;
	private JTextField textField = null;
	private JButton btn1 = null;
	public One(){
		f.setTitle("Ð¡ºé");
		f.setSize( 400, 200 );
		f.setBackground( Color.green );
		f.setLayout( new FlowLayout( FlowLayout.CENTER ) );
		
		textField.setText("");
		f.add( textField );
		
		btn1.setText("1");
		btn1.addActionListener( this );
		f.add( btn1, "EAST" );
		
		f.setResizable( false );
		f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		f.setVisible( true );
	}
	
	public void actionPerformed( ActionEvent e ){
		textField.setText("");
		textField.setText( btn1.getActionCommand() );
		System.out.println( btn1.getActionCommand() + "==" );
	}

	public static void main( String[] args ){
		new One();
	}
}
