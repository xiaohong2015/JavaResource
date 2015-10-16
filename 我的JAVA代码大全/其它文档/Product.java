import java.util.Scanner;
public class Product {
	public static void main(String[] args){
		Scanner  input = new Scanner (System.in);
		int x,y,z,result;
		System.out.println("请输入第一个整数");
		x=input.nextInt();
		System.out.println("请输入第二个整数");
		y=input.nextInt();
		System.out.println("请输入第三个整数");
		z=input.nextInt();
		result=x*y*z;
		System.out.println(result);
		double a=2.0,b=1.1;
		System.out.println(a-b);
	}

}
