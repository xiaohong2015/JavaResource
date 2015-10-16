import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


/**
 * @author IronMan
 *
 * 2014-12-16
 * 下午4:45:39
 */
public class TestSwing extends JPanel{

	static final int WIDTH= 300;
	static final int HEIGHT=300;
	JFrame loginFrame;
	
	TestSwing() {
		loginFrame= new JFrame("Swing world !");
		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridBagLayout lay= new GridBagLayout();
		setLayout(lay);
		loginFrame.add(this, BorderLayout.WEST);
		loginFrame.setSize(WIDTH, HEIGHT);
		
		// 获取电脑屏幕参数
		Toolkit kit= Toolkit.getDefaultToolkit();
		Dimension screenSize= kit.getScreenSize();
		int width= screenSize.width;
		int height= screenSize.height;
		int x= (width- WIDTH)/ 2;
		int y= (height- HEIGHT)/ 2;
		loginFrame.setLocation(x, y);
		
		JButton login= new JButton("login");
		JButton exit = new JButton("exit");
		
		JLabel title= new JLabel("Welcome to the system !");
		JLabel username= new JLabel("username");
		JLabel password= new JLabel("password");
		
		JTextField usernameIn= new JTextField(15);
		JTextField passwordIn= new JTextField(15);
		
		GridBagConstraints c = new GridBagConstraints();
		c.fill= GridBagConstraints.NONE;
		c.anchor= GridBagConstraints.EAST;
		c.weightx= 3;
		c.weighty= 4;
		
		c.gridx= 0;
		c.gridy= 0;
		c.gridwidth = 4;
		c.gridheight= 1;
		add(login, c);
		
		c.gridx= 0;
		c.gridy= 1;
		c.gridwidth = 1;
		c.gridheight= 1;
		add(username, c);
		
		c.gridx= 0;
		c.gridy= 1;
		c.gridwidth= 2;
		c.gridheight= 2;
		add(usernameIn, c);
		
		loginFrame.setResizable(false);
		loginFrame.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TestSwing t = new TestSwing();
	}

}
