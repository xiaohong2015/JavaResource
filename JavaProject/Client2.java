import java.io.*;
import java.net.*;

public class Client2 {
	public static void main(String args[]) {
		String s = null;
		Socket mysocket;
		DataInputStream in = null;
		try {
			mysocket = new Socket("localhost", 4332);
			in = new DataInputStream(mysocket.getInputStream());
			s = in.readUTF();
			System.out.println("客户收到:" + s);
		} catch (IOException e) {
			System.out.println("无法连接");
		}
	}
}