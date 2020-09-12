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
public class NoticeCenter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int ncId;
	private Date noticeDate;
	
	@ManyToMany(mappedBy ="noticecenter")
	private List<Center> center= new  ArrayList<Center>();
	
	@ManyToMany(mappedBy ="noticecenter")
	private List<Notice> notice= new  ArrayList<Notice>();
	
	
	
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
	public int getNcId() {
		return ncId;
	}
	public void setNcId(int ncId) {
		this.ncId = ncId;
	}
	public Date getNoticeDate() {
		return noticeDate;
	}
	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}
	
}
