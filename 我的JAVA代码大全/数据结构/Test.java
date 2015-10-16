package basetest;

import java.util.*;

class Name{
	private String firstName,lastName;
	public Name(String firstName,String lastName){
		this.firstName = firstName;
		this.lastName = lastName; 
	}
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String toString(){
		return firstName + lastName;
	}
	
	
	public boolean equals(Object obj){//重写equals方法
		if(obj instanceof Name){
			Name name = (Name)obj;
			return (firstName.equals(name.firstName) && lastName.equals(name.lastName));
		}
		return super.equals(obj);
	}
	
	public int hashCode(){//必须重写hashCode方法
		return firstName.hashCode();
	}
}


public class Test {
	public static void main(String [] args){
			Collection c = new LinkedList();//使用Collection有深层次原因
			c.add("Hello");
			c.add(new Name("李","洋"));
			c.add(new Integer(100));
			c.add(new Name("f1","11"));
			c.add(new Name("f2","12"));
			c.remove(new Name("f2","12"));
			System.out.println(c.contains(new Name("f1","11")));
			System.out.println(c.size());
			System.out.println(c);//此处调用了.toString
	}
	

}
