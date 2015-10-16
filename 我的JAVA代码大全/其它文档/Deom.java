package mypage;
//import java.lang.Object;
//import java.lang.String;
//import java.lang.StringBuffer;
import java.lang.Math;
//import java.util.AbstractCollection;
//import java.util.Vector;
//import java.util.AbstractList;
//import java.text.DecimalFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Deom {
	public static void main(String[] sags){
		Date a = new Date();
		SimpleDateFormat f = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		String str = f.format(a);
    	System.out.println("现在系统时间为："+str);
    	long lg1 = Math.round(-11.5);
    	long lg2 = Math.round(11.5);
    	System.out.println("lg1="+lg1+"\t"+"lg2=:"+lg2);
    	
	}
}
