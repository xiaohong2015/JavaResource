package test04;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.net.CookieHandler;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
public class Test04 {
public static void main(String args[]){
frame f=new frame(); 

//创建一个线程
Thread thread=new Thread(f);
thread.start();//启动线程
}
}
class frame extends JFrame implements Runnable{
Graphics g;
Random r=new Random();
Date date;
public frame(){
setTitle("测试");
this.show();
setSize(500,500);
Dimension screen=Toolkit.getDefaultToolkit().getScreenSize();
setLocation(screen.width /2-this.getWidth()/2,screen.height /2-this.getHeight()/2);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
g=this.getContentPane().getGraphics(); 
}
public void run() {
while(true){
try{
Thread.currentThread().sleep(1000);
}
catch(Exception ex){
}
date=new Date();
int hour=date.getHours();
int minute=date.getMinutes();
int second=date.getSeconds();
double pi=Math.PI ;
setForeground(new Color(r.nextInt(255),r.nextInt(255),r .nextInt(255)));
g.drawOval(200,200,200,200); 

//简单日期格式，用来将时间转换为制定的格式
SimpleDateFormat format=new SimpleDateFormat("yyyy年--MM月--dd日  HH时:mm分:ss秒");
g.setColor(Color.black );
g.clearRect(0,0,500,50);
g.drawString(format.format(date),10,20);
//画出表盘
g.drawString("12",300,195);
g.drawString("3",410,300);      //+minute/60.0 
g.drawString("6",300,420);
g.drawString("9",190,300);
g.setColor(Color.blue);
//秒针
 g.drawLine(300,300,300+(int )(100*Math.cos(-(second/30.0)*pi+pi/2.0)),300-(int)(100*Math.sin(-(second/30.0)*pi+pi/2.0)));
g.setColor(Color .red );
//分针
 g.drawLine(300,300,300+(int )(80*Math.cos(-(minute/30.0)*pi+pi/2.0)),300-(int)(100*Math.sin(-(minute/30.0)*pi+pi/2.0)));
 g.setColor(Color .green  );  
 //时针
 g.drawLine(300,300,300+(int )(60*Math.cos(-((hour+ minute/60.0 )/6.0)*pi+pi/2.0)),300-(int)(100*Math.sin(-((hour+minute/60.0)/6.0)*pi+pi/2.0)));
             g.fillRect(295,220,20,20 );
           g.fillOval(295,300,10,10);
             g.setColor(Color.blue);
             g.drawString(Integer.toString(date.getDay())  , 300, 232);     
}
}
} 
