package testfilereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {
	public static void main(String [] args){
	FileReader fr = null;
	int c = 0;
	try{
		fr = new FileReader("D:\\myeclipse����վ\\I0�����ļ�\\src\\testfilereader\\TestFileReader.java");
		int in = 0;
		while((c = fr.read())!=-1){
			System.out.print((char)c);
		}
		fr.close();
	}catch(FileNotFoundException ex){
		System.out.print("�ļ��Ҳ���");
	}catch(IOException e){
		System.out.print("�ļ���ȡ����");	
	}
	
	}

}
