public class FourThread extends Thread{
	public static void main(String[] args) {
		FourThread t1= new FourThread(1);
		FourThread t2= new FourThread(1);
		FourThread t3= new FourThread(-1);
		FourThread t4= new FourThread(-1);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	public static int j=1;
	public int add;
	public FourThread(int add) {
		this.add= add;
	}
	@Override
	public void run() {
		while(true) {
			System.out.println(j += add);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

