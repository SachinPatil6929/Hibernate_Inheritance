package hibernate_inheritance_single_table;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Con_emp")
public class ContractEmployee extends Employee{
	@Column(name = "per_hr_pay")
	int pay_per_hour;
	@Column(name = "contract_period")
	int contract_period;
	public int getPay_per_hour() {
		return pay_per_hour;
	}
	public void setPay_per_hour(int pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}
	public int getContract_period() {
		return contract_period;
	}
	public void setContract_period(int contract_period) {
		this.contract_period = contract_period;
	}
	@Override
	public String toString() {
		return "ContractEmployee [pay_per_hour=" + pay_per_hour + ", contract_period=" + contract_period + "]";
	}
	
	

}
