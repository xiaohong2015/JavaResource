package basic_day05_03;

import java.util.Scanner;

public class Demo01 {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = f(n);
	System.out.println(m);
	}
	
	public static int f(int n){
		if(n==1)
			return 1;
		int m =n * f(n-1);
		return m;
		
	}
	
}
