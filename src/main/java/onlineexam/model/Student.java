package onlineexam.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int studentId;
	private String studentName;
	private String studentFather;
	private String studentMother;
	private String studentDob;
	private String address;
	private String studentPhone;
	private String studentEmail;
	private String username;
	private String password;
	private int studentStatus;
	

	@OneToMany(mappedBy  ="student")
	private List<Category> category = new  ArrayList<Category>();
	
	@OneToMany(mappedBy  ="student")
	private List<SubCategory> subcategory = new  ArrayList<SubCategory>();
	
	@OneToMany(mappedBy  ="student")
	private List<Center> center= new  ArrayList<Center>();
	
	@OneToMany(mappedBy  ="student")
	private List<Batch> batch = new  ArrayList<Batch>();
	
	
	private List<MainExamStatus> mainexamstatus = new  ArrayList<MainExamStatus>();
	private List<NoticeStudent> noticestudent = new  ArrayList<NoticeStudent>();
	
	
	
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
	public List<Center> getCenter() {
		return center;
	}
	public void setCenter(List<Center> center) {
		this.center = center;
	}
	public List<Batch> getBatch() {
		return batch;
	}
	public void setBatch(List<Batch> batch) {
		this.batch = batch;
	}
	public List<NoticeStudent> getNoticestudent() {
		return noticestudent;
	}
	public void setNoticestudent(List<NoticeStudent> noticestudent) {
		this.noticestudent = noticestudent;
	}
	public List<MainExamStatus> getMainexamstatus() {
		return mainexamstatus;
	}
	public void setMainexamstatus(List<MainExamStatus> mainexamstatus) {
		this.mainexamstatus = mainexamstatus;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentFather() {
		return studentFather;
	}
	public void setStudentFather(String studentFather) {
		this.studentFather = studentFather;
	}
	public String getStudentMother() {
		return studentMother;
	}
	public void setStudentMother(String studentMother) {
		this.studentMother = studentMother;
	}
	public String getStudentDob() {
		return studentDob;
	}
	public void setStudentDob(String studentDob) {
		this.studentDob = studentDob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStudentPhone() {
		return studentPhone;
	}
	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStudentStatus() {
		return studentStatus;
	}
	public void setStudentStatus(int studentStatus) {
		this.studentStatus = studentStatus;
	}
	
}
