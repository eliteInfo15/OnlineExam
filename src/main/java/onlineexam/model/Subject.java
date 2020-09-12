package onlineexam.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int sId;
	private String subjectName;
	private int subjectStatus;
	@OneToMany(mappedBy  ="subject")
	private List<Exam> exam = new  ArrayList<Exam>();
	
	@OneToMany(mappedBy  ="subject")
	private List<Category> category = new  ArrayList<Category>();
	
	@OneToMany(mappedBy  ="subject")
	private List<SubCategory> subcategory = new  ArrayList<SubCategory>();
	
	@ManyToOne 
	private Question question;
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
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
	public List<Exam> getExam() {
		return exam;
	}
	public void setExam(List<Exam> exam) {
		this.exam = exam;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getSubjectStatus() {
		return subjectStatus;
	}
	public void setSubjectStatus(int subjectStatus) {
		this.subjectStatus = subjectStatus;
	}
	
}
