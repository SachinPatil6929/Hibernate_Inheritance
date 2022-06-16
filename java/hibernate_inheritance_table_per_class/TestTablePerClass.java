package hibernate_inheritance_table_per_class;

import org.hibernate.Session;

public class TestTablePerClass {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		org.hibernate.Transaction tx = session.beginTransaction();

		Emp emp1 = new Emp();
		emp1.setName("Ram");

		C_Emp emp2 = new C_Emp();
		emp2.setName("Sham");
		emp2.setContractDuration("One Year");
		emp2.setPay_per_hour(300);
		
		P_Emp emp3 = new P_Emp();
		emp3.setName("Raj");
		emp3.setSalary(20000);
		emp3.setBonus(2000);
		
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		
		tx.commit();
		session.close();
		HibernateUtil.close();
		

	}

}
