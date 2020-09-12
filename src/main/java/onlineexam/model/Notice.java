package onlineexam.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Notice {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int nId;
	private String noticeSubject;
	private Date noticeDate;
	private String notice;
	private int status;
	
	private List<NoticeCenter> noticecenter = new  ArrayList<NoticeCenter>();
	
	private List<NoticeStudent> noticestudent = new  ArrayList<NoticeStudent>();
	
	

	public List<NoticeStudent> getNoticestudent() {
		return noticestudent;
	}
	public void setNoticestudent(List<NoticeStudent> noticestudent) {
		this.noticestudent = noticestudent;
	}
	public List<NoticeCenter> getNoticecenter() {
		return noticecenter;
	}
	public void setNoticecenter(List<NoticeCenter> noticecenter) {
		this.noticecenter = noticecenter;
	}
	public int getnId() {
		return nId;
	}
	public void setnId(int nId) {
		this.nId = nId;
	}
	public String getNoticeSubject() {
		return noticeSubject;
	}
	public void setNoticeSubject(String noticeSubject) {
		this.noticeSubject = noticeSubject;
	}
	public Date getNoticeDate() {
		return noticeDate;
	}
	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}
	public String getNotice() {
		return notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
}
