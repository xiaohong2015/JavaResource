
public class EmployeeThread {

	public static void main(String[] args) {
		String e[]= new String[3];
		e[0]= "员工1";
		e[1]= "员工2";
		e[2]= "员工3";
		employee t= new employee(e);
		t.start();
	}
}

class employee extends Thread {
	String e[]= new String[3];
	
	public employee(String s[]) {
		e[0]= s[0];
		e[1]= s[1];
		e[2]= s[2];
	}
	public void run() {
		while(true) {
			int i = (int) (Math.random()*10);
			if(0<= i && i<= 2) {
				System.out.println(e[i]+ " have a rest now !");
				try {
					sleep(6000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}