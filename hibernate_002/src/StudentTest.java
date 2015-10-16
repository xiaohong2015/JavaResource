import com.hibernate.model.Student;

public class StudentTest{
	public static void main(String[] args)  throws Exception{
		Student s = new Student();
		s.setId(3);
		s.setName("s1");
		s.setAge(100);
		
		Session session = new Session();
		
		session.save(s);
	}
}
