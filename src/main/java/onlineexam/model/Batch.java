package onlineexam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Batch {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int bId;
	private String batchName;
	private String batchTime;
	private int batchStatus;
	@ManyToOne 
	private Student student;
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getBatchTime() {
		return batchTime;
	}
	public void setBatchTime(String batchTime) {
		this.batchTime = batchTime;
	}
	public int getBatchStatus() {
		return batchStatus;
	}
	public void setBatchStatus(int batchStatus) {
		this.batchStatus = batchStatus;
	}
	
	
}
