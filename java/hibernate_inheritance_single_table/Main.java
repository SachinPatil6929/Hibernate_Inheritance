package hibernate_inheritance_single_table;

import org.hibernate.Session;

public class Main {
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setName("Ram");
		
		RegularEmployee emp2 = new RegularEmployee();
		emp2.setName("Sham");
		emp2.setSalary(20000);
		emp2.setBonus(5000);
		
		ContractEmployee emp3 = new ContractEmployee();
		emp3.setName("Raj");
		emp3.setPay_per_hour(500);
		emp3.setContract_period(12);
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		org.hibernate.Transaction tx = session.beginTransaction();	
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		tx.commit();
		session.close();
		HibernateUtil.close();
		
	}

}
