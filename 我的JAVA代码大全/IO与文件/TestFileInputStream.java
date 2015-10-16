package testfileinputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFileInputStream {
	public static void main(String [] args){
		int b = 0;
		FileInputStream in = null;
		try{
			in = new FileInputStream("D:\\myeclipse工作站\\I0流与文件\\src\\testfileinputstream\\TestFileInputStream.java");
		}catch(FileNotFoundException e){
			System.out.println("找不到文件");
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
			System.out.println("共读取了" +num +"个字节");
		}catch(IOException e){
			System.out.println("文件读取错误");
		}
		
	}

}
