package testmyexception;

class MyException extends Exception{
	private static final long serialVersionUID = 1L;
	
	private int a ;
	MyException(int b){
		this.a=b;
	}
	
	public String toString(){
		return "�������ݣ�" + a + ",��������";
	}
}

public class TestMyException {
	static void check(int a) throws MyException{
		System.out.println("�˴�����mathod(" + a +")");
		if(a<0)
			throw new MyException(a);
		System.out.println("��������");
	}
	

	public static void main(String[] args){
		int sum = 0 ,aver = 0,flag = 1;
		int number[ ] = {1,2,3,4,-5};
		try{
			for(int i = 0;i<number.length;i++)
			{
				check(number[i]);
				sum += number[i];
			}
			aver = sum/number.length;
		}catch(MyException e){
			flag = 0;
			System.out.println("�������쳣Ϊ��" + e.toString());	
		}catch(ArithmeticException e){
			flag = 0;
			System.out.println("�������쳣Ϊ��" + e.toString());
		}catch(Exception e){
			flag = 0;
			System.out.println("�������쳣Ϊ��" + e.toString());
		}finally{
			if(flag == 1){
				System.out.println("ƽ��ֵΪ" + aver);
			}else{
				System.out.println("���ݴ�����˲飡");
			}
		}
		
	}

}
