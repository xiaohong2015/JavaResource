import java.util.Scanner;//������������
public class TianShu {
	/*java�������ڷ���*/
	public static void main(String [ ] args){
		System.out.print("\n");
		System.out.print("**********��ӭʹ����������ѯʱ��**********:");
		System.out.print("\n");
		
		/*�������岢����ֵ*/
		int firstDay;
		int years,months;
		int days_1 = 0, days_2 = 0, sum_1= 0 , sum_2= 0, sum = 0;
		Scanner sc = new Scanner(System.in);
		
		/*�������*/
		System.out.println("���������:");
		years = sc.nextInt();
		
		/*�ж��Ƿ�������*/
		if((years%4 == 0 && years%100 != 0)||(years%400 == 0)){
			System.out.print("\n" + years + "������");
		}
		else{
			System.out.print("\n" + years + "��ƽ��");
		}
		
		
		/*�������������1900��֮���������*/
		for(int i = 1900 ; i < years ; i++)
		{
			if((i%4==0 && i%100!=0)||(i%400==0)){
				days_1=366;
			}
			else{
				days_1=365;
			}
			sum_1 += days_1;//sum_1ͳ�����������1900��֮���������
		} 
		System.out.println(",1900����" + years + "�깲��" + sum_1 +"��");
		
		
		
		/*�·�����*/
		System.out.print("\n");
		System.out.println("����������·�:");//�Ӽ��̽����·�;
		months= sc.nextInt();
		
		/*���������·ݵ�����*/
		for(int j = 1; j< months ; j++) {
			if(j == 2){
				if((years%4==0 && years%100!=0)||(years%400==0)){
					sum_2 += 29;//�������29�죻
				}
				else{
					sum_2 += 28;//ƽ�����28�죻
				}
			}else if(j==4 || j==6 || j==9 || j==11){
				sum_2 += 30;    //4��6��9��11����30�죻
			}else{
				sum_2 += 31;   //�����·ݶ�Ϊ30�죻
			}	
		}
		
		
		/*�ж�ÿ�µ�����*/
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
		
		
		sum = sum_1 + sum_2;//�����ܹ�����
		System.out.print("\n");
		System.out.println( "��ֹ" + years+ "��" + months + "�³�����" + sum_2 + "��");
		
		
		System.out.print("\n");
		System.out.println("������" + "\t����һ" + "\t���ڶ�" + "\t������" + "\t������" + "\t������" + "\t������"  + "\n");
		
		firstDay = 1 + sum % 7;//1900��1��1��������һ,����书�����ÿ�µ�һ�������ڼ�;
		for(int k = 1 ; k <= firstDay ;k++){
			System.out.print("\t");//���ÿ��������һ�еĿո���;
		}
		
		
		
		for(int m = 1 ; m <= days_2 ; m++){
			System.out.print(m + "\t");
			/*0��ʾ������,1~6��ʾ����һ��������,�����������,�����һ�����з�*/
			if((sum + m )% 7 == 6){
				System.out.print("\n");
			}		
		}	
	}
}
