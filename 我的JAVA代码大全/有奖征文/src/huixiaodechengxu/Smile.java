package huixiaodechengxu;

import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Smile extends JFrame {
    int x1 = 175, y1 = 165;
    int x2 = 60, y2 = 60;
    int x3 = 100, y34 = 150;
    int x4= 230, h34 =25;
    int x5 =140, y5 =160;
    int h5 =100, f=0;
    public void showFrame() {
        this.setSize(860, 660);
        this.setLocation(50, 50);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setVisible(true);
        new paintThread().start();
    }
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("程序猿", x1, y1);
        g.drawOval(x2, y2, 260, 260);
        g.fillOval(x3, y34, 60, h34);
        g.fillOval(x4, y34, 60, h34);
        g.drawArc(x5, y5, 100, h5, 0, -180);
    }

    public void move() {
        h34--;//让眼睛的高度不断发生变化形成眨眼效果
        if(h34==5)
        h34=25;
        h5--;
        if(h5==80)
            h5=100;
        if(f==0){//右下
            x1+=2;y1+=2;x2+=2;
            y2+=2;x3+=2;x4+=2;
            y34+=2;x5+=2;y5+=2;
        }
        if(f==1){//左下
            x1-=2;y1+=2;x2-=2;
            y2+=2;x3-=2;x4-=2;
            y34+=2;x5-=2;y5+=2;
        }
        if(f==2){//左上
            x1-=2;y1-=2;x2-=2;
            y2-=2;x3-=2;x4-=2;
            y34-=2;x5-=2;y5-=2;
        }
        if(f==3){//右上
            x1+=2;y1-=2;x2+=2;
            y2-=2;x3+=2;x4+=2;
            y34-=2;x5+=2;y5-=2;
        }
        if(x2<10){
            if(f==1){
                f=0;
            }else{
                f=3;
            }
        }
        if(x2>590){
            if(f==3){
                f=2;
            }else{
                f=1;
            }
        }
        if(y2<30){
            if(f==3){
                f=0;
            }else{
                f=1;
            }
        }
        if(y2>390){
            if(f==0){
                f=3;
            }else{
                f=2;
            }
        }
    }

    public static void main(String[] args) {
        Smile t = new Smile();
        t.showFrame();
    }

    class paintThread extends Thread {
        public void run() {
            while (true) {
                move();
                try {
                    sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                repaint();
            }
        }
    }
}
