import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class DigestThread extends Thread{
	
	private File input;

	public DigestThread(File input) {
		this.input= input;
	}

	public void run() {
		try {
			FileInputStream in = new FileInputStream(input);
			MessageDigest sha = MessageDigest.getInstance("SHA");
			DigestInputStream din= new DigestInputStream(in, sha);
			
			int b;
			while((b= din.read()) != -1) {
				System.out.print(b+ " ");
			}
			din.close();
			
			byte[] digest = sha.digest();
			StringBuffer result = new StringBuffer(input.toString());
			result.append(" : ");
			
			for(int i=0; i< digest.length; i++) {
				result.append(digest[i]+ " ");
			}
			System.out.println(result);
			
		} catch (IOException ex) {
			System.err.print(ex);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		File f = new File("F:\\1.txt");
		Thread dt = new DigestThread(f);
		dt.start();
	}

}
