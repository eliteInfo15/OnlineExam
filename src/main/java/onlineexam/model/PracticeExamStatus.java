package onlineexam.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PracticeExamStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	private Date examDate;
	private int status;
	private String startTime;
	private String endTime;
	private int noOfattempts;
	private String passFail;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getExamDate() {
		return examDate;
	}
	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public int getNoOfattempts() {
		return noOfattempts;
	}
	public void setNoOfattempts(int noOfattempts) {
		this.noOfattempts = noOfattempts;
	}
	public String getPassFail() {
		return passFail;
	}
	public void setPassFail(String passFail) {
		this.passFail = passFail;
	}
	
}
