package onlineexam.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Exam {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int eId;
	private String examName;
	private int examStatus;
	private Date examDate;
	private String examTime;
	private String examDuration;
	private int negMarkstatus;
	private int negativeMarks;
	private int timeReduction;
	private int passingPercentage;
	private int reExamday;
	private String termsCondition;
	private int resultsShowonmail;
	private String showQuestion;
	private String sortOrder;
	@ManyToOne
	private Category category;
	@ManyToOne 
	private SubCategory subcategory;
	@ManyToOne 
	private Center center;
	@ManyToOne 
	private Subject subject;
	private List<MainExamStatus> mainexamstatus = new  ArrayList<MainExamStatus>();
	
	public List<MainExamStatus> getMainexamstatus() {
		return mainexamstatus;
	}
	public void setMainexamstatus(List<MainExamStatus> mainexamstatus) {
		this.mainexamstatus = mainexamstatus;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public SubCategory getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(SubCategory subcategory) {
		this.subcategory = subcategory;
	}
	public Center getCenter() {
		return center;
	}
	public void setCenter(Center center) {
		this.center = center;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public int getExamStatus() {
		return examStatus;
	}
	public void setExamStatus(int examStatus) {
		this.examStatus = examStatus;
	}
	public Date getExamDate() {
		return examDate;
	}
	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}
	public String getExamTime() {
		return examTime;
	}
	public void setExamTime(String examTime) {
		this.examTime = examTime;
	}
	public String getExamDuration() {
		return examDuration;
	}
	public void setExamDuration(String examDuration) {
		this.examDuration = examDuration;
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
	public int getTimeReduction() {
		return timeReduction;
	}
	public void setTimeReduction(int timeReduction) {
		this.timeReduction = timeReduction;
	}
	public int getPassingPercentage() {
		return passingPercentage;
	}
	public void setPassingPercentage(int passingPercentage) {
		this.passingPercentage = passingPercentage;
	}
	public int getReExamday() {
		return reExamday;
	}
	public void setReExamday(int reExamday) {
		this.reExamday = reExamday;
	}
	public String getTermsCondition() {
		return termsCondition;
	}
	public void setTermsCondition(String termsCondition) {
		this.termsCondition = termsCondition;
	}
	public int getResultsShowonmail() {
		return resultsShowonmail;
	}
	public void setResultsShowonmail(int resultsShowonmail) {
		this.resultsShowonmail = resultsShowonmail;
	}
	public String getShowQuestion() {
		return showQuestion;
	}
	public void setShowQuestion(String showQuestion) {
		this.showQuestion = showQuestion;
	}
	public String getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}
	
	
}
