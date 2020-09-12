package onlineexam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PracticeExam {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int peId;
	private int examStatus;
	private String examName;
	private String examDuration;
	private int reExamday;
	private int negMarkstatus;
	private int negativeMarks;
	private int passingPercentage;
	private String termsCondition;
	public int getPeId() {
		return peId;
	}
	public void setPeId(int peId) {
		this.peId = peId;
	}
	public int getExamStatus() {
		return examStatus;
	}
	public void setExamStatus(int examStatus) {
		this.examStatus = examStatus;
	}
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public String getExamDuration() {
		return examDuration;
	}
	public void setExamDuration(String examDuration) {
		this.examDuration = examDuration;
	}
	public int getReExamday() {
		return reExamday;
	}
	public void setReExamday(int reExamday) {
		this.reExamday = reExamday;
	}
	public int getNegMarkstatus() {
		return negMarkstatus;
	}
	public void setNegMarkstatus(int negMarkstatus) {
		this.negMarkstatus = negMarkstatus;
	}
	public int getNegativeMarks() {
		return negativeMarks;
	}
	public void setNegativeMarks(int negativeMarks) {
		this.negativeMarks = negativeMarks;
	}
	public int getPassingPercentage() {
		return passingPercentage;
	}
	public void setPassingPercentage(int passingPercentage) {
		this.passingPercentage = passingPercentage;
	}
	public String getTermsCondition() {
		return termsCondition;
	}
	public void setTermsCondition(String termsCondition) {
		this.termsCondition = termsCondition;
	}
	
	
}
