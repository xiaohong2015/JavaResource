package threaddemo01;

public class ThreadDemo01 {
	public static void main(String[] args){
		Preson1 p1 = new Preson1();
		Preson2 p2 = new Preson2();
		p1.start();
		p2.start();
		System.out.println("main Over!");
	}
}
	class Preson1 extends Thread{
		public void run(){
			for(int i = 0  ;i<100  ;i++){
				System.out.println("你是谁啊!");
				Thread.yield();
			}
		}
	}
		
		class Preson2 extends Thread{
			public void run(){
				for(int i = 0  ;i<100  ;i++){
					System.out.println("修水表的!");
					Thread.yield();
				}
			}
		}
