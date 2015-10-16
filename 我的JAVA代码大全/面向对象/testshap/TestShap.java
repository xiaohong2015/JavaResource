package testshap;
/*题目要求
 * 定义一个抽象类Shape，它包含两个抽象方法area()和perimeter(),从Shape派生类出Circle类和Rectangle类，这两个类用
 * area()来计算面积，用perimeter()来计算周长。编下程序使用Circle类和Rectangle类。
 * 
 * 题目分析：
 * 抽象类Shape不能被实例化，抽象类中的方法不能给出方法体，子类Circle和Rectangle只有给出其继承的抽象方法体后，
 * 才能创建对象；
 * 
 * 
 */

//定义抽象类和他包含的抽象方法
abstract class Shape{
	public abstract double area();
	public abstract double perimeter();
}

//继承抽象类，对其抽象方法进行重写，增加自己的新属性
class Cricle extends Shape{
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


//继承抽象类，对其抽象方法进行重写，增加自己的新属性
class Rectangle extends Shape{
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

public static class TestShape {
	public static void main(String[] args){
		Cricle c = new Cricle();
		c.setR(10);
		System.out.println("cricle area = " + c.area());
		System.out.println("cricle perimeter = " + c.perimeter());
		
		Rectangle r = new Rectangle();
		r.setHeight(3);
		r.setWidh(5);
		System.out.println("rectangle area = " + r.area());
		System.out.println("rectangle perimeter = " + r.perimeter());
		}
	
}
}
