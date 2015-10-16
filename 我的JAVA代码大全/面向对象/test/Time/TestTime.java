package test.Time;

import Time.Time; 
public class TestTime {
	public static void main(String[] args){
		Time t = new Time();
		t.setTime("10:15:20");
		System.out.println(t.getHour() +":"+ t.getMinute() +":" +t.getSecond());
		t.setTime(20,28,36);
		System.out.println(t.getHour() +":"+ t.getMinute() +":" +t.getSecond());
	}	
}
