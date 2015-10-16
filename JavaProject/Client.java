import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
	public static void main(String args[]) {
		Socket mysocket;
		DataOutputStream out = null;
		Scanner in1= new Scanner(System.in);
		try {
			mysocket = new Socket("localhost", 4331);
			out = new DataOutputStream(mysocket.getOutputStream());
			int message;
			message= in1.nextInt();
			out.writeInt(message);
		} catch (IOException e) {
			System.out.println("无法连接");
		}
	}
}