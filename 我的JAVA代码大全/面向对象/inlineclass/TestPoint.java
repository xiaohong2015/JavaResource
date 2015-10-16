package inlineclass;
/*题目要求：
 * 定义接口IPoint (包含两个方法：计算面积和计算体积)，定义类Circle,Cylinder.其中Circle为Cylinder的内部类，即
 * Cylinder有两个成员属性：Circle类型的 circle和double类型的height.编写应用程序建立Cylinder的对象，并计算其面
 * 积和体积。
 */

interface IPoint{//接口中只能定义抽象方法，其访问权限只能是public;
	abstract double area();
	
	abstract double volume();
}

class Circle{
	int x,y;
	double radius;
	
	public Circle(int a, int b,double r){
		x = a ; 
		y = b;
		radius = r;
	}
	
	public double circleArea(){
		return Math.PI*Math.pow(radius,2);
	}
}

class Cylinder{
	Circle circle;//Circle类型
	double height;
	
	public Cylinder(int a,int b,double r,double h){
		circle = new Circle(a,b,r);
		setHeight(h);
	}
	
	public void setHeight(double h){
		height = (h>0?h:0);
	}
	
	public double area(){
		return 2*circle.circleArea() + 2*circle.radius*Math.PI*height;
	}
	
	public double volume(){
		return circle.circleArea()*height;
	}
}
public class TestPoint {
	public static void main(String[] args){
		Cylinder cylinder = new Cylinder(20,10,15.2,2);
		System.out.println("cylinder area = " + cylinder.area() + "\ncylinder volume = " + cylinder.volume());	
	}
}
