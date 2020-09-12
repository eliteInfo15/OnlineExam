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
public class SubCategory {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int scId;
	private String subcategoryName;
	private int subcategoryStatus;
	
	@ManyToOne 
	private Subject subject;
	
	@ManyToOne 
	private Student student;
	
	@OneToMany(mappedBy  ="subcategory")
	private List<Exam> exam = new  ArrayList<Exam>();
	
	@OneToMany(mappedBy  ="subcategory")
	private List<Category> category = new  ArrayList<Category>();
	
	@ManyToOne 
	private Question question;
	
	
	
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public List<Category> getCategory() {
		return category;
	}
	public void setCategory(List<Category> category) {
		this.category = category;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public List<Exam> getExam() {
		return exam;
	}
	public void setExam(List<Exam> exam) {
		this.exam = exam;
	}
	public int getScId() {
		return scId;
	}
	public void setScId(int scId) {
		this.scId = scId;
	}
	public String getSubcategoryName() {
		return subcategoryName;
	}
	public void setSubcategoryName(String subcategoryName) {
		this.subcategoryName = subcategoryName;
	}
	public int getSubcategoryStatus() {
		return subcategoryStatus;
	}
	public void setSubcategoryStatus(int subcategoryStatus) {
		this.subcategoryStatus = subcategoryStatus;
	}
	
	
}
