package cn.tc.test;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class TestFile {
	
	public static void main(String[] args) {
		File f = new File("E:\\1.txt");
		try {
			InputStreamReader isr = new InputStreamReader(new FileInputStream(f),"GBK");
			BufferedReader bs = new BufferedReader(isr);
			String buf = null;
			while((buf = bs.readLine()) != null ){
				String str = buf.substring(0, buf.indexOf(" ")).toLowerCase();
				if(str.indexOf("t") == 0) {
					System.out.println(str);
				}
				/*
				if(str.contains("h")
						&& str.contains("m")
						&& str.contains("e")
						&& str.contains("o")
						&& str.contains("d")) {
					System.out.println(str);
				}*/
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
