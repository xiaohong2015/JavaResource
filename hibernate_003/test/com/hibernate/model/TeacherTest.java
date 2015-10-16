/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.hibernate.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.junit.BeforeClass;
import org.junit.Test;

public class TeacherTest {
	private static SessionFactory sf = null;
	
	@BeforeClass
	public static void beforeClass() {
		sf = new AnnotationConfiguration().configure().buildSessionFactory();
	}
	
	@Test
	public void testTeacherSave() {
		Teacher s = new Teacher();
		s.setId(7);
		s.setName("s1");
		s.setTitle("终极");
		
//		Configuration cfg = new AnnotationConfiguration();
	//	SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		
		session.close();
//		sf.close();
	}
	
	public static void afterClass() {
		sf.close();
	}
}