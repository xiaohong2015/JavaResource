import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


/**
 * @author IronMan
 * 
 */
public class TestOutput {

	public static void main(String[] args) {
		String filename = "C:\\1.txt";
		File f = new File(filename);
		try {
			OutputStream out = new FileOutputStream(filename);
			out.write(48); // ASCII码
			out.write('\r');
			out.write(49);
			
			
			Desktop.getDesktop().open(f);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
