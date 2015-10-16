package testset;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args){
		Set s1 = new HashSet();
		Set s2 = new HashSet();
		
		s1.add("a");s1.add("b");s1.add("c");
		s2.add("d");s2.add("a");s2.add("b");
		
		//Set和List容器类都具有Constructor(Collection c)
		//构造方法用以初始化容器
		
		Set sn = new HashSet(s1);
		sn.retainAll(s2);
		Set su = new HashSet(s1);
		su.addAll(s2);
		System.out.println(sn);
		System.out.println(su);
		}

}
