package onlineexam.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int qId;
	private int marks;
	private int questionStatus;
	private String typeOfquestion;
	private String correctAns;
	private String question;
	private String optionA;
	private String optionB;
	private String optionC;
	private String optionD;
	
	@OneToMany(mappedBy ="question")
	private List<Category> category = new  ArrayList<Category>();
	
	@OneToMany(mappedBy ="question")
	private List<SubCategory> subcategory = new  ArrayList<SubCategory>();
	
	@OneToMany(mappedBy ="question")
	private List<Subject> subject = new  ArrayList<Subject>();
	
	
	
	public List<Category> getCategory() {
		return category;
	}
	public void setCategory(List<Category> category) {
		this.category = category;
	}
	public List<SubCategory> getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(List<SubCategory> subcategory) {
		this.subcategory = subcategory;
	}
	public List<Subject> getSubject() {
		return subject;
	}
	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}
	public int getqId() {
		return qId;
	}
	public void setqId(int qId) {
		this.qId = qId;
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
