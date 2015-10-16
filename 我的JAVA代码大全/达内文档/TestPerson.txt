package mytextperson;
/*要求编写一个完整的Java Application 程序。包含Person,TestPerson,具体的要求如下
 *（1）类Person
 * @属性
 * name:String 类型，表示姓名
 * sex：char 类型，表示性别
 * id：String 对象，表示身份证号
 * Phone：String对象，表示来联系方式
 * email:String 对象，表示E-mail地址
 * @方法
 * Person(String name,char sex,String id):构造方法
 * void setEmail(String email):设置Email地址
 * void setPhone(String Phone):设置联系电话
 * public String toString():完成个人的各项信息，包括姓名等上述属性
 * (2)类TestPerson作为主类。完成如下测试功能
 * @用一下信息生成一个Person对象aPerson
 * 姓名：李洋
 * 性别：男
 * 身份证号：420821199111204116
 * @设置Emial：liyang@163.com
 * 设置联系电话：15170000232
 * @输出对象aPerson的各项信息
 * */

class Person{
	String name;
	char sex;
	String id;
	String phone;
	String email;
	 Person(String name,char sex,String id){
		 this.name = name;
		 this.id = id;
		 this.sex = sex;
		 this.phone = phone;
		 this.email = email;	
	}
	 void setEmail(String email){
		 this.email = email;
	 }
	 void setPhone(String phone){
		 this.phone = phone;
	 }
	 public String toString(){
		 String s = new String("\n\t姓名:"+ name +"\n\t性别:"+ sex);
		 if(id!=null){
			 s += "\n\t身份证号：" + id;
		 }
		 if(phone!=null){
			 s += "\n\t电话号码：" + phone;
		 }
		 if(email!=null){
			 s += "\n\t电子邮箱：" + email;
		 }
		 return s;
	 }
}
public class TestPerson {
	public static void main(String[] args){
	Person aPerson = new Person ("李洋",'男',"420821199111204116");
	aPerson.setPhone("15170000232");
	aPerson.setEmail("liyang@163.com");
	System.out.println("person_info:"+ aPerson);
	}
}
