package hibernate_inheritance_joined;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class EmpJoin {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "Id")
	int id;
	@Column(name = "name")
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "EmpJoin [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	

}
