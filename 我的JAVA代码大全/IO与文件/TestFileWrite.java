package testfilewriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWrite {
	public static void main(String [] args){
		FileWriter fw = null;
		try{
			fw = new FileWriter("D:\\TestFileWrite.dat");
			for(int i =0 ; i<5000 ; i++){
				fw.write(i);
			}
			fw.close();
		}catch(IOException e){
			System.out.println("ÎÄ¼þ¶ÁÈ¡´íÎó");
			System.exit(-1);		
	}
    }
}