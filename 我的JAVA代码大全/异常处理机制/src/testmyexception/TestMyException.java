package testmyexception;

class MyException extends Exception{
	private static final long serialVersionUID = 1L;
	
	private int a ;
	MyException(int b){
		this.a=b;
	}
	
	public String toString(){
		return "参数传递：" + a + ",发生错误";
	}
}

public class TestMyException {
	static void check(int a) throws MyException{
		System.out.println("此处引用mathod(" + a +")");
		if(a<0)
			throw new MyException(a);
		System.out.println("正常返回");
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
			System.out.println("发生的异常为：" + e.toString());	
		}catch(ArithmeticException e){
			flag = 0;
			System.out.println("发生的异常为：" + e.toString());
		}catch(Exception e){
			flag = 0;
			System.out.println("发生的异常为：" + e.toString());
		}finally{
			if(flag == 1){
				System.out.println("平均值为" + aver);
			}else{
				System.out.println("数据错误！请核查！");
			}
		}
		
	}

}
