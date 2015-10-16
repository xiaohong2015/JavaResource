

import java.util.Scanner;

public class MyCalender {

	//�ж�����
	public static boolean isLeapYear(int year){
//		�ж����ꣻ
		if((year%4==0 && year%100!=0)||(year%400==0))
			return true;
		else
			return false;
	}
	
	//	��ȡmonth�·ݵ�����monthdays��	
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
		//����month��year��totaldays��monthdays��days��day����
		int month;  //Ҫ��ѯ���·�
		int year;      //Ҫ��ѯ�����
		int monthdays = 0; //Ҫ��ѯ�·ݵ�������
		int days=0;      //1�·���month-1�·ݵ�������
		int day;       //���ڣ�1~6��ʾ����һ����������0��ʾ������
		long totaldays=0;//1900�굽year-1���������
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ҫ��ѯ����ݣ�");
		year = sc.nextInt();
		System.out.println("������Ҫ��ѯ���·ݣ�");
		month = sc.nextInt();		
		
		//��1900�굽year-1���������totaldays��
		for(int i=1900; i<year; i++)
			if(isLeapYear(i))
				totaldays = totaldays+366;
			else
				totaldays+=365;
		
		//��1�·���month-1�·�������days��
		for(int i=1; i<month; i++){				
			days = days+getMonthdays(i,isLeapYear(year));
		}			
		
		//����Ҫ��ѯ�·ݵĵ�1�������ڼ�day��
		day = (int) ((totaldays+days+1)%7);
		//��ӡ������
		System.out.println("������\t����һ\t���ڶ�\t������\t������\t������\t������");
		for(int i=0;i<day;i++)
			System.out.print("\t");
		for(int i=1;i<=getMonthdays(month,isLeapYear(year)) ;i++){
			System.out.print(i+"\t");
			if((day+i)%7==0)
				System.out.println();
		}
		
	}

}
