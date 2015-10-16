import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fcfs {
	public static void main(String[] args) {
		Fcfs t= new Fcfs();
		t.run();
		System.out.print("\n"+ t.list);
	}
	
	List<PCB> list= new ArrayList<PCB>();
	int N= 4; // task number
	public void run() {
		System.out.println("name arriveTime needTime finishTime");
		int i= 0;
		while(i++ < N) {
			PCB p= new PCB();
			p.name= String.valueOf((char)(64+i));
			p.arriveTime= (int) (Math.random()*10)+1;
			p.needTime= (int) (Math.random()*10)+1;
			System.out.println(p);
			p.finishTime= p.needTime;
			list.add(p);
		}
		Collections.sort(list); // run and calculate
		list.get(0).finishTime+= list.get(0).arriveTime;
		for(i=1; i<N; i++) {
			if(list.get(i).arriveTime> list.get(i-1).finishTime) {
				list.get(i).finishTime+= list.get(i).arriveTime;
			} else {
				list.get(i).finishTime+= list.get(i-1).finishTime;
			}
		}
	}
}
class PCB implements Comparable<PCB>{
	public String name; // 进程标识符
	public int arriveTime; // 到达时间
	public int needTime; // 服务时间
	public int finishTime; // 完成时间
	@Override
	public int compareTo(PCB o) {
		if(this == o) {
			return 0;
		}
		if(arriveTime> o.arriveTime) {
			return 1;
		}
		return -1;
	}
	@Override
	public String toString() {
		return name+ "\t"+ Integer.toString(arriveTime)+ "\t"+ Integer.toString(needTime)
				+ "\t"+ Integer.toString(finishTime);
	}
}