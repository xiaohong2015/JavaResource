public class Person {
	int id;
	int age = 20;
	
	void Person(int _id, int _age) {
		id = _id;
		age = _age;
	}
	
	public static void main(String[] args) {
		Person tom = new Person();
		tom.Person(1, 25);
		//Person jerry = new Person();
		Point p = new Point();
	}
}

class Point {
	Point() {}
	int x;
	int y;
}




import java.util.Scanner;
public class Person {
	public static void main(String[] args){
		double a,b;
		a=2.0;
		b=1.1;
		System.out.println(a-b);
	}

}
