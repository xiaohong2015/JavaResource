import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FrameFrameClock extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int x, y, x0, y0, r, h, olds_x, olds_y, oldm_x, oldm_y, oldh_x, oldh_y, ss,
			mm, hh, old_m, old_h, ang;
	final double RAD = Math.PI / 180;

	public FrameFrameClock() {
		super("FrameClock by kikiwawa");
		setDefaultCloseOperation(3);
		setSize(200, 200);
		setBackground(Color.BLACK);
		setLocation(300, 150);
		setResizable(false);
		setVisible(true);
		int delay = 1000;

		ActionListener drawFrameClock = new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				repaint();
			}
		};

		new Timer(delay, drawFrameClock).start();
	}

	public void actionPerformed(ActionEvent e) {
	}

	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g;
		Insets insets = getInsets();
		int L = insets.left / 2, T = insets.top / 2;
		h = getSize().height;
		g.setColor(Color.white);

		g2D.setStroke(new BasicStroke(4.0f));
		g.drawOval(L + 40, T + 40, h - 80, h - 80);
		r = h / 2 - 40;
		x0 = 40 + r - 5 + L;
		y0 = 40 + r - 5 - T;
		ang = 60;

		for (int i = 1; i <= 12; i++) {
			x = (int) ((r + 10) * Math.cos(RAD * ang) + x0);
			y = (int) ((r + 10) * Math.sin(RAD * ang) + y0);
			g.drawString("" + i, x, h - y);
			ang -= 30;
		}

		Calendar now = new GregorianCalendar();
		int nowh = now.get(Calendar.HOUR_OF_DAY);
		int nowm = now.get(Calendar.MINUTE);
		int nows = now.get(Calendar.SECOND);
		String st;
		if (nowh < 10)
			st = "0" + nowh;
		else
			st = "" + nowh;
		if (nowm < 10)
			st += ":0" + nowm;
		else
			st += ":" + nowm;
		if (nows < 10)
			st += ":0" + nows;
		else
			st += ":" + nows;

		g.setColor(Color.pink);
		g.fillRect(L, T, 50, 28);
		g.setColor(Color.blue);
		g.drawString(st, L + 2, T + 26);

		ss = 90 - nows * 6;
		mm = 90 - nowm * 6;
		hh = 90 - nowh * 30 - nowm / 2;
		x0 = r + 40 + L;
		y0 = r + 40 + T;

		if (olds_x > 0) {
			g.setColor(getBackground());
			g.drawLine(x0, y0, olds_x, h - olds_y);
		} else {
			old_m = mm;
			old_h = hh;
		}

		x = (int) (r * 0.9 * Math.cos(RAD * ss)) + x0;
		y = (int) (r * 0.9 * Math.sin(RAD * ss)) + y0 - 2 * T;
		g.setColor(Color.yellow);
		g.drawLine(x0, y0, x, h - y);
		olds_x = x;
		olds_y = y;
		g2D.setStroke(new BasicStroke(2.2f));

		if (old_m != mm) {
			g.setColor(getBackground());
			g.drawLine(x0, y0, oldm_x, h - oldm_y);
		}

		x = (int) (r * 0.7 * Math.cos(RAD * mm)) + x0;
		y = (int) (r * 0.7 * Math.sin(RAD * mm)) + y0 - 2 * T;
		g.setColor(Color.green);
		g.drawLine(x0, y0, x, h - y);
		oldm_x = x;
		oldm_y = y;
		old_m = mm;
		g2D.setStroke(new BasicStroke(3.4f));

		if (old_h != hh) {
			g.setColor(getBackground());
			g.drawLine(x0, y0, oldh_x, h - oldh_y);
		}

		x = (int) (r * 0.5 * Math.cos(RAD * hh)) + x0;
		y = (int) (r * 0.5 * Math.sin(RAD * hh)) + y0 - 2 * T;
		g.setColor(Color.red);
		g.drawLine(x0, y0, x, h - y);
		oldh_x = x;
		oldh_y = y;
		old_h = hh;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FrameFrameClock c = new FrameFrameClock();
	}

}
