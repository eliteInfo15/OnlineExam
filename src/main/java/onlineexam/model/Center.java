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
public class Center {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int c_id;
	private String centrename;
	private String centreaddress;
	private String centrecode;
	private String centrelogo;
	private String location;
	private String phoneno;
	private String email;
	private String username;
	private String password;
	private String password_md5;
	private String themeId;
    private int centreStatus;
    private String aboutCenter;
   
    @ManyToOne 
	private Student student;
   
    @OneToMany(mappedBy  ="center")
	private List<Exam> exam = new  ArrayList<Exam>();
    
    private List<NoticeCenter> noticecenter = new  ArrayList<NoticeCenter>();
    private List<NoticeStudent> noticestudent = new  ArrayList<NoticeStudent>();
    
    public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	public List<NoticeStudent> getNoticestudent() {
		return noticestudent;
	}
	public void setNoticestudent(List<NoticeStudent> noticestudent) {
		this.noticestudent = noticestudent;
	}
	public List<Exam> getExam() {
		return exam;
	}
	public void setExam(List<Exam> exam) {
		this.exam = exam;
	}
	public List<NoticeCenter> getNoticecenter() {
		return noticecenter;
	}
	public void setNoticecenter(List<NoticeCenter> noticecenter) {
		this.noticecenter = noticecenter;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getCentrename() {
		return centrename;
	}
	public void setCentrename(String centrename) {
		this.centrename = centrename;
	}
	public String getCentreaddress() {
		return centreaddress;
	}
	public void setCentreaddress(String centreaddress) {
		this.centreaddress = centreaddress;
	}
	public String getCentrecode() {
		return centrecode;
	}
	public void setCentrecode(String centrecode) {
		this.centrecode = centrecode;
	}
	public String getCentrelogo() {
		return centrelogo;
	}
	public void setCentrelogo(String centrelogo) {
		this.centrelogo = centrelogo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getPassword_md5() {
		return password_md5;
	}
	public void setPassword_md5(String password_md5) {
		this.password_md5 = password_md5;
	}
	public String getThemeId() {
		return themeId;
	}
	public void setThemeId(String themeId) {
		this.themeId = themeId;
	}
	public int getCentreStatus() {
		return centreStatus;
	}
	public void setCentreStatus(int centreStatus) {
		this.centreStatus = centreStatus;
	}
	public String getAboutCenter() {
		return aboutCenter;
	}
	public void setAboutCenter(String aboutCenter) {
		this.aboutCenter = aboutCenter;
	}
	
	
	
}
