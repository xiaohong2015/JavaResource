public class J001{
	public static void main(String[] args){
//		int[][] anArray = new int[6][] ; 
		int[][] anArray = new int[6][6]; //  1: 6 ��С�� 6 ,û��
//		int[][] anArray = new int[6][4] ; // 2: 4 С�� 6 ,����

		for(int i = 0 ; i < anArray.length ; i ++)
		{
			for(int j = 0 ; j <= i ; j ++) // ���ϵ��ںűȽϺ�
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
// �ٶ���һ�£�˵�ǵ�����null����ķ������ܵ���˵��Ҳ��̫���ף��������˵�˵���ɣ�����
