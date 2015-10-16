

import java.util.Scanner;

public class MyCalender {

	//判断闰年
	public static boolean isLeapYear(int year){
//		判断闰年；
		if((year%4==0 && year%100!=0)||(year%400==0))
			return true;
		else
			return false;
	}
	
	//	获取month月份的天数monthdays；	
	public static int getMonthdays(int month,boolean flag){
		int monthdays=0;
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: monthdays=31;break;
		case 4:
		case 6:
		case 9:
		case 11:monthdays=30;break;
		case 2:
			if(flag)
				monthdays = 29;
			else
				monthdays = 28;
			break;
		}
		return monthdays;
	}
	
	
	public static void main(String[] args) {
		//定义month、year、totaldays、monthdays、days、day变量
		int month;  //要查询的月份
		int year;      //要查询的年份
		int monthdays = 0; //要查询月份的总天数
		int days=0;      //1月份至month-1月份的总天数
		int day;       //星期：1~6表示星期一至星期六，0表示星期日
		long totaldays=0;//1900年到year-1年的总天数
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要查询的年份：");
		year = sc.nextInt();
		System.out.println("请输入要查询的月份：");
		month = sc.nextInt();		
		
		//求1900年到year-1年的总天数totaldays；
		for(int i=1900; i<year; i++)
			if(isLeapYear(i))
				totaldays = totaldays+366;
			else
				totaldays+=365;
		
		//求1月份至month-1月份总天数days；
		for(int i=1; i<month; i++){				
			days = days+getMonthdays(i,isLeapYear(year));
		}			
		
		//求所要查询月份的第1天是星期几day；
		day = (int) ((totaldays+days+1)%7);
		//打印日历。
		System.out.println("星期日\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");
		for(int i=0;i<day;i++)
			System.out.print("\t");
		for(int i=1;i<=getMonthdays(month,isLeapYear(year)) ;i++){
			System.out.print(i+"\t");
			if((day+i)%7==0)
				System.out.println();
		}
		
	}

}
