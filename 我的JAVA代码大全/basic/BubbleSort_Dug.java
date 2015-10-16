package basic.day05_01;

import java.util.Arrays;

public class BubbleSort_Dug {
	public static void main(String[] args){
		int[] ary={8,2,3,7,1};
		ary = BubbleSort(ary);
		System.out.println(Arrays.toString(ary));
	}
	public static int [] BubbleSort(int[] ary){
		for(int i = 0;i<ary.length-1;i++)
			for(int j = 0;j<ary.length-i-1;j++)
			{
				System.out.print(Arrays.toString(ary));
				System.out.print(i+"\t");
				System.out.print(j+"\t");
				System.out.print(ary[j]+"\t");
				System.out.print(ary[j+1]+"\t");
				System.out.print((ary[j]>ary[j+1])+"\t");
				if(ary[j]>ary[j+1])
				{
					System.out.print(ary[j]+"<->"+ary[j+1]);
					int temp=ary[j];
					ary[j]=ary[j+1];
					ary[j+1]=temp;
				}
				System.out.println();
			}
		return ary;
	}

}
