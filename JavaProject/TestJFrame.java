import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;



/**
 * @author IronMan
 *
 * 2014-12-16
 * 下午3:36:45
 */
public class TestJFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("static-access")
	private void TJFrame() {
		JFrame f = new JFrame("Hello JFrame");
		f.setAlwaysOnTop(true);
		f.setVisible(true);
		f.setLocation(100, 100);
		f.setBounds(100, 100, 500, 500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setDefaultLookAndFeelDecorated(true);
		f.setBackground(Color.GREEN);
		
		JLabel jlb = new JLabel("asdf");
		jlb.setBackground(Color.blue);
		jlb.setSize(10, 20);
		
		
		
		f.getContentPane().add(jlb);
	}
	
	public static void main(String[] args) {
		TestJFrame t = new TestJFrame();
		t.TJFrame();
	}

}
