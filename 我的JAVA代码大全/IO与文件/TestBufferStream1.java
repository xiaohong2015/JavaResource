package testbufferstream02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferStream1 {
	
	public static void main(String [] args){
		try{
			BufferedWriter bw = new BufferedWriter(new FileWriter("d:\\java\\dat01.txt"));
			BufferedReader br = new BufferedReader(new FileReader("d:\\java\\dat01.txt"));
			
			String s = null;
			for(int i=1 ;i<=100; i++){
				s = String.valueOf(Math.random()*100);
				bw.write(s);
				bw.newLine();
			}
			bw.flush();//与缓冲流Buffer配套使用
			while((s = br.readLine())!=null){
				System.out.println(s);
			}
			bw.close();
			br.close();
			}catch(IOException e){
				e.printStackTrace();
			}
	}
}		