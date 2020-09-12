package onlineexam.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PracticeAnswer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private int paId;
	 private String ans;
	 private int marks;
	 private Date examDate;
	 private String typeOfquestion;
	 private String correctAns;
	public int getPaId() {
		return paId;
	}
	public void setPaId(int paId) {
		this.paId = paId;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Date getExamDate() {
		return examDate;
	}
	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}
	public String getTypeOfquestion() {
		return typeOfquestion;
	}
	public void setTypeOfquestion(String typeOfquestion) {
		this.typeOfquestion = typeOfquestion;
	}
	public String getCorrectAns() {
		return correctAns;
	}
	public void setCorrectAns(String correctAns) {
		this.correctAns = correctAns;
	}
	
	 
	
}
