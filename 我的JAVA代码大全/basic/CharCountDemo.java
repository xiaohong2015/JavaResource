package basic.day04;

import java.util.Arrays;
//import java.util.Scanner;

public class CharCountDemo {
	public static void main(String[] args)
	{
		String str = "统计一个字符在字符串中出现的次数";
		//Scanner sc = new Scanner(System.in);
		//char ch = sc.nextLine();
		int[] arr = countAll(str,'中');
		System.out.println(str);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
	}
	public static int[] countAll(String str,char ch)
	{
		int[] ary = {};
		for(int i = 0;i<str.length();i++){
			char c = str.charAt(i);
			if(c == ch){
				ary = Arrays.copyOf(ary,ary.length+1);
				ary[ary.length-1] = i;	
			}
		}
		return ary;
		
	}
	
}
