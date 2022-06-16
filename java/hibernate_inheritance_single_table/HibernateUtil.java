package hibernate_inheritance_single_table;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
				return new Configuration().configure().buildSessionFactory();
		}catch (Throwable ex) {
			System.err.println("build Session Factory failes:" + ex);
			throw new ExceptionInInitializerError(ex);
		}
				
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public static void close() {
		getSessionFactory().close();
	}
	

}