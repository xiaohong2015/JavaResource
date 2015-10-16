package myexception;

public class TxetException {
	public static void main(String[] args){
		try{
		System.out.println(2/0);
		}
		catch(ArithmeticException ae){
			System.out.println("ÏµÍ³³ö´í£¡");
			ae.printStackTrace();
		}
	}
}
