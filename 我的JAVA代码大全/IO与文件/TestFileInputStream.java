package testfileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream {
	public static void main(String [] args){
		int b = 0;
		FileInputStream in = null;
		try{
			in = new FileInputStream("D:\\myeclipse����վ\\I0�����ļ�\\src\\testfileinputstream\\TestFileInputStream.java");
		}catch(FileNotFoundException e){
			System.out.println("�Ҳ����ļ�");
			System.exit(-1);
		}
		
		try{
			long num = 0;
			while((b = in.read())!=-1){
				System.out.println((char)b);
				num++;
			}
			in.close();
			System.out.println();
			System.out.println("����ȡ��" +num +"���ֽ�");
		}catch(IOException e){
			System.out.println("�ļ���ȡ����");
		}
		
	}

}
