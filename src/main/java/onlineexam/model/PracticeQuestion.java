package onlineexam.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PracticeQuestion {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int pqId;
	private int marks;
	private int questionStatus;
	private String typeOfquestion;
	private String correctAns;
	private String question;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	public int getPqId() {
		return pqId;
	}
	public void setPqId(int pqId) {
		this.pqId = pqId;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getQuestionStatus() {
		return questionStatus;
	}
	public void setQuestionStatus(int questionStatus) {
		this.questionStatus = questionStatus;
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
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOptionA() {
		return optionA;
	}
	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}
	public String getOptionB() {
		return optionB;
	}
	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}
	public String getOptionC() {
		return optionC;
	}
	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}
	public String getOptionD() {
		return optionD;
	}
	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}
	
	
	
}
