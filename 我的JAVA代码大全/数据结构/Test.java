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
	
	
	public boolean equals(Object obj){//��дequals����
		if(obj instanceof Name){
			Name name = (Name)obj;
			return (firstName.equals(name.firstName) && lastName.equals(name.lastName));
		}
		return super.equals(obj);
	}
	
	public int hashCode(){//������дhashCode����
		return firstName.hashCode();
	}
}


public class Test {
	public static void main(String [] args){
			Collection c = new LinkedList();//ʹ��Collection������ԭ��
			c.add("Hello");
			c.add(new Name("��","��"));
			c.add(new Integer(100));
			c.add(new Name("f1","11"));
			c.add(new Name("f2","12"));
			c.remove(new Name("f2","12"));
			System.out.println(c.contains(new Name("f1","11")));
			System.out.println(c.size());
			System.out.println(c);//�˴�������.toString
	}
	

}
