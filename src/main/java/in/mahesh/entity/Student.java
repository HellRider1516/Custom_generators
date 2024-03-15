package in.mahesh.entity;

import java.time.LocalDate;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class Student {
	@Id
	@GeneratedValue(generator = "orderId")
	@GenericGenerator(name="orderId",strategy = "in.mahesh.custom.CustomGenerator")
	private String sId;
	private String sName;
	private String fName;
	private LocalDate DOB;
	
	public Student(String sName, String fName, LocalDate dOB) {
		super();
		this.sName = sName;
		this.fName = fName;
		DOB = dOB;
	}
	public String getsId() {
		return sId;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public LocalDate getDOB() {
		return DOB;
	}
	public void setDOB(LocalDate dOB) {
		DOB = dOB;
	}
	
	

}
