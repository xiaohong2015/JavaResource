class BrithDate {
	private int day;
	private int month;
	private int year;
	public BrithDate(int d, int m, int y){
		day = d;
		month = m;
		year = y; 
	}
	
	public void setDay(int d){
		day = d;
	}
	
	public void setMonth(int m){
		month = m;
	}
	
	public void setYear(int y){
		year = y;
	}
	
	public void display(){
		System.out.println(day+"-"+month+"-"+year);
	}
	
	public int getDay(){
		return day;
	}
	
	public int getMonth(){
		return month;
	}
	
	public int getYear(){
		return year;
	}
	
}
public class Test {
	public static void main(String[] args){
		Test test = new Test();
		int date = 9;
		BrithDate d1 = new BrithDate(7,7,1979);
		BrithDate d2 = new BrithDate(1,1,2000);
		test.change1(date);
		test.change2(d1);
		test.change3(d2);
		System.out.println("date="+date);
		d1.display();
		d2.display();
	}
	public void change1(int i){
		i=1234;
	}
	
	public void change2(BrithDate b){
		b = new BrithDate(22,2,2004);
	}
	
	public void change3(BrithDate b){
		b.setDay(22);
	}
}