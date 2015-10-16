package teststudent;

class Person{
	String name;
	char sex;
	int age;
	
	public Person(String name,char sex,int age){
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	public String toString(){
		return "������\t" + name + "\n�Ա�\t" + sex + "\n���䣺\t"+age;
	}
}


class Student extends Person{
	long number;
	int chinese,math,english;

	public Student(long number,String name,char sex,int age,int chinese,int math,int english){
		super(name,sex,age);
		this.number = number;
		this.chinese = chinese;
		this.math = math;
		this.english = english;	
	}
	
	public double aver(){
		return (chinese + math +  english)/3.0;
	}
	
	
	public String toString(){
		return "ѧ��:\t" + number + "\n"+super.toString() + "\nƽ��������\t" + aver();
		
	}
	 
}

public class TestStudent {
	public static void main(String[] args){
		Student st = new Student(2011013702,"����",'��',20,115,120,72);
		System.out.println(st.toString());
		
	}

}
