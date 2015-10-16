
package cn.tc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestJDBC {

	public static void main(String[] args) {
		Jdbc j = new Jdbc();
		try {
			Class.forName(j.sql);
			Connection con = DriverManager.getConnection(j.url, j.username, j.password);
			System.out.println("Success to connect the test datasource!");
			
			Statement sm = con.createStatement();

			System.out.println("The number's available scope is 1~4 !");
			int n;
			Scanner in = new Scanner(System.in);
			n = in.nextInt();
			
			switch(n) {
			case 1:  // 增
				String sql1 = "insert into user (username, password) values('xiaohong', '123');"; sm.execute(sql1);
				break;

			case 2:  // 删第一条记录
				String sql2 = "delete from user where id = 1;"; sm.execute(sql2);
				break;

			case 3:  // 改第二条记录
				String sql3 = "update user set username='xiao', password='321' where id = 2;"; sm.execute(sql3);
				break;

			case 4:  // 查第三条记录
				String sql4 = "select * from user where id = 3;"; sm.execute(sql4);
				break;
				
			default :
				System.out.println("The number's available scope is 1~4 !");
				break;

			}			
			
			// 输出表 user 所有数据
			String sql = "select * from user;";
			ResultSet rs = sm.executeQuery(sql);
			List<user> list = new ArrayList<user>();
			while(rs.next()) {
				user u = new user();
				u.setUsername(rs.getString("username"));
				u.setPassword(rs.getString("password"));
				list.add(u);
			}
			
			for(Iterator<user> i= list.iterator(); i.hasNext();) {
				user u = i.next();
				System.out.println("用户名: "+ u.username+ "\t密码: "+ u.password);
			}
			
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}

class Jdbc {
	
	String sql = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/test";
	String username = "root";
	String password = "123456";
}

class user {
	String username = null;
	String password = null;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}

