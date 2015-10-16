
public class TicketThread {
	
	public static void main(String[] args) {
		Ticket t1= new Ticket();
		Ticket t2= new Ticket();
		Ticket t3= new Ticket(); // 火车售票的3个窗口
		t1.start();
		t2.start();
		t3.start();
		
		while(true) {
			int sum= t1.getN()+ t2.getN()+ t3.getN();
			
			if(sum > 300) {
				t1.flag= false;
				t2.flag= false;
				t3.flag= false;
				System.out.println("The ticket was selled");
				System.exit(0);
			}
		}
	}
}

class Ticket extends Thread{
	int n= 0;
	boolean flag= true;

	public void run() {
		while(flag) {
			++n;
			System.out.println(getName()+ " The "+ this.getN()+ " one");
		}
	}
	public int getN() {
		return n;
	}
}