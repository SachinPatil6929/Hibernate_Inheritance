package hibernate_inheritance_joined;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name ="Id")
public class C_EmpJoin extends EmpJoin {
	@Column(name = "per_hr_pay")
	int pay_per_hour;
	@Column(name = "duration")
	String contractDuration;
	public int getPay_per_hour() {
		return pay_per_hour;
	}
	public void setPay_per_hour(int pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}
	public String getContractDuration() {
		return contractDuration;
	}
	public void setContractDuration(String contractDuration) {
		this.contractDuration = contractDuration;
	}
	@Override
	public String toString() {
		return "C_EmpJoin [pay_per_hour=" + pay_per_hour + ", contractDuration=" + contractDuration + "]";
	}
	

}
