package interfaceimplement;
/*题目要求：
 * 定义接口IShape1,它包含方法area(), 定义接口IShape2，它包含方法perimeter(),定义Cricle和Rectangle类，
 * 两者都继承接口IShape1和IShape2.在类中分别用area()来计算面积，用perimeter()来计算周长。编写应用程序用Cricle类和
 * Rectangle类。
 * 
 * 题目分析
 * 在JAVA中只有单继承关系，而一个类却可以通过implement关键字申声明自己使用一个或多个接口，表示的是一种或多种继承关系。
 * 如果使用多个接口，应用逗号分隔接口名，那么这个类必须实该接口的所有方法
 */

//定义两个接口
interface IShape1{
	public double area();
}

interface IShape2{
	public double perimeter();
}

class Cricle implements IShape1,IShape2{
	private double r;
	
	public double getR(){
		return r;
	}
	
	public void setR(double r){
		this.r = r;
	}
	
	public  double area()
	{
		return Math.PI*Math.pow(r, 2);
	}
	public double perimeter(){
		return 2*r*Math.PI;
	}
}


class Rectangle implements IShape1,IShape2{
	private double width;
	private double height;
	 public double getWidth(){
		 return width;
	 }
	 
	 public void setWidh(double width){
		 this.width = width;
	 }
	 
	 
	 public double getHeight(){
		 return height;
	 }
	 
	 public void setHeight(double height){
		 this.height = height;		 
}
	 
		public  double area()
		{
			return width*height;
		}
		
		public double perimeter(){
			return 2*(width + height);
		}
}

public class TestIShape {
	public static void main(String[] args){
		Cricle c = new Cricle();
		c.setR(15);
		System.out.println("cricle area = " + c.area());
		System.out.println("cricle perimeter = " + c.perimeter());
		
		Rectangle r = new Rectangle();
		r.setHeight(3);
		r.setWidh(8);
		System.out.println("rectangle area = " + r.area());
		System.out.println("rectangle perimeter = " + r.perimeter());
		}
	
}
