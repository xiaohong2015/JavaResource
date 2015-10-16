import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


public class TestStudent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Jdbc2 j = new Jdbc2();
		try {
			Class.forName(j.sql);
			Connection con = DriverManager.getConnection(j.url, j.username, j.password);
			System.out.println("Success to connect the test datasource!");
			
			String sqlStr = "insert into student values(?,?)";
			PreparedStatement pre = con.prepareStatement(sqlStr);
			pre.setInt(1, 4);
			pre.setString(2, "牛");
			//pre.setInt(2, 100);
			pre.executeUpdate();
		
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}

}

class Jdbc2 {
	
	String sql = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/test1";
	String username = "root";
	String password = "123456";
}
