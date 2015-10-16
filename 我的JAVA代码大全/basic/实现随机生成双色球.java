package basic_day05_03;

import java.util.Arrays;
import java.util.Random;

//实现随机生成双色球
/*
1)  随机生成红球序号 
2)  检查"红球序号"是否使用过(取出过)     如果使用过 返回 1 
3)  取出一个红球,  设置使用标记为true 
4)  是否取出了6 个红球      如果没有到6 个,  返回 1 
5)  对红球结果排序 
6)  取出一个篮球到结果中 
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
		boolean[] used = new boolean[pool.length];//使用过球号码的进行标记；
		Random r = new Random()	;
		String[] balls = new String[6];//定义一个一位数组，存放六个红球；
		int i = 0;
		while(true){
			int index  = r.nextInt(pool.length);
		if(used[index])//检查下标是否使用过；
				continue;
			balls[i++]=pool[index];
			used[index] = true;
			if(i==balls.length)//检查是否取得了六个红球；
				break;
		}
		Arrays.sort(balls);//对红球进行排序
		balls = Arrays.copyOf(balls,balls.length+1);//利用数组扩容追加新的"球号" 
		balls[balls.length-1] = pool[r.nextInt(16)];//随机产生一个兰球；
		return balls;
		}

}
