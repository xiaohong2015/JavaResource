/*题目要求:创建一第一代手机类，要求包含手机信息，并包含获取电
 * 话号码、存储电话号、拨打电话和挂断电话等功能。并依此作为父类
 * 增加拍照功能。以第二代手机类生成对象并模拟实现拨打电话、挂断
 * 电话、拍照等功能
 * 
 * 题目分析：
 * 父类中public修饰的方法均被继承下来，达到代码重用的目的，private
 * 修饰的telid属性没有被继承下来,这是因为我们封装了这个属性，Tel2
 * 类中的getImage()方法是Tel2继承了Tel1后扩展的方法
 * 
 * */

package testtel;

//子类第一代手机
class Tel1{
	private String telid;
	
	public String getTelid()
	{
		return telid;
	}
	
	public void setTelid(String telid){
		this.telid = telid;
	}
	
	public void callTel(String tid){
		this.setTelid(tid);
		String id = getTelid();
		System.out.println("连接到的电话号码为：" + id);
		if(id.length()==11 || id.length()==8){
			System.out.println("正在通话中");
		}
		else{
			System.out.println("您拨打的打电话号码为空号");
		}
	}
	
	public void endCall(){
		System.out.println("通话结束");
	}
}


//子类：第二代手机
class Tel2 extends Tel1{
	public void setImage()
	{
		System.out.println("拍照");
	}
}
//测试类
public class TestTel {
	public static void main(String[] args){
		//第一代手机
		Tel1 tel1 = new Tel1();
		tel1.setTelid("15170000232");
		System.out.println(tel1.getTelid());
		tel1.callTel("07526286");
		tel1.endCall();
		
		//第二代手机
		Tel2 tel2 = new Tel2();
		tel2.callTel("13377992386");
		tel2.endCall();
		tel2.setImage();
		System.out.println();
		tel2.setTelid("15170000232");
		tel2.callTel(tel2.getTelid());
		
	}

}
