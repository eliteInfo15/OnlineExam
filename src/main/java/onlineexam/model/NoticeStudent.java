package onlineexam.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class NoticeStudent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
 
	private int nsId;
	private Date noticeDate;
	
	@ManyToMany(mappedBy ="noticestudent")
	private List<Center> center= new  ArrayList<Center>();
	
	@ManyToMany(mappedBy ="noticestudent")
	private List<Notice> notice= new  ArrayList<Notice>();
	
	@ManyToMany(mappedBy ="noticestudent")
	private List<Student> student= new  ArrayList<Student>();
	
	
	
	
	public List<Center> getCenter() {
		return center;
	}
	public void setCenter(List<Center> center) {
		this.center = center;
	}
	public List<Notice> getNotice() {
		return notice;
	}
	public void setNotice(List<Notice> notice) {
		this.notice = notice;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	public int getNsId() {
		return nsId;
	}
	public void setNsId(int nsId) {
		this.nsId = nsId;
	}
	public Date getNoticeDate() {
		return noticeDate;
	}
	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}
	
	
}
