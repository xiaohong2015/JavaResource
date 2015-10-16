import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class DigestRunnable implements Runnable{

	private File input;
	private boolean j= false;

	public DigestRunnable(File input) {
		this.input= input;
	}

	public void run() {
		try {
			this.setJ(true);
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
	
	public void setJ(boolean j) {
		this.j = j;
	}

	public boolean isJ() {
		return j;
	}

	public static void main(String[] args) {
		File f = new File("F:\\1.txt");
		DigestRunnable dr = new DigestRunnable(f);
		Thread t = new Thread(dr);
		t.start();
		Thread t1 = new Thread(dr);
		t1.start();

		System.out.println(dr.isJ());
	}

}
