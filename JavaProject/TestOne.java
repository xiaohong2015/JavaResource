package cn.tc.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*

My father was a self-taught mandolin player. He was one of the best string instrument players in our town. He could not read music, but if he heard a tune a few times, he could play it. When he was younger, he was a member of a small country music band. They would play at local dances and on a few occasions would play for the local radio station. He often told us how he had auditioned and earned a position in a band that featured Patsy Cline as their lead singer. He told the family that after he was hired he never went back. Dad was a very religious man. He stated that there was a lot of drinking and cursing the day of his audition and he did not want to be around that type of environment

 */
public class TestOne {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		//HashMap h = new HashMap(); // 乱序
		//TreeMap h = new TreeMap(); // ASCII码排序key
		LinkedHashMap h = new LinkedHashMap(); // put 顺序输出
		int hLength = 0;
		int wordLength = 0;

		// 读取英文文章并存至缓冲区 buf中
		System.out.println("Please enter an article in English!");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		str.trim();

		// 取出每个单词并写入Map h中
		int blank = -1;
		String buf = null;
		while (null!= str && str.length() > 0) {
			// 取单词
			blank = str.indexOf(" ");
			if (blank != -1) {
				buf = str.substring(0, str.indexOf(" "));
				str = str.substring(str.indexOf(" ") + 1);
				str = str.trim();
			} else {
				buf = str.substring(str.indexOf(" ") + 1);
				str = null;
			}
			
			// 过滤标点符号
			buf= buf.replace(",", ""); // 逗号
			buf= buf.replace(".", ""); // 句号
			
			//buf= buf.replace("'", ""); // 单引号,有两个单词,待处理……
			buf= buf.substring(0, (buf.indexOf("'")==-1?buf.length():buf.indexOf("'"))); // 暂取其一
			
			buf= buf.replace("\"", "");
			buf= buf.replace(":", ""); // 冒号
			buf= buf.replace("!", ""); // 感叹号
			buf= buf.replace("?", ""); // 问号
			buf= buf.replace("(", ""); // 左括号
			buf= buf.replace(")", ""); // 右括号
			buf= buf.replace("=", ""); // 等于号
			
			// 写入 Map h中
			if(null != buf && buf.length()>0) {
				if (h.containsKey(buf)) {
					((Ctime) h.get(buf)).count++;
				} else {
					h.put(buf, new Ctime());
					hLength++;
				}
			}
			wordLength++;
		}
		
		// 排序
		List<Map.Entry<String, Ctime>> hl = new ArrayList<Map.Entry<String, Ctime>>(
				h.entrySet());
		Collections.sort(hl, new Comparator<Map.Entry<String, Ctime>>() {
			public int compare(Map.Entry<String, Ctime> o1,
					Map.Entry<String, Ctime> o2) {
				return (((Ctime)o2.getValue()).count> ((Ctime)o1.getValue()).count?1:-1);
			}
		});

		h.clear();
		for(int i=0; i<hl.size(); i++) {
			h.put(hl.get(i).getKey(), hl.get(i).getValue());
		}
		/*遍历Map
		Set set = h.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Entry str1 = (Map.Entry)i.next();
			System.out.print(str1.getKey()+ ": "+ str1.getValue()+ " ");
		}*/
		// 处理完毕，输出结果
		System.out.println("\n"+ h + "\n\nThe word count is :" + hLength
				+ "\nThe word total is :"+ wordLength);
	}
}

class Ctime {
	int count = 1;

	public String toString() {
		return Integer.toString(count);
	}
}
