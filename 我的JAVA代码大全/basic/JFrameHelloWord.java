import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrameHelloWord {
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("JFrame��ʾ");//���ڿ�
		JPanel pane = new JPanel();//���
		JLabel label = new JLabel("��һ����ѧϰ�������������");//���ֱ�ǩ
		pane.add(label);//���������ӱ�ǩ
		frame.setContentPane(pane);//���ڿ��������������pane
		frame.setSize(300,200);//���ô�С
		frame.setVisible(true);	//���ڿ����ÿɼ���Ϊ��
	}

}
