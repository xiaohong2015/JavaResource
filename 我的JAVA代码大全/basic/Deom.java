package basic_day02;

import java.util.Random;
import java.util.Scanner;

public class Deom {
	public static void main(String[] args)
	{
     Scanner  console= new Scanner(System.in);
     String str = console.nextLine();
     Random random = new Random();
     int c = random.nextInt(26);
     char ch = (char)('A'+c);
     System.out.println(str); 
     System.out.println(ch); 
     
     
		


	}
}
