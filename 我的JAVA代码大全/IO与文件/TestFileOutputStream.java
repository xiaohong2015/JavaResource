package testfileoutputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {
	public static void main(String [] args){
		int b = 0;
		FileInputStream in = null;
		FileOutputStream out =null;
		
		try{
			in =  new FileInputStream("d:\\myeclipse����վ\\I0�����ļ�\\src\\testfileinputstream\\TestFileInputStream.java");
			out = new FileOutputStream("d:\\TestFileOutputStream.java");
			while((b=in.read())!=-1){
				out.write(b);
			}
			in.close();
			out.close();
		}catch(FileNotFoundException e){
			System.out.println("�Ҳ����ļ�");
			System.exit(-1);
		}catch(IOException e){
			System.out.println("�ļ����ƴ���");
			System.exit(-1);
		}
		System.out.print("�ļ��Ѿ�����");
//		System.out.print(b);
	}
}
