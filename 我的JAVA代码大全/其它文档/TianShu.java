import java.util.Scanner;//导入输入流；
public class TianShu {
	/*java程序的入口方法*/
	public static void main(String [ ] args){
		System.out.print("\n");
		System.out.print("**********欢迎使用万年历查询时间**********:");
		System.out.print("\n");
		
		/*变量定义并赋初值*/
		int firstDay;
		int years,months;
		int days_1 = 0, days_2 = 0, sum_1= 0 , sum_2= 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		/*年份输入*/
		System.out.println("请输入年份:");
		years = sc.nextInt();
		
		/*判断是否是闰年*/
		if((years%4 == 0 && years%100 != 0)||(years%400 == 0)){
			System.out.print("\n" + years + "是闰年");
		}
		else{
			System.out.print("\n" + years + "是平年");
		}
		
		
		/*计算输入年份至1900年之间相隔天数*/
		for(int i = 1900 ; i < years ; i++)
		{
			if((i%4==0 && i%100!=0)||(i%400==0)){
				days_1=366;
			}
			else{
				days_1=365;
			}
			sum_1 += days_1;//sum_1统计输入年份至1900年之间相隔天数
		} 
		System.out.println(",1900年至" + years + "年共有" + sum_1 +"天");
		
		
		
		/*月份输入*/
		System.out.print("\n");
		System.out.println("请输入待查月份:");//从键盘接受月份;
		months= sc.nextInt();
		
		/*计算输入月份的天数*/
		for(int j = 1; j< months ; j++) {
			if(j == 2){
				if((years%4==0 && years%100!=0)||(years%400==0)){
					sum_2 += 29;//闰年二月29天；
				}
				else{
					sum_2 += 28;//平年二月28天；
				}
			}else if(j==4 || j==6 || j==9 || j==11){
				sum_2 += 30;    //4、6、9、11月有30天；
			}else{
				sum_2 += 31;   //其他月份都为30天；
			}	
		}
		
		
		/*判断每月的天数*/
		if(months == 2){
			if((years%4==0 && years%100!=0)||(years%400==0)){
				days_2 = 29;	
			}
			else{
				days_2 = 28;
			}

		}
		else if(months==4 || months==6 || months==9 ||months==11){
			days_2 = 30;	
		}
		else{
			days_2 = 31;
		}
		
		
		sum = sum_1 + sum_2;//计算总共天数
		System.out.print("\n");
		System.out.println( "截止" + years+ "年" + months + "月初共有" + sum_2 + "天");
		
		
		System.out.print("\n");
		System.out.println("星期日" + "\t星期一" + "\t星期二" + "\t星期三" + "\t星期四" + "\t星期五" + "\t星期六"  + "\n");
		
		firstDay = 1 + sum % 7;//1900年1月1日是星期一,该语句功能输出每月第一天是星期几;
		for(int k = 1 ; k <= firstDay ;k++){
			System.out.print("\t");//输出每月日历第一行的空格数;
		}
		
		
		
		for(int m = 1 ; m <= days_2 ; m++){
			System.out.print(m + "\t");
			/*0表示星期日,1~6表示星期一至星期六,如果是星期六,则输出一个换行符*/
			if((sum + m )% 7 == 6){
				System.out.print("\n");
			}		
		}	
	}
}
