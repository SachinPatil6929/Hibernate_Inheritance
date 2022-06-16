package hibernate_inheritance_joined;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="Id")
public class P_EmpJoin extends EmpJoin {
	@Column(name = "Salary")
	int salary;
	@Column(name = "Bonus")
	int bonus;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "P_EmpJoin [salary=" + salary + ", bonus=" + bonus + "]";
	}
	
	

}
