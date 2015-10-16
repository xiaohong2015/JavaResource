package showallfiles;

import java.io.File;

public class ShowAllFiles {
	public static void showAllFiles(File x)
	{
		File[] xx = x.listFiles();
		if(x==null)
			return ;
		for(int i=0 ; i<x.length();i++){
			if(xx[i].isDirectory())
				showAllFiles(xx[i]);
			System.out.println(x.getPath());
		}
		
	}
	
	public static void main(String[] args){
		File x = new File("d:\\java");
		showAllFiles(x);
	}

}
