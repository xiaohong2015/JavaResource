package inlineclass;
/*��ĿҪ��
 * ����ӿ�IPoint (����������������������ͼ������)��������Circle,Cylinder.����CircleΪCylinder���ڲ��࣬��
 * Cylinder��������Ա���ԣ�Circle���͵� circle��double���͵�height.��дӦ�ó�����Cylinder�Ķ��󣬲���������
 * ���������
 */

interface IPoint{//�ӿ���ֻ�ܶ�����󷽷��������Ȩ��ֻ����public;
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
	Circle circle;//Circle����
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
