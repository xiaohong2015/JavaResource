package testbufferstream01;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestBufferStream {
	public static void main(String [] args){
		try{//���ļ���File��
		FileInputStream fis =
			new FileInputStream("D:\\myeclipse����վ\\I0�����ļ�\\src\\testbufferstream\\TestBufferStream.java");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int c= 0;
		System.out.println(bis.read());
		System.out.println(bis.read());
		
		bis.mark(100);//�����100����
		for(int i =0;i<10&&(c=bis.read())!=-1;i++){
			System.out.print((char)c + " ");
		}
		
		System.out.println();
		bis.reset();//���ã����ص��༭100����
		
		for(int i =0;i<10&&(c=bis.read())!=-1;i++){
			System.out.print((char)c + " ");
		}
		
		bis.close();
		}catch(IOException e){
			e.printStackTrace();
		}
		
		
		
	}

}
