package basic_day05_03;

import java.util.Arrays;
import java.util.Random;

//ʵ���������˫ɫ��
/*
1)  ������ɺ������ 
2)  ���"�������"�Ƿ�ʹ�ù�(ȡ����)     ���ʹ�ù� ���� 1 
3)  ȡ��һ������,  ����ʹ�ñ��Ϊtrue 
4)  �Ƿ�ȡ����6 ������      ���û�е�6 ��,  ���� 1 
5)  �Ժ��������� 
6)  ȡ��һ�����򵽽���� 
*/
public class Demo02 {
	public static void main(String[] args){
		System.out.println(Arrays.toString(gen()));
	}
	public static String[] gen(){
		String[] pool = {"01","02","03","04","05","06","07","08","09",
				"10","11","12","13","14","15","16","17","18","19","20",
				"21","22","23","24","25","26","27","28","29","30","31",
				"32","33"};
		boolean[] used = new boolean[pool.length];//ʹ�ù������Ľ��б�ǣ�
		Random r = new Random()	;
		String[] balls = new String[6];//����һ��һλ���飬�����������
		int i = 0;
		while(true){
			int index  = r.nextInt(pool.length);
		if(used[index])//����±��Ƿ�ʹ�ù���
				continue;
			balls[i++]=pool[index];
			used[index] = true;
			if(i==balls.length)//����Ƿ�ȡ������������
				break;
		}
		Arrays.sort(balls);//�Ժ����������
		balls = Arrays.copyOf(balls,balls.length+1);//������������׷���µ�"���" 
		balls[balls.length-1] = pool[r.nextInt(16)];//�������һ������
		return balls;
		}

}
