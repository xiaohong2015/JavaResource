import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrameHelloWord {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("JFrame演示");//窗口框
		JPanel pane = new JPanel();//面板
		JLabel label = new JLabel("多一分钟学习，让生活更精彩");//文字标签
		pane.add(label);//在面板上添加标签
		frame.setContentPane(pane);//窗口框设置内容面板是pane
		frame.setSize(300,200);//设置大小
		frame.setVisible(true);	//窗口矿设置可见性为真
	}

}
