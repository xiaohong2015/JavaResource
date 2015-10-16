public class J001{
	public static void main(String[] args){
//		int[][] anArray = new int[6][] ; 
		int[][] anArray = new int[6][6]; //  1: 6 不小于 6 ,没错
//		int[][] anArray = new int[6][4] ; // 2: 4 小于 6 ,出错

		for(int i = 0 ; i < anArray.length ; i ++)
		{
			for(int j = 0 ; j <= i ; j ++) // 加上等于号比较好
			anArray[i][j] = j +1;
		}
		for(int i = 0 ; i < anArray.length ; i ++)
		{
			for(int j = 0 ; j <= i ; j ++)
			System.out.print(anArray[i][j]+" ");
			System.out.println();
		}
	}
}
// 百度了一下，说是调用了null对象的方法，总的来说我也不太明白，看看他人的说法吧，，，
