package hibernate_inheritance_joined;

import org.hibernate.Session;

public class Main {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		org.hibernate.Transaction tx = session.beginTransaction();
		
		EmpJoin ej1 = new EmpJoin();
		ej1.setName("Ram");
		
		C_EmpJoin ej2 = new C_EmpJoin();
		ej2.setName("Raj");
		ej2.setPay_per_hour(300);
		ej2.setContractDuration("One Year");
		
		P_EmpJoin ej3 = new P_EmpJoin();
		ej3.setName("Sham");
		ej3.setSalary(25000);
		ej3.setBonus(3000);
		
		session.save(ej1);
		session.save(ej2);
		session.save(ej3);
		tx.commit();
		
		session.close();
		HibernateUtil.close();
	}

}
