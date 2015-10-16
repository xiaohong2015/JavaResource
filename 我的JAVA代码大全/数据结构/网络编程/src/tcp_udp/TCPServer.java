package tcp_udp;
import java.net.*;

public class TCPServer {
	public static void main(String[] args) throws Exception{
		ServerSocket ss = new ServerSocket(7777);
		while(true){
			Socket s = ss.accept();
			System.out.println("连接成功");
		}
		
	}

}
