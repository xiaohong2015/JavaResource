import java.io.*;
import java.net.*;

public class Server {
	public static void main(String args[]) {
		ServerSocket server = null;
		ServerSocket server2= null;
		Socket you = null;
		DataOutputStream out = null;
		DataInputStream in = null;
		try {
			server = new ServerSocket(4331);
			server2= new ServerSocket(4332);
		} catch (IOException e1) {
			System.out.println("ERRO:" + e1);
		}
		try {
			you = server.accept();
			in = new DataInputStream(you.getInputStream());
			int message;		
			message= in.readInt();
			System.out.println(message);
			
			you = server2.accept();
			out = new DataOutputStream(you.getOutputStream());
			out.writeUTF(String.valueOf(message));
			
		} catch (IOException e) {
			System.out.println("" + e);
		}
	}
}