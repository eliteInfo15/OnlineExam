package onlineexam.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class MainExamStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	private int status;
	private String startTime;
	private String endTime;
	private int noOfattempts;
	private String passFail;
	private int negativeMarks;
	private int totalQuestion;
	private float userScore;
	private float passingScore;
	private float totalScore;
	
	@ManyToMany(mappedBy ="exam")
	private List<Exam> exam = new  ArrayList<Exam>();
	@ManyToMany(mappedBy ="student")
	private List<Student> student= new  ArrayList<Student>();
	
	
	public List<Exam> getExam() {
		return exam;
	}
	public void setExam(List<Exam> exam) {
		this.exam = exam;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getNegativeMarks() {
		return negativeMarks;
	}
	public void setNegativeMarks(int negativeMarks) {
		this.negativeMarks = negativeMarks;
	}
	public int getTotalQuestion() {
		return totalQuestion;
	}
	public void setTotalQuestion(int totalQuestion) {
		this.totalQuestion = totalQuestion;
	}
	public float getUserScore() {
		return userScore;
	}
	public void setUserScore(float userScore) {
		this.userScore = userScore;
	}
	public float getPassingScore() {
		return passingScore;
	}
	public void setPassingScore(float passingScore) {
		this.passingScore = passingScore;
	}
	public float getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(float totalScore) {
		this.totalScore = totalScore;
	}
	
	
}
