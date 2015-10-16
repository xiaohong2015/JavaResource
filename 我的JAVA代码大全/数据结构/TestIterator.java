package testiterator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

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
	
	
	
	
	public static void main(String[] args){
		
		
		Collection c = new HashSet();
		
		c.add(new Name("fff1","1111"));
		c.add(new Name("f2","12"));
		c.add(new Name("fff3","1113"));
		
		for(Iterator i = c.iterator() ; i.hasNext();){
			Name name = (Name)i.next();
			
			if(name.getFirstName().length()<3){
				i.remove();
				//如果换成c.remove()会发生意外
			}
		}	
		System.out.println(c);
	}
}
