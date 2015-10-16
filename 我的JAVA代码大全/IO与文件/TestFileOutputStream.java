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
			in =  new FileInputStream("d:\\myeclipse工作站\\I0流与文件\\src\\testfileinputstream\\TestFileInputStream.java");
			out = new FileOutputStream("d:\\TestFileOutputStream.java");
			while((b=in.read())!=-1){
				out.write(b);
			}
			in.close();
			out.close();
		}catch(FileNotFoundException e){
			System.out.println("找不到文件");
			System.exit(-1);
		}catch(IOException e){
			System.out.println("文件复制错误");
			System.exit(-1);
		}
		System.out.print("文件已经复制");
//		System.out.print(b);
	}
}
