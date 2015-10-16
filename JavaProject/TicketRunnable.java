
public class TicketRunnable {
	
	public static void main(String[] args) {
		Ticket2 tr1= new Ticket2();
		Ticket2 tr2= new Ticket2();
		Ticket2 tr3= new Ticket2();
		
		Thread t1 = new Thread(tr1);
		Thread t2 = new Thread(tr2);
		Thread t3 = new Thread(tr3);
		t1.start();
		t2.start();
		t3.start();
		
		while(true) {
			int sum= tr1.getN()+ tr2.getN()+ tr3.getN();
			
			if(sum > 300) {
				tr1.flag= false;
				tr2.flag= false;
				tr3.flag= false;
				System.out.println("The ticket was selled");
				System.exit(0);
			}
		}
	}
}

class Ticket2 implements Runnable{
	public int n= 0;
	boolean flag= true;

	public void run() {
		while(flag) {
			++n;
			System.out.println(this.toString()+ " The "+ this.n+ " one");
		}
	}
	public int getN() {
		return n;
	}
}