import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.hibernate.model.Teacher;


public class TeacherTest {
	public static void main(String[] args) {
		Teacher s = new Teacher();
		s.setId(1);
		s.setName("s1");
		s.setTitle("终极");
		
		Configuration cfg = new AnnotationConfiguration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		
		session.close();
		sf.close();
	}
}
